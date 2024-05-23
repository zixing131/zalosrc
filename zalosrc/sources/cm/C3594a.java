package cm;

/* renamed from: cm.a */
/* loaded from: classes3.dex */
public class C3594a {

    /* renamed from: a */
    public long f15174a;

    /* renamed from: b */
    public long f15175b;

    /* renamed from: c */
    public int f15176c;

    /* renamed from: d */
    public long f15177d;

    /* renamed from: e */
    public long f15178e;

    /* renamed from: f */
    public String f15179f;

    /* renamed from: g */
    public String f15180g;

    /* renamed from: h */
    public String f15181h;

    /* renamed from: k */
    public int f15184k = 0;

    /* renamed from: i */
    public int f15182i = -1;

    /* renamed from: j */
    public int f15183j = 0;

    /* renamed from: a */
    public String m18206a() {
        if (this.f15176c == 1) {
            return "group_" + this.f15175b;
        }
        return String.valueOf(this.f15175b);
    }

    /* renamed from: b */
    public boolean m18207b() {
        return this.f15183j == 1;
    }

    /* renamed from: c */
    public boolean m18208c() {
        return this.f15175b > 0 && this.f15182i != -1;
    }

    public String toString() {
        return "\n========ThreadsTableCross========\nuserId       : " + this.f15174a + "\nownerId      : " + this.f15175b + "\nownerType    : " + this.f15176c + "\nts           : " + this.f15177d + "\nfromId       : " + this.f15178e + "\ndisplayName  : " + this.f15179f + "\nmsg          : " + this.f15180g + "\nattach       : " + this.f15181h;
    }
}
