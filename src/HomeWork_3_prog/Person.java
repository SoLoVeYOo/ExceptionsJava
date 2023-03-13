package HomeWork_3_prog;

import java.util.ArrayList;

public class Person {
    String surname;
    String name;
    String patronymic;
    String birthDay;
    long phoneNumber;
    char sex;

    public Person(String surname, String name, String patronymic, String birthDay, long phoneNumber, char sex) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDay = birthDay;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthday) {
        this.birthDay = birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return this.surname + " | " + this.name + " | " + this.patronymic + " | " + this.birthDay + " | " + this.phoneNumber + " | " + this.sex;
    }

    public String toStringPerson() {
        String personInfoString = this.surname + " | " + this.name + " | " + this.patronymic + " | " + this.birthDay + " | " + this.phoneNumber + " | " + this.sex;
        return personInfoString;
    }

    public static Person ParsingPersonInfo(ArrayList<String> infoNewPerson) throws Exception {
        Person newPerson = new Person(null, null, null, null, 0, 'g');

        for (String i : infoNewPerson) {
            if (i.matches("[а-яA-Я]+") && i.length() > 1) {
                if (newPerson.getSurname() == null) {
                    newPerson.setSurname(i);
                } else if (newPerson.getName() == null) {
                    newPerson.setName(i);
                } else {
                    newPerson.setPatronymic(i);
                }
            }

            if (i.matches("\\d{2}.\\d{2}.\\d{4}")) {
                newPerson.setBirthDay(i);
            }

            if (i.matches("[0-9]+") && i.length() == 11) {
                newPerson.setPhoneNumber(Long.parseLong(i));
            }

            if (i.equals("f") || i.equals("m")) {
                newPerson.setSex(i.charAt(0));
            }
        }

        new CheckPersonInfo(newPerson);

        return newPerson;
    }
}
