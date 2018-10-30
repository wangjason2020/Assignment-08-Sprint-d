public class Main {

    public static double effort, capacity, percent;

    public static void main(String[] args) {
	// write your code here
        effort=100+50+20+360+80+160+500+240+40+40;

        capacity(8,3,40);
        capacity(9,3,40);
        capacity(10,3,40);
        capacity(11,3,40);
        capacity(8,4,40);
        capacity(8,5,40);
        capacity(8,6,40);

        capacity(8,3,35);
        capacity(9,3,35);
        capacity(10,3,35);
        capacity(11,3,35);
        capacity(8,4,35);
        capacity(8,5,35);
        capacity(8,6,35);

        capacity(8,3,30);
        capacity(9,3,30);
        capacity(10,3,30);
        capacity(11,3,30);
        capacity(8,4,30);
        capacity(8,5,30);
        capacity(8,6,30);
    }

    public static void capacity(int engineers, int length, int hours) {
        capacity=engineers*length*hours;
        int percent=(int)(100*(effort/capacity));
        System.out.println("With "+engineers+" devs working a "+length+" week sprint, for "+hours+" hrs/wk, we would be at "+percent+"% of capacity.");
    }
}
