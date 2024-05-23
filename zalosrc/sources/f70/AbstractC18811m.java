package f70;

import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import java.util.Comparator;
import on0.AbstractC24341v;

/* renamed from: f70.m */
/* loaded from: classes5.dex */
public abstract class AbstractC18811m {

    /* renamed from: f70.m$a */
    /* loaded from: classes5.dex */
    public static final class a implements Comparator {

        /* renamed from: p */
        final /* synthetic */ String f94087p;

        a(String str) {
            this.f94087p = str;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(GroupFullMemberAdapter.C6938b c6938b, GroupFullMemberAdapter.C6938b c6938b2) {
            String str;
            int m127121q;
            int m127121q2;
            String str2;
            String str3;
            AbstractC19074t.m100208f(c6938b, "object1");
            AbstractC19074t.m100208f(c6938b2, "object2");
            int i11 = c6938b.f38021a;
            int i12 = c6938b2.f38021a;
            if (i11 > i12) {
                return -1;
            }
            if (i11 < i12) {
                return 1;
            }
            if (c6938b.f38025e) {
                return -1;
            }
            if (c6938b2.f38025e) {
                return 1;
            }
            String str4 = this.f94087p;
            String str5 = null;
            if (str4 != null && str4.length() != 0) {
                ContactProfile contactProfile = c6938b.f38022b;
                if (contactProfile != null) {
                    str2 = contactProfile.f42434r;
                } else {
                    str2 = null;
                }
                if (AbstractC19074t.m100204b(str2, this.f94087p)) {
                    return -1;
                }
                ContactProfile contactProfile2 = c6938b2.f38022b;
                if (contactProfile2 != null) {
                    str3 = contactProfile2.f42434r;
                } else {
                    str3 = null;
                }
                if (AbstractC19074t.m100204b(str3, this.f94087p)) {
                    return 1;
                }
            }
            ContactProfile contactProfile3 = c6938b.f38022b;
            if (contactProfile3 != null) {
                str = contactProfile3.f42440t;
            } else {
                str = null;
            }
            String str6 = "";
            if (str == null) {
                str = "";
            }
            ContactProfile contactProfile4 = c6938b2.f38022b;
            if (contactProfile4 != null) {
                str5 = contactProfile4.f42440t;
            }
            if (str5 != null) {
                str6 = str5;
            }
            boolean z11 = c6938b.f38027g;
            if (z11 && c6938b2.f38027g) {
                m127121q2 = AbstractC24341v.m127121q(str, str6, true);
                return m127121q2;
            }
            if (z11) {
                return -1;
            }
            if (!c6938b2.f38027g) {
                m127121q = AbstractC24341v.m127121q(str, str6, true);
                return m127121q;
            }
            return 1;
        }
    }

    /* renamed from: a */
    public static final Comparator m98776a(String str) {
        return new a(str);
    }
}
