package e70;

import android.os.Bundle;
import com.zing.zalo.control.ContactProfile;
import p205hc.InterfaceC19969h;
import vg.C28203u6;

/* renamed from: e70.a */
/* loaded from: classes5.dex */
public class C18275a implements InterfaceC19969h {

    /* renamed from: a */
    public String f92521a = "";

    /* renamed from: b */
    public String f92522b = "";

    /* renamed from: c */
    public String f92523c = "";

    /* renamed from: a */
    public static C18275a m97108a(Bundle bundle) {
        C18275a c18275a = new C18275a();
        if (bundle != null) {
            c18275a.f92521a = bundle.getString("extra_conversation_id", "");
            c18275a.f92522b = bundle.getString("extra_display_name", "");
            c18275a.f92523c = bundle.getString("STR_SOURCE_START_VIEW", "");
            ContactProfile m141809c = C28203u6.f131407a.m141809c(c18275a.f92521a);
            if (m141809c != null) {
                c18275a.f92522b = m141809c.m40383Q(true, false);
            }
        }
        return c18275a;
    }
}
