package com.zing.zalo.service;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTargetService;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import java.util.ArrayList;
import java.util.List;
import kn.AbstractC21777d;
import me0.AbstractC23165o5;
import me0.AbstractC23224t9;
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p379o3.C23999j;
import p471r3.EnumC25629a;
import p716zh.C31973j5;
import q00.AbstractC24964b;
import q00.AbstractC24965c;

@TargetApi(23)
/* loaded from: classes4.dex */
public class DirectShareChooserService extends ChooserTargetService {

    /* renamed from: p */
    private static final String f49531p = DirectShareChooserService.class.getSimpleName();

    @Override // android.service.chooser.ChooserTargetService
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        C3979l c3979l;
        Icon createWithResource;
        Icon createWithBitmap;
        Icon createWithResource2;
        Icon createWithBitmap2;
        if (AbstractC23165o5.m119333b() && AbstractC23304d.f113266D0) {
            return new ArrayList();
        }
        try {
            List<ContactProfile> m112313d = AbstractC21777d.m112313d(8, false);
            if (m112313d.size() > 0) {
                C23528a c23528a = new C23528a(this);
                ArrayList arrayList = new ArrayList();
                for (ContactProfile contactProfile : m112313d) {
                    if (contactProfile != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("userId", contactProfile.f42434r);
                        bundle.putString("displayname", contactProfile.f42437s);
                        bundle.putString("avatar", contactProfile.f42446v);
                        bundle.putBoolean("fromDirectShare", true);
                        AbstractC23224t9.m119690e(bundle);
                        if (contactProfile.m40374K0()) {
                            C31973j5 m40388T = contactProfile.m40388T(false);
                            if (m40388T != null && m40388T.m153786t0()) {
                                c3979l = c23528a.m123605k(m40388T.m153756e(), 0, EnumC25629a.DEFAULT);
                            } else {
                                c3979l = null;
                            }
                            if (c3979l != null && c3979l.m18839c() != null) {
                                AbstractC24965c.m129684a();
                                String str = contactProfile.f42437s;
                                createWithBitmap = Icon.createWithBitmap(C23999j.m125743s2(c3979l.m18839c()));
                                arrayList.add(AbstractC24964b.m129683a(str, createWithBitmap, 1.0f, componentName, bundle));
                            } else {
                                AbstractC24965c.m129684a();
                                String str2 = contactProfile.f42437s;
                                createWithResource = Icon.createWithResource(this, AbstractC16803z.avatar_groupchat);
                                arrayList.add(AbstractC24964b.m129683a(str2, createWithResource, 1.0f, componentName, bundle));
                            }
                        } else {
                            C3979l m123605k = c23528a.m123605k(contactProfile.f42446v, 0, EnumC25629a.DEFAULT);
                            if (m123605k != null && m123605k.m18839c() != null) {
                                AbstractC24965c.m129684a();
                                String str3 = contactProfile.f42437s;
                                createWithBitmap2 = Icon.createWithBitmap(C23999j.m125743s2(m123605k.m18839c()));
                                arrayList.add(AbstractC24964b.m129683a(str3, createWithBitmap2, 1.0f, componentName, bundle));
                            } else {
                                AbstractC24965c.m129684a();
                                String str4 = contactProfile.f42437s;
                                createWithResource2 = Icon.createWithResource(this, AbstractC16803z.default_avatar);
                                arrayList.add(AbstractC24964b.m129683a(str4, createWithResource2, 1.0f, componentName, bundle));
                            }
                        }
                    }
                }
                return arrayList;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f49531p, e11);
        }
        return null;
    }
}
