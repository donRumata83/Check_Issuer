package Body.Model.Parser;

import Body.Model.Cheque;


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class SimpleFileParser implements Paser {
    private String fileName;
    private List<Cheque> list;
    private SimpleDateFormat format;


    public SimpleFileParser(String fileName) {
        this.fileName = fileName;
        this.list = new ArrayList<>();
        this.format = new SimpleDateFormat("dd MMMMMMMM yyyy", Locale.ROOT);
        parse();
    }

    private void parse() {
        File storage = new File(fileName);
        String[] array;
        try (BufferedReader reader = new BufferedReader(new FileReader(storage))) {
            while (reader.ready()) {
                array = reader.readLine().split("\t");
                list.add(new Cheque(array[0], array[1], array[2], format.parse(array[3]), Double.parseDouble(array[4])));
            }
        } catch (IOException e) {
        } catch (ParseException e) {
        }
    }

    @Override
    public void addCheque(Cheque cheque) {
        list.add(cheque);
    }

    private void save() {
        StringBuilder stringBuilder;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(fileName)))) {
            for (Cheque cheque : list) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(cheque.getNumber()).append("\t");
                stringBuilder.append(cheque.getCustomer()).append("\t");
                stringBuilder.append(cheque.getProduct()).append("\t");
                stringBuilder.append(cheque.getDate()).append("\t");
                stringBuilder.append(cheque.getSumm()).append("\t").append("\n");
                writer.write(stringBuilder.toString());
            }
        } catch (IOException e) {
        }
    }

    @Override
    public Cheque getLast() {
        return list.get(0);
    }

    @Override
    public List<Cheque> getForDate(Date from, Date to) {
        List<Cheque> result = new ArrayList<>();
        for (Cheque cheque : list) {
            if (cheque.getDate().after(from) && cheque.getDate().before(to)) ;
            result.add(cheque);
        }
        return result;
    }

    @Override
    public Cheque getByNumber(String number) {
        for (Cheque cheque : list) {
            if (cheque.getNumber().equals(number)) return cheque;
        }
        return null;
    }

    @Override
    public List<Cheque> getByProductName(String name) {
        List<Cheque> result = new ArrayList<>();
        for (Cheque cheque : list) {
            if (cheque.getProduct().equals(name)) result.add(cheque);
        }
        return null;
    }
}
