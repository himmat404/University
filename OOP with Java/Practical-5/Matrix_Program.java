class Matrix {
    
    int rows;
    int cols;
    int elements[][];

    Matrix(){}
    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.elements = new int[rows][cols];
    }

    int getRows() {
        return rows;
    }

    int getCols() {
        return cols;
    }

    void setElement(int row, int col, int num) {
        elements[row][col] = num;
    }

    Matrix add(Matrix m1,Matrix m2) {

        if (m1.rows != m2.rows || m1.cols != m2.cols) {
            System.out.println("Matrices cannot be added");
            return null;
        }

        Matrix result = new Matrix(m1.rows, m1.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.elements[i][j] = m1.elements[i][j] + m2.elements[i][j];
            }
        }
        return result;
    }

    Matrix multiply(Matrix m1,Matrix m2) {
        if (m1.cols != m2.rows) {
            System.out.println("Matrices cannot be multiplied");
            return null;
        }

        Matrix result = new Matrix(m1.rows, m2.cols);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.cols; j++) {
                int sum = 0;
                for (int k = 0; k < m1.cols; k++) {
                    sum += m1.elements[i][k] * m2.elements[k][j];
                }
                result.elements[i][j] = sum;
            }
        }
        return result;
    }
}
public class Matrix_Program {
    public static void main(String[] args) {
        
        Matrix m1 = new Matrix(2, 3);
        Matrix m2 = new Matrix(3, 2);

        m1.setElement(0, 0, 1);
        m1.setElement(0, 1, 2);
        m1.setElement(0, 2, 3);
        m1.setElement(1, 0, 4);
        m1.setElement(1, 1, 5);
        m1.setElement(1, 2, 6);

        m2.setElement(0, 0, 7);
        m2.setElement(0, 1, 8);
        m2.setElement(1, 0, 9);
        m2.setElement(1, 1, 10);
        m2.setElement(2, 0, 11);
        m2.setElement(2, 1, 12);

        //for( int i=0;i<m1.rows;i++){}

        Matrix m3 = new Matrix();
        m3 = m3.add(m1, m2);
        if (m3 != null) {
            System.out.println("Matrix sum:");
            for (int i = 0; i < m3.getRows(); i++) {
                for (int j = 0; j < m3.getCols(); j++) {
                    System.out.print(m3.elements[i][j] + " ");
                }
                System.out.println();
            }
        }

        Matrix m4 = new Matrix();
        m4 = m4.multiply(m1,m2);
        if (m4 != null) {
            System.out.println("Matrix product:");
            for (int i = 0; i < m4.getRows(); i++) {
                for (int j = 0; j < m4.getCols(); j++) {
                    System.out.print(m4.elements[i][j] + " ");
                }
                System.out.println();
            }
        }
    }    
}