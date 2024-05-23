package org.webrtc;

/* loaded from: classes7.dex */
public class Size {
    public int height;
    public int width;

    public Size(int i11, int i12) {
        this.width = i11;
        this.height = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        if (this.width != size.width || this.height != size.height) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.width * 65537) + 1 + this.height;
    }

    public String toString() {
        return this.width + "x" + this.height;
    }
}
