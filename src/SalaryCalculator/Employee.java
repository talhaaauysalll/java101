package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name,double salary,double workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if(this.salary<1000){
            return 0;
        }else {
            return salary*0.03;
        }
    }
    public double bonus(){
        if(this.workHours>40){
            double earningsPerHour=(this.workHours-40)*30;
            return earningsPerHour;
        }
        else
        {
            return 0;
        }
    }
    public double raiseSalary(){
        int salaryIncrease=2021-this.hireYear;
        if(salaryIncrease<10){
            return this.salary*0.05;
        } else if (salaryIncrease>9 && salaryIncrease<20) {
            return this.salary*0.1;
        } else if (salaryIncrease>19) {
            return this.salary*0.15;
        }
        else {
            return 0;
        }
    }
    public double salaryCalculation(){
        return (this.salary+bonus()+raiseSalary())-tax();
    }
    public void printEmployee(){
        System.out.println("Adı : "+this.name);
        System.out.println("Maaşı : "+this.salary);
        System.out.println("Çalışma Saati : "+this.workHours);
        System.out.println("Başlangıç Yılı : "+this.hireYear);
        System.out.println("Vergi : "+this.tax());
        System.out.println("Bonus : "+this.bonus());
        System.out.println("Maaş Artışı : "+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+((this.salary+this.bonus())-tax()));
        System.out.println("Toplam Maaş : "+this.salaryCalculation());
    }
    public void run(){
        this.tax();
        this.bonus();
        this.raiseSalary();
        this.printEmployee();
    }
}
