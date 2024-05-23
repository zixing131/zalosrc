package nu;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p404ou.C24557c;

/* renamed from: nu.i */
/* loaded from: classes4.dex */
public class C23943i {

    /* renamed from: a */
    public String f115905a;

    /* renamed from: c */
    public String f115907c;

    /* renamed from: d */
    public int f115908d;

    /* renamed from: e */
    public int f115909e;

    /* renamed from: i */
    public int f115913i;

    /* renamed from: j */
    public String f115914j;

    /* renamed from: k */
    public String f115915k;

    /* renamed from: l */
    public boolean f115916l = false;

    /* renamed from: b */
    public C24557c f115906b = null;

    /* renamed from: f */
    public ArrayList f115910f = new ArrayList();

    /* renamed from: g */
    public long f115911g = 0;

    /* renamed from: h */
    public long f115912h = 0;

    public C23943i(String str, String str2, int i11, int i12) {
        this.f115905a = str;
        this.f115907c = str2;
        this.f115913i = i12;
        this.f115908d = i11;
        this.f115909e = i11 + str2.length();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public static long m125321i(long j11, int i11, int i12) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j11);
        if (i11 != 0) {
            if (i11 == 1 && calendar.getTimeInMillis() < currentTimeMillis) {
                calendar.add(i12, 1);
            }
        } else if (calendar.getTimeInMillis() > currentTimeMillis) {
            calendar.add(i12, -1);
        }
        return calendar.getTimeInMillis();
    }

    /* renamed from: a */
    public boolean mo125298a(C23938d c23938d) {
        return this.f115916l;
    }

    /* renamed from: b */
    public boolean mo125302b(C23939e c23939e) {
        return false;
    }

    /* renamed from: c */
    public void mo125316c() {
    }

    /* renamed from: d */
    public void mo125299d(int i11) {
    }

    /* renamed from: e */
    public void mo125303e(int i11, int i12) {
    }

    /* renamed from: f */
    public boolean mo125304f(String str) {
        Pattern compile = Pattern.compile("(\\b|_+),|:(\\b|_+)");
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            str = str.replaceAll(matcher.group(), "");
            matcher = compile.matcher(str);
        }
        return str.trim().isEmpty();
    }

    /* renamed from: g */
    public C23938d mo125300g(C23938d c23938d) {
        c23938d.f115877i = this.f115911g;
        c23938d.f115878j = this.f115912h;
        c23938d.f115879k.add(this);
        int i11 = c23938d.f115874f;
        int i12 = this.f115908d;
        if (i11 > i12 || i11 == -1) {
            c23938d.f115874f = i12;
        }
        int i13 = c23938d.f115875g;
        int i14 = this.f115909e;
        if (i13 < i14 || i13 == -1) {
            c23938d.f115875g = i14;
        }
        return c23938d;
    }

    /* renamed from: h */
    public C23939e mo125305h(C23939e c23939e) {
        return c23939e;
    }
}
