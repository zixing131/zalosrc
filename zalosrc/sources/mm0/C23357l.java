package mm0;

import java.util.Vector;

/* renamed from: mm0.l */
/* loaded from: classes.dex */
public class C23357l {

    /* renamed from: a */
    public Vector f113577a = new Vector();

    /* renamed from: a */
    public void m122801a(String str) {
        this.f113577a.addElement(str);
    }

    /* renamed from: b */
    public String m122802b(int i11) {
        return (String) this.f113577a.elementAt(i11);
    }

    /* renamed from: c */
    public int m122803c() {
        return this.f113577a.size();
    }

    /* renamed from: d */
    public void m122804d() {
        boolean z11;
        do {
            int i11 = 0;
            z11 = true;
            while (i11 < this.f113577a.size() - 1) {
                String str = (String) this.f113577a.elementAt(i11);
                int i12 = i11 + 1;
                String str2 = (String) this.f113577a.elementAt(i12);
                if (str.compareTo(str2) > 0) {
                    this.f113577a.setElementAt(str2, i11);
                    this.f113577a.setElementAt(str, i12);
                    z11 = false;
                }
                i11 = i12;
            }
        } while (!z11);
    }
}
