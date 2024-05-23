package nu;

import android.text.TextUtils;
import java.util.Calendar;
import p404ou.C24555a;

/* renamed from: nu.f */
/* loaded from: classes4.dex */
public class C23940f extends C23943i {
    public C23940f(String str, String str2, int i11, int i12) {
        super(str, str2, i11, i12);
    }

    @Override // nu.C23943i
    /* renamed from: a */
    public boolean mo125298a(C23938d c23938d) {
        if (!super.mo125298a(c23938d) || c23938d.f115870b != null || c23938d.f115873e != null || c23938d.f115869a != null || c23938d.f115872d != null) {
            return false;
        }
        if (c23938d.f115871c != null && this.f115910f.size() == 2) {
            return false;
        }
        return true;
    }

    @Override // nu.C23943i
    /* renamed from: e */
    public void mo125303e(int i11, int i12) {
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        calendar.set(2, i11);
        if (this.f115910f.size() == 2 && !TextUtils.isEmpty(((C24555a) this.f115910f.get(1)).f118238a)) {
            calendar.set(1, Integer.parseInt(((C24555a) this.f115910f.get(1)).f118238a.trim()));
        } else {
            this.f115916l = true;
        }
        calendar.set(5, 1);
        this.f115911g = calendar.getTimeInMillis();
        calendar.add(2, 1);
        calendar.add(5, -1);
        this.f115912h = calendar.getTimeInMillis();
    }

    @Override // nu.C23943i
    /* renamed from: g */
    public C23938d mo125300g(C23938d c23938d) {
        if (c23938d.f115871c != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f115911g);
            calendar.set(1, c23938d.f115871c.f115918m);
            c23938d.f115877i = calendar.getTimeInMillis();
            calendar.setTimeInMillis(this.f115912h);
            calendar.set(1, c23938d.f115871c.f115918m);
            c23938d.f115878j = calendar.getTimeInMillis();
        } else {
            c23938d.f115877i = this.f115911g;
            c23938d.f115878j = this.f115912h;
        }
        c23938d.f115879k.add(this);
        c23938d.f115870b = this;
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
}
