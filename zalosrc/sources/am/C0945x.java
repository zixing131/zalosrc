package am;

import java.util.HashSet;
import java.util.Set;

/* renamed from: am.x */
/* loaded from: classes3.dex */
public class C0945x {

    /* renamed from: a */
    int f3450a = 0;

    /* renamed from: b */
    Set f3451b = new HashSet();

    /* renamed from: a */
    public void m4487a(int i11, String str) {
        if (i11 == 1) {
            this.f3451b.add(str);
            return;
        }
        if (i11 == 2) {
            this.f3451b.add("group_" + str);
        }
    }

    /* renamed from: b */
    public boolean m4488b(long j11, int i11) {
        String valueOf;
        if (i11 == 1) {
            valueOf = "group_" + j11;
        } else {
            valueOf = String.valueOf(j11);
        }
        return this.f3451b.contains(valueOf);
    }

    /* renamed from: c */
    public String m4489c() {
        StringBuilder sb2 = new StringBuilder("\n---HBI---\n");
        sb2.append("[ \n");
        sb2.append("rc: ");
        sb2.append(m4490d());
        sb2.append("\n");
        sb2.append("ltid: {");
        for (String str : m4491e()) {
            sb2.append(" ");
            sb2.append(str);
        }
        sb2.append("}\n]");
        return sb2.toString();
    }

    /* renamed from: d */
    public int m4490d() {
        return this.f3450a;
    }

    /* renamed from: e */
    public Set m4491e() {
        return this.f3451b;
    }

    /* renamed from: f */
    public boolean m4492f() {
        if (this.f3451b.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void m4493g(int i11) {
        this.f3450a = i11;
    }
}
