package com.zing.zalo.location;

import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.location.b */
/* loaded from: classes4.dex */
public class C8956b {

    /* renamed from: a */
    public String f47899a;

    /* renamed from: b */
    public int f47900b;

    /* renamed from: c */
    public int f47901c = 0;

    /* renamed from: d */
    public int f47902d = 0;

    /* renamed from: e */
    public ContactProfile f47903e;

    /* renamed from: a */
    public String m47864a() {
        int i11;
        ContactProfile contactProfile = this.f47903e;
        if (contactProfile != null && (i11 = this.f47900b) > 0) {
            if (i11 > 1) {
                return AbstractC23136l9.m118746s0(AbstractC8020f0.str_live_location_bar_invite_share_title_and_other, Integer.valueOf(i11));
            }
            return AbstractC23136l9.m118746s0(AbstractC8020f0.str_live_location_bar_invite_share_title, contactProfile.m40383Q(true, false));
        }
        return "";
    }
}
