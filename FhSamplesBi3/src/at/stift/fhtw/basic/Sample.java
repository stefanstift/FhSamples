package at.stift.fhtw.basic;

public class Sample {

    public static int instanceCount = 0;

    private int member;

    private boolean valid = true;

    // Default Constructor
    public Sample() {
        instanceCount++;
    }

    public Sample(int member) {
        instanceCount++;
        this.member = member;
    }

    public void setMember(int member) {
        this.member = member;
    }

    public int getMember() {
        return member;
    }

    public boolean isValid() {
        return valid;
    }

    /**
     * Show difference of instance variable vs. static variable
     *
     * @param strings
     */
    public static void main(String ... strings) {
        Sample objectOfSample = new Sample(12);
        System.out.println("Instance var: " + objectOfSample.getMember());
        System.out.println("Static class var: " + objectOfSample.instanceCount);

        Sample objectOfSample2 = new Sample(15);
        System.out.println("Instance var: " + objectOfSample2.getMember());
        System.out.println("Static class var: " + objectOfSample2.instanceCount);

        Sample objectOfSample3 = new Sample(14);
        objectOfSample3.setMember(120);
        System.out.println("Instance var: " + objectOfSample3.getMember());

        System.out.println("Static class var: " + objectOfSample.instanceCount);

    }

}
