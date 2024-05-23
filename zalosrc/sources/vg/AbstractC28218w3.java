package vg;

import android.text.TextUtils;
import com.zing.zalo.control.ContactProfile;

/* renamed from: vg.w3 */
/* loaded from: classes3.dex */
public abstract class AbstractC28218w3 {
    /* renamed from: a */
    public static String m142177a(ContactProfile contactProfile) {
        String str;
        if (contactProfile == null) {
            str = "";
        } else {
            str = contactProfile.m40360C();
            if (TextUtils.isEmpty(str)) {
                str = contactProfile.m40378N();
                if (TextUtils.isEmpty(str)) {
                    str = contactProfile.f42437s;
                }
            }
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
