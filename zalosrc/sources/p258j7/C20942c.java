package p258j7;

import java.util.ArrayList;
import java.util.List;

/* renamed from: j7.c */
/* loaded from: classes3.dex */
public class C20942c {

    /* renamed from: a */
    private final List f102823a;

    /* renamed from: b */
    private final List f102824b;

    /* renamed from: j7.c$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private final List f102825a = new ArrayList();

        /* renamed from: b */
        private final List f102826b = new ArrayList();

        /* synthetic */ a(AbstractC20966o abstractC20966o) {
        }

        /* renamed from: a */
        public a m109473a(String str) {
            this.f102825a.add(str);
            return this;
        }

        /* renamed from: b */
        public C20942c m109474b() {
            return new C20942c(this, null);
        }
    }

    /* synthetic */ C20942c(a aVar, AbstractC20968p abstractC20968p) {
        this.f102823a = new ArrayList(aVar.f102825a);
        this.f102824b = new ArrayList(aVar.f102826b);
    }

    /* renamed from: c */
    public static a m109468c() {
        return new a(null);
    }

    /* renamed from: a */
    public List m109469a() {
        return this.f102824b;
    }

    /* renamed from: b */
    public List m109470b() {
        return this.f102823a;
    }

    public String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", this.f102823a, this.f102824b);
    }
}
