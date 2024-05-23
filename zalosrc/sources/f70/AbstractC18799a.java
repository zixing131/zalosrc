package f70;

import android.text.TextUtils;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import on0.AbstractC24342w;

/* renamed from: f70.a */
/* loaded from: classes5.dex */
public abstract class AbstractC18799a {
    /* renamed from: a */
    public static final GroupFullMemberAdapter.C6938b m98773a(GroupFullMemberAdapter.C6938b c6938b) {
        AbstractC19074t.m100208f(c6938b, "<this>");
        GroupFullMemberAdapter.C6938b c6938b2 = new GroupFullMemberAdapter.C6938b(c6938b.f38021a);
        c6938b2.f38022b = c6938b.f38022b;
        c6938b2.f38023c = c6938b.f38023c;
        c6938b2.f38024d = c6938b.f38024d;
        c6938b2.f38025e = c6938b.f38025e;
        c6938b2.f38027g = c6938b.f38027g;
        c6938b2.f38028h = c6938b.f38028h;
        c6938b2.f38029i = c6938b.f38029i;
        c6938b2.f38030j = c6938b.f38030j;
        c6938b2.f38034n = c6938b.f38034n;
        c6938b2.f38035o = c6938b.f38035o;
        c6938b2.f38036p = c6938b.f38036p;
        return c6938b2;
    }

    /* renamed from: b */
    public static final List m98774b(List list, String str) {
        ContactProfile contactProfile;
        boolean m127149O;
        AbstractC19074t.m100208f(list, "<this>");
        AbstractC19074t.m100208f(str, "searchText");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            GroupFullMemberAdapter.C6938b c6938b = (GroupFullMemberAdapter.C6938b) obj;
            if (!TextUtils.isEmpty(str)) {
                if (c6938b.f38021a == 0 && (contactProfile = c6938b.f38022b) != null && contactProfile != null) {
                    String str2 = contactProfile.f42440t;
                    if (!TextUtils.isEmpty(str2)) {
                        AbstractC19074t.m100205c(str2);
                        m127149O = AbstractC24342w.m127149O(str2, str, false, 2, null);
                        if (m127149O) {
                        }
                    }
                }
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final List m98775c(List list, String str) {
        int m127173b0;
        AbstractC19074t.m100208f(list, "<this>");
        AbstractC19074t.m100208f(str, "searchText");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ContactProfile contactProfile = ((GroupFullMemberAdapter.C6938b) it.next()).f38022b;
            if (contactProfile != null) {
                String str2 = contactProfile.f42440t;
                contactProfile.f42399a1.clear();
                if (!TextUtils.isEmpty(str2)) {
                    AbstractC19074t.m100205c(str2);
                    m127173b0 = AbstractC24342w.m127173b0(str2, str, 0, false, 6, null);
                    if (m127173b0 >= 0) {
                        int length = str.length() + m127173b0;
                        contactProfile.f42399a1.add(Integer.valueOf(m127173b0));
                        contactProfile.f42399a1.add(Integer.valueOf(length));
                    }
                }
            }
        }
        return list;
    }
}
