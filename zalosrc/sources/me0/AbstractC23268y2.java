package me0;

import android.text.TextUtils;
import au.C2343e;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.zviews.ke0;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalocore.CoreUtility;
import id0.C20518d;
import kd0.C21693c;
import l80.C22122a0;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p461qu.AbstractC25495a;

/* renamed from: me0.y2 */
/* loaded from: classes4.dex */
public abstract class AbstractC23268y2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.y2$a */
    /* loaded from: classes4.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f112768l1;

        /* renamed from: m1 */
        final /* synthetic */ C3977j f112769m1;

        /* renamed from: n1 */
        final /* synthetic */ C21693c f112770n1;

        /* renamed from: o1 */
        final /* synthetic */ C24003n f112771o1;

        a(String str, C3977j c3977j, C21693c c21693c, C24003n c24003n) {
            this.f112768l1 = str;
            this.f112769m1 = c3977j;
            this.f112770n1 = c21693c;
            this.f112771o1 = c24003n;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (TextUtils.equals(str, this.f112768l1)) {
                if (c3979l != null && c3979l.m18839c() != null && (c3979l.m18839c().getWidth() != 1 || c3979l.m18839c().getHeight() != 1)) {
                    C3977j c3977j = this.f112769m1;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    this.f112770n1.mo111924u1(c3979l.m18839c());
                    return;
                }
                this.f112770n1.mo111925v1(this.f112771o1.f116261b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.y2$b */
    /* loaded from: classes4.dex */
    public class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f112772l1;

        /* renamed from: m1 */
        final /* synthetic */ C3977j f112773m1;

        /* renamed from: n1 */
        final /* synthetic */ C21693c f112774n1;

        /* renamed from: o1 */
        final /* synthetic */ C24003n f112775o1;

        b(String str, C3977j c3977j, C21693c c21693c, C24003n c24003n) {
            this.f112772l1 = str;
            this.f112773m1 = c3977j;
            this.f112774n1 = c21693c;
            this.f112775o1 = c24003n;
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (TextUtils.equals(str, this.f112772l1)) {
                if (c3979l != null && c3979l.m18839c() != null && (c3979l.m18839c().getWidth() != 1 || c3979l.m18839c().getHeight() != 1)) {
                    C3977j c3977j = this.f112773m1;
                    if (c3977j != null) {
                        c3977j.setImageInfo(c3979l, false);
                    }
                    if (c23995f.m125666q() == 4) {
                        this.f112774n1.mo111924u1(c3979l.m18839c());
                        return;
                    } else {
                        this.f112774n1.mo111924u1(c3979l.m18839c());
                        this.f112774n1.m89135c1(new C20518d());
                        return;
                    }
                }
                this.f112774n1.mo111925v1(this.f112775o1.f116261b);
            }
        }
    }

    /* renamed from: a */
    public static void m120027a(GroupAvatarView groupAvatarView, ContactProfile contactProfile, boolean z11) {
        if (groupAvatarView != null) {
            try {
                groupAvatarView.setScrollingMode(z11);
                groupAvatarView.m75731c(contactProfile);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public static void m120028b(C23528a c23528a, InterfaceC3968a interfaceC3968a, ContactProfile contactProfile, C24003n c24003n, boolean z11) {
        if (interfaceC3968a != null) {
            try {
                if (contactProfile != null) {
                    String str = contactProfile.f42446v;
                    if (TextUtils.isEmpty(str)) {
                        interfaceC3968a.setTag(1090453505, contactProfile.f42434r);
                        interfaceC3968a.setImageDrawable(c24003n.f116261b);
                    } else if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                        String m40418n0 = contactProfile.m40418n0();
                        int m12307a = C2343e.m12307a(contactProfile.f42434r, false);
                        interfaceC3968a.setTag(1090453505, str + contactProfile.f42434r);
                        interfaceC3968a.setImageDrawable(C16640q2.m88404a().mo88412f(m40418n0, m12307a));
                    } else {
                        m120032f(c23528a, interfaceC3968a, str, c24003n, z11);
                    }
                } else {
                    interfaceC3968a.setImageDrawable(c24003n.f116261b);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static void m120029c(C23528a c23528a, C3977j c3977j, C21693c c21693c, ContactProfile contactProfile, C24003n c24003n, boolean z11) {
        if (c21693c != null) {
            try {
                if (contactProfile != null) {
                    String str = contactProfile.f42446v;
                    if (TextUtils.isEmpty(str)) {
                        c21693c.mo111925v1(c24003n.f116261b);
                    } else if (C23302b.f113247a.m120523d(str) && !CoreUtility.f89233i.equals(contactProfile.f42434r)) {
                        c21693c.mo111925v1(C16640q2.m88404a().mo88412f(contactProfile.m40418n0(), C2343e.m12307a(contactProfile.f42434r, false)));
                    } else {
                        m120033g(c23528a, c3977j, c21693c, str, c24003n, z11);
                    }
                } else {
                    c21693c.mo111925v1(c24003n.f116261b);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public static void m120030d(C23528a c23528a, C22122a0 c22122a0, ContactProfile contactProfile) {
        String str;
        if (c22122a0 != null) {
            try {
                if (contactProfile != null) {
                    if (!contactProfile.m40374K0()) {
                        if (AbstractC25495a.m132081f(contactProfile.f42434r)) {
                            c22122a0.mo111926w1(AbstractC16803z.ava_oa_news);
                            return;
                        }
                        if (!TextUtils.isEmpty(contactProfile.f42446v)) {
                            if (C23302b.f113247a.m120523d(contactProfile.f42446v) && (str = CoreUtility.f89233i) != null && !str.equals(contactProfile.f42434r)) {
                                String str2 = contactProfile.f42434r;
                                if (TextUtils.isEmpty(str2) || str2.startsWith("/")) {
                                    str2 = ke0.m87327a(contactProfile.f42455y);
                                }
                                c22122a0.mo111925v1(C16640q2.m88404a().mo88412f(contactProfile.m40418n0(), C2343e.m12307a(str2, false)));
                                return;
                            }
                            c22122a0.m115375G1(c23528a, contactProfile.f42446v, C23278z2.m120143n());
                            return;
                        }
                        c22122a0.mo111926w1(AbstractC16803z.default_avatar);
                        return;
                    }
                    return;
                }
                c22122a0.mo111926w1(AbstractC16803z.default_avatar);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: e */
    public static void m120031e(C23528a c23528a, InterfaceC3968a interfaceC3968a, String str, C24003n c24003n) {
        m120032f(c23528a, interfaceC3968a, str, c24003n, false);
    }

    /* renamed from: f */
    public static void m120032f(C23528a c23528a, InterfaceC3968a interfaceC3968a, String str, C24003n c24003n, boolean z11) {
        try {
            if (TextUtils.isEmpty(str) || (z11 && !C23999j.m125696L2(str, c24003n))) {
                interfaceC3968a.setImageDrawable(c24003n.f116261b);
                return;
            }
            ((C23528a) c23528a.m123612r(interfaceC3968a)).m123618x(str, c24003n);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m120033g(C23528a c23528a, C3977j c3977j, C21693c c21693c, String str, C24003n c24003n, boolean z11) {
        try {
            if (TextUtils.isEmpty(str) || (z11 && !C23999j.m125696L2(str, c24003n))) {
                c21693c.mo111925v1(c24003n.f116261b);
                return;
            }
            c21693c.mo111925v1(c24003n.f116261b);
            ((C23528a) c23528a.m123612r(c3977j)).m123579C(str, c24003n, new b(str, c3977j, c21693c, c24003n));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m120034h(C23528a c23528a, C3977j c3977j, C21693c c21693c, String str, C24003n c24003n, boolean z11) {
        try {
            if (TextUtils.isEmpty(str) || (z11 && !C23999j.m125696L2(str, c24003n))) {
                c21693c.mo111925v1(c24003n.f116261b);
                return;
            }
            c21693c.mo111925v1(c24003n.f116261b);
            ((C23528a) c23528a.m123612r(c3977j)).m123579C(str, c24003n, new a(str, c3977j, c21693c, c24003n));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
