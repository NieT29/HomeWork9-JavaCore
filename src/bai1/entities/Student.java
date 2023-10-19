package bai1.entities;

public class Student {
    private static int autoId;
    private int id;
    private String name;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;

    public Student(int id) {
        this.id = ++autoId;
    }

    public Student(String name, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }

    public String classify() {
        double avgScore = (scoreMath+scorePhysic+scoreChemistry)/3;
        if (avgScore>=8) return "Xếp loại A";
        else if (avgScore<8 && avgScore>=6.5) return "Xếp loại B";
        return "Xếp loại C";
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scoreMath=" + scoreMath +
                ", scorePhysic=" + scorePhysic +
                ", scoreChemistry=" + scoreChemistry +
                '}';
    }
}


