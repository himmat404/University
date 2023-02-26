class Matrix {
    int numRows;
    int numCols;
    int[][] elements;

    Matrix(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.elements = new int[numRows][numCols];
    }

    int getNumRows() {
        return numRows;
    }

    int getNumCols() {
        return numCols;
    }

    void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }
}
public class Matrix_Program {
    public static void main(String[] args) {
        Matrix m = new Matrix(3, 4);
        System.out.println("Number of rows: " + m.getNumRows());
        System.out.println("Number of columns: " + m.getNumCols());
        m.setElement(1, 2, 5);
        System.out.println("Element at (1,2): " + m.elements[1][2]);
    }
}
