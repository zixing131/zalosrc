package p310l0;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19179b;
import p175g0.AbstractC19181d;
import p175g0.AbstractC19187j;

/* renamed from: l0.a */
/* loaded from: classes2.dex */
public class C21980a {

    /* renamed from: a */
    private Context f108238a;

    private C21980a(Context context) {
        this.f108238a = context;
    }

    /* renamed from: b */
    public static C21980a m114787b(Context context) {
        return new C21980a(context);
    }

    /* renamed from: a */
    public boolean m114788a() {
        if (this.f108238a.getApplicationInfo().targetSdkVersion < 14) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m114789c() {
        return this.f108238a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m114790d() {
        Configuration configuration = this.f108238a.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i11 <= 600) {
            if (i11 <= 960 || i12 <= 720) {
                if (i11 <= 720 || i12 <= 960) {
                    if (i11 < 500) {
                        if (i11 <= 640 || i12 <= 480) {
                            if (i11 <= 480 || i12 <= 640) {
                                if (i11 >= 360) {
                                    return 3;
                                }
                                return 2;
                            }
                            return 4;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 5;
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: e */
    public int m114791e() {
        return this.f108238a.getResources().getDimensionPixelSize(AbstractC19181d.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int m114792f() {
        TypedArray obtainStyledAttributes = this.f108238a.obtainStyledAttributes(null, AbstractC19187j.ActionBar, AbstractC19178a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(AbstractC19187j.ActionBar_height, 0);
        Resources resources = this.f108238a.getResources();
        if (!m114793g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(AbstractC19181d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m114793g() {
        return this.f108238a.getResources().getBoolean(AbstractC19179b.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean m114794h() {
        return true;
    }
}
