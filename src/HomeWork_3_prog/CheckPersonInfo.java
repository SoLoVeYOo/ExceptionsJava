package HomeWork_3_prog;


public class CheckPersonInfo {
    public CheckPersonInfo(Person person) throws Exception {
        try {
            if (person.getSurname() == null || person.getName() == null || person.getPatronymic() == null) {
                throw new NullPointerException("'Name' or 'Surname' or 'Patronymic' is incorrect");
            }
            if (person.getBirthDay() == null) {
                throw new NullPointerException("BirthDay is incorrect, please, enter dd.mm.yyyy");
            }
            if (person.getPhoneNumber() == 0) {
                throw new NumberFormatException("PhoneNumber is incorrect, please, enter 11 digits");
            }
            if (person.getSex() == 'g') {
                throw new NullPointerException("Gender is incorrect, please, enter 'm' or 'f'");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}