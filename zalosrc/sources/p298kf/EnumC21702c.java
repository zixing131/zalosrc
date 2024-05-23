package p298kf;

import android.graphics.Typeface;
import com.zing.zalo.MainApplication;
import me0.AbstractC23222t7;
import p100df.AbstractC17909a;

/* renamed from: kf.c */
/* loaded from: classes3.dex */
public enum EnumC21702c {
    Roboto_Bold(1, "Basic", "fonts/Roboto-Bold.ttf", 1, AbstractC23222t7.f112533L),
    DancingScript_Bold(5, "Script", "fonts/camera/DancingScript-Bold.ttf", 5, AbstractC23222t7.f112533L),
    Pangolin_Regular(8, "Pangolin", "fonts/camera/Pangolin-Regular.ttf", 8, AbstractC23222t7.f112533L);


    /* renamed from: p */
    final int f105409p;

    /* renamed from: q */
    final String f105410q;

    /* renamed from: r */
    final String f105411r;

    /* renamed from: s */
    final Typeface f105412s;

    /* renamed from: t */
    final int f105413t;

    EnumC21702c(int i11, String str, String str2, int i12, int i13) {
        this.f105409p = i11;
        this.f105410q = str;
        this.f105411r = str2;
        this.f105412s = AbstractC17909a.m94485b(MainApplication.getAppContext(), i12);
        this.f105413t = i13;
    }

    /* renamed from: c */
    public String m112005c() {
        return this.f105411r;
    }

    /* renamed from: d */
    public int m112006d() {
        return this.f105409p;
    }

    /* renamed from: e */
    public int m112007e() {
        return this.f105413t;
    }

    /* renamed from: g */
    public String m112008g() {
        return this.f105410q;
    }

    /* renamed from: h */
    public Typeface m112009h() {
        return this.f105412s;
    }
}
