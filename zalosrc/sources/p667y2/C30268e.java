package p667y2;

import java.util.List;
import p116e.C18151b;
import p116e.C18153d;

/* renamed from: y2.e */
/* loaded from: classes2.dex */
public final class C30268e {

    /* renamed from: a */
    public static final String f140632a = "e";

    /* renamed from: b */
    private static C30268e f140633b;

    private C30268e() {
    }

    /* renamed from: b */
    public static C30268e m149370b() {
        if (f140633b == null) {
            f140633b = new C30268e();
        }
        return f140633b;
    }

    /* renamed from: a */
    public List m149371a(String str) {
        try {
            return (List) m149373d().m96447b(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public boolean m149372c(String str, List list) {
        try {
            m149373d().m96448c(str, list);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public C18153d m149373d() {
        try {
            return C18151b.m96441a().m96442b(f140632a, 1024);
        } catch (Exception unused) {
            return null;
        }
    }
}
