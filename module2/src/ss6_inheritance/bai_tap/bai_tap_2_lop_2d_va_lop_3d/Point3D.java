package ss6_inheritance.bai_tap.bai_tap_2_lop_2d_va_lop_3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrayXYZ = new float[3];
        arrayXYZ[0] = super.getX();
        arrayXYZ[1] = super.getY();
        arrayXYZ[2] = this.z;
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return "Point3D: (x,y,z) = (" + super.getX() + ", " + super.getY() + ", " + z + ")";
    }
}
