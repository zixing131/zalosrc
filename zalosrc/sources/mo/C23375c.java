package mo;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalocore.CoreUtility;

/* renamed from: mo.c */
/* loaded from: classes4.dex */
public class C23375c {

    /* renamed from: a */
    public boolean f113590a;

    /* renamed from: b */
    public boolean f113591b;

    /* renamed from: c */
    public boolean f113592c;

    /* renamed from: d */
    public boolean f113593d;

    /* renamed from: e */
    public boolean f113594e;

    /* renamed from: f */
    public boolean f113595f;

    /* renamed from: g */
    public boolean f113596g;

    private C23375c(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        this.f113590a = z11;
        this.f113591b = z12;
        this.f113592c = z13;
        this.f113593d = z14;
        this.f113594e = z15;
        this.f113595f = z16;
        this.f113596g = z17;
    }

    /* renamed from: a */
    public static C23375c m122870a(ItemAlbumMobile itemAlbumMobile, ContactProfile contactProfile, String str, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z21;
        boolean z22;
        if (itemAlbumMobile != null && contactProfile != null) {
            if (!TextUtils.equals(str, CoreUtility.f89233i)) {
                boolean z23 = !TextUtils.isEmpty(itemAlbumMobile.m40499H());
                if (contactProfile.m40387S0() && !z12 && !z13 && z14) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                z16 = z23;
                z18 = z22;
                z17 = true;
            } else {
                z16 = false;
                z17 = false;
                z18 = false;
            }
            int i11 = itemAlbumMobile.f42590o0;
            if ((i11 == 2 || i11 == 17) && z15) {
                z19 = true;
            } else {
                z19 = false;
            }
            boolean z24 = itemAlbumMobile.f42568S;
            if (TextUtils.equals(str, CoreUtility.f89233i) && !z19) {
                z21 = false;
            } else {
                z21 = true;
            }
            return new C23375c(z16, z11, z17, z18, z19, z24, z21);
        }
        return null;
    }
}
