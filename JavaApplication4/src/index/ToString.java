package index;

public class ToString {
	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
