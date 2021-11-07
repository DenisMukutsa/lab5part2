package lab5_part2;


public interface Functional {

    default double square1 (double intervalX, double intervalY, int parts) {
        double a = intervalX;
        double b = intervalY;
        double x = 0;
        double base = (b-a) / parts;

        for(int i = 0; i < parts; i++) {
        x += function1((a+base/2)) * base;
        a += base;
        }
        return x;
    }

    default double function1(double parameter) {
        double result = Math.log(parameter);
        return result;
    }

    static double square2 (double intervalX, double intervalY, int parts) {
        double a = intervalX;
        double b = intervalY;
        double x = 0;
        double base = (b-a) / parts;

        for(int i = 0; i < parts; i++) {
            x += function2((a+base/2)) * base;
            a += base;
        }
        return x;

    }

    static double function2(double parameter) {
        double result = Math.pow(parameter, 2) + parameter;
        return result;
    }

    default double square3 (double intervalX, double intervalY, int parts) {
        double a = intervalX;
        double b = intervalY;
        double x = 0;
        double base = (b-a) / parts;

        for(int i = 0; i < parts; i++) {
            x += function3((a+base/2)) * base;
            a += base;
        }
        return x;
    }

    default double function3(double parameter) {
        double result = Math.exp(-parameter);
        return result;
    }

    default double square4 (double intervalX, double intervalY, int parts) {
        double a = intervalX;
        double b = intervalY;
        double x = 0;
        double base = (b-a) / parts;

        for(int i = 0; i < parts; i++) {
            x += function4((a+base/2)) * base;
            a += base;
        }
        return x;
    }

    default double function4(double parameter) {
        double result = Math.pow(parameter, 2);
        return result;
    }

    default double square5 (double intervalX, double intervalY, int parts) {
        double a = intervalX;
        double b = intervalY;
        double x = 0;
        double base = (b-a) / parts;

        for(int i = 0; i < parts; i++) {
            x += function5((a+base/2)) * base;
            a += base;
        }
        return x;
    }

    default double function5(double parameter) {
        double result = parameter * Math.sin(parameter);
        return result;
    }
}
