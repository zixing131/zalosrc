package nu;

import android.text.TextUtils;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p404ou.C24555a;

/* renamed from: nu.h */
/* loaded from: classes4.dex */
public class C23942h extends C23943i {

    /* renamed from: m */
    public int f115901m;

    /* renamed from: n */
    public int f115902n;

    /* renamed from: o */
    public boolean f115903o;

    /* renamed from: p */
    public boolean f115904p;

    public C23942h(String str, String str2, int i11, int i12) {
        super(str, str2, i11, i12);
    }

    @Override // nu.C23943i
    /* renamed from: b */
    public boolean mo125302b(C23939e c23939e) {
        if (this.f115911g == -1 || c23939e.f115885d != null) {
            return false;
        }
        return true;
    }

    @Override // nu.C23943i
    /* renamed from: c */
    public void mo125316c() {
        long j11;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i11 = 0;
            this.f115901m = Integer.parseInt(((C24555a) this.f115910f.get(0)).f118238a.trim());
            String str = ((C24555a) this.f115910f.get(1)).f118238a;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            if (!TextUtils.isEmpty(str) && str.equals("rưỡi")) {
                this.f115902n = 30;
            } else {
                if (!str.trim().isEmpty()) {
                    i11 = Integer.parseInt(str);
                }
                this.f115902n = i11;
            }
            this.f115903o = ((C24555a) this.f115910f.get(2)).f118238a.trim().equals("am");
            this.f115904p = ((C24555a) this.f115910f.get(2)).f118238a.trim().equals("pm");
            calendar.set(11, this.f115901m);
            calendar.set(12, this.f115902n);
            if (m125320m()) {
                j11 = calendar.getTimeInMillis();
            } else {
                j11 = -1;
            }
            this.f115911g = j11;
            this.f115912h = j11;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // nu.C23943i
    /* renamed from: f */
    public boolean mo125304f(String str) {
        Pattern compile = Pattern.compile("(\\b|_+)vào|lúc|tầm|khoảng|cỡ|trước|sau|đúng|:(\\b|_+)");
        Matcher matcher = compile.matcher(str);
        while (matcher.find()) {
            str = str.replaceAll(matcher.group(), "");
            matcher = compile.matcher(str);
        }
        return str.trim().isEmpty();
    }

    @Override // nu.C23943i
    /* renamed from: h */
    public C23939e mo125305h(C23939e c23939e) {
        c23939e.f115885d = this;
        int i11 = c23939e.f115893l;
        int i12 = this.f115908d;
        if (i11 > i12 || i11 == -1) {
            c23939e.f115893l = i12;
        }
        int i13 = c23939e.f115894m;
        int i14 = this.f115909e;
        if (i13 < i14 || i13 == -1) {
            c23939e.f115894m = i14;
        }
        return c23939e;
    }

    /* renamed from: j */
    public int m125317j() {
        return this.f115904p ? this.f115901m + 12 : this.f115901m;
    }

    /* renamed from: k */
    public int m125318k(int i11) {
        boolean z11 = this.f115904p;
        if (z11) {
            return this.f115901m + 12;
        }
        boolean z12 = this.f115903o;
        if (z12) {
            return this.f115901m;
        }
        if (i11 == 0 || i11 == 1) {
            return this.f115901m;
        }
        if (i11 == 2) {
            int i12 = this.f115901m;
            return (i12 < 1 || i12 > 2 || z12 || z11) ? i12 : i12 + 12;
        }
        if (i11 == 3) {
            int i13 = this.f115901m;
            return (i13 < 1 || i13 > 7 || z12 || z11) ? i13 : i13 + 12;
        }
        if (i11 == 4) {
            int i14 = this.f115901m;
            return (i14 < 5 || i14 > 11 || z12 || z11) ? i14 : i14 + 12;
        }
        if (i11 != 5) {
            return this.f115901m;
        }
        int i15 = this.f115901m;
        return (i15 < 9 || i15 > 11 || z12 || z11) ? i15 : i15 + 12;
    }

    /* renamed from: l */
    public int m125319l() {
        return this.f115902n;
    }

    /* renamed from: m */
    public boolean m125320m() {
        if (this.f115902n > 59) {
            return false;
        }
        if (this.f115903o || this.f115904p) {
            int i11 = this.f115901m;
            return i11 > 0 && i11 <= 12;
        }
        int i12 = this.f115901m;
        return i12 >= 0 && i12 <= 23;
    }
}
