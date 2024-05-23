package com.zing.zalo.p077ui.mycloud.gridtab;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.mycloud.base.BaseMyCloudTabView;
import com.zing.zalo.p077ui.mycloud.gridtab.LocationGridChatItemView;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import dj.C17945a0;
import dj.C17969i0;
import dj.C18002t0;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p304ks.AbstractC21935u;
import qm0.AbstractC25366r;
import ti0.C26705d;
import ti0.C26707f;
import u80.InterfaceC27158o2;
import ui0.C27280g;
import vg.AbstractRunnableC28185s6;
import vg.C28203u6;

/* loaded from: classes6.dex */
public final class LocationGridChatItemView extends GridChatItemViewBase {

    /* renamed from: A0 */
    private C16716d f65711A0;

    /* renamed from: B0 */
    private C21693c f65712B0;

    /* renamed from: C0 */
    private C22126c0 f65713C0;

    /* renamed from: D0 */
    private C22126c0 f65714D0;

    /* renamed from: E0 */
    private String f65715E0;

    /* renamed from: F0 */
    private String f65716F0;

    /* renamed from: G0 */
    private boolean f65717G0;

    /* renamed from: H0 */
    private boolean f65718H0;

    /* renamed from: com.zing.zalo.ui.mycloud.gridtab.LocationGridChatItemView$a */
    /* loaded from: classes6.dex */
    public static final class C12577a extends AbstractRunnableC28185s6 {

        /* renamed from: A */
        final /* synthetic */ MyCloudMessageItem f65719A;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12577a(MyCloudMessageItem myCloudMessageItem, List list) {
            super(LocationGridChatItemView.this, list, 1050);
            this.f65719A = myCloudMessageItem;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static final void m70922h(LocationGridChatItemView locationGridChatItemView) {
            AbstractC19074t.m100208f(locationGridChatItemView, "this$0");
            C22126c0 c22126c0 = locationGridChatItemView.f65713C0;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("titleModule");
                c22126c0 = null;
            }
            c22126c0.m111959G1(locationGridChatItemView.f65715E0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:            r1 = on0.AbstractC24341v.m127114D(r5, "\n", " ", false, 4, null);     */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:            if (r1 == null) goto L39;     */
        @Override // vg.AbstractRunnableC28185s6
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo61137c(ArrayList arrayList) {
            C17945a0 c17945a0;
            String str;
            String str2;
            String m127114D;
            int i11;
            boolean z11;
            super.mo61137c(arrayList);
            if (arrayList != null && arrayList.size() > 0 && arrayList.get(0) != null) {
                C17945a0 m71033m = this.f65719A.m71033m();
                MyCloudMessageItem data = LocationGridChatItemView.this.getData();
                String str3 = null;
                if (data != null) {
                    c17945a0 = data.m71033m();
                } else {
                    c17945a0 = null;
                }
                String str4 = "";
                if (m71033m == c17945a0) {
                    ContactProfile contactProfile = (ContactProfile) arrayList.get(0);
                    if (contactProfile != null) {
                        str3 = contactProfile.m40383Q(true, false);
                    }
                    String str5 = str3;
                    if (str5 != null && m127114D != null) {
                        int length = m127114D.length() - 1;
                        int i12 = 0;
                        boolean z12 = false;
                        while (i12 <= length) {
                            if (!z12) {
                                i11 = i12;
                            } else {
                                i11 = length;
                            }
                            if (AbstractC19074t.m100209g(m127114D.charAt(i11), 32) <= 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z12) {
                                if (!z11) {
                                    z12 = true;
                                } else {
                                    i12++;
                                }
                            } else if (!z11) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        str2 = m127114D.subSequence(i12, length + 1).toString();
                    }
                    str2 = "";
                    LocationGridChatItemView locationGridChatItemView = LocationGridChatItemView.this;
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_other_current_location_in_bubble);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    String format = String.format(m118743r0, Arrays.copyOf(new Object[]{str2}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                    locationGridChatItemView.f65715E0 = format;
                    final LocationGridChatItemView locationGridChatItemView2 = LocationGridChatItemView.this;
                    AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.mycloud.gridtab.f0
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationGridChatItemView.C12577a.m70922h(LocationGridChatItemView.this);
                        }
                    });
                }
                C7960e m41971c6 = C7960e.m41971c6();
                ContactProfile contactProfile2 = (ContactProfile) arrayList.get(0);
                ContactProfile contactProfile3 = (ContactProfile) arrayList.get(0);
                if (contactProfile3 != null && (str = contactProfile3.f42434r) != null) {
                    str4 = str;
                }
                m41971c6.m42221O7(contactProfile2, AbstractC21935u.m114558y(str4));
            }
        }
    }

    public LocationGridChatItemView(Context context) {
        super(context);
        this.f65715E0 = "";
        this.f65716F0 = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public static final void m70919b1(LocationGridChatItemView locationGridChatItemView, C16719g c16719g) {
        C17945a0 m71033m;
        BaseMyCloudTabView.AbstractC12510b delegate;
        AbstractC19074t.m100208f(locationGridChatItemView, "this$0");
        if (locationGridChatItemView.getEnableMultiSelection()) {
            C21691a checkBoxModule = locationGridChatItemView.getCheckBoxModule();
            if (checkBoxModule != null) {
                checkBoxModule.mo89091D0(!checkBoxModule.m89141i0());
                return;
            }
            return;
        }
        MyCloudMessageItem data = locationGridChatItemView.getData();
        if (data != null && (m71033m = data.m71033m()) != null && (delegate = locationGridChatItemView.getDelegate()) != null) {
            delegate.mo70406y(m71033m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public static final void m70920c1(LocationGridChatItemView locationGridChatItemView, C16719g c16719g) {
        InterfaceC27158o2 selectEventListener;
        AbstractC19074t.m100208f(locationGridChatItemView, "this$0");
        MyCloudMessageItem data = locationGridChatItemView.getData();
        if (data != null && (selectEventListener = locationGridChatItemView.getSelectEventListener()) != null) {
            InterfaceC27158o2.a.m139263a(selectEventListener, data, locationGridChatItemView.getPosition(), null, 4, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:            r0 = on0.AbstractC24341v.m127114D(r5, "\n", " ", false, 4, null);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:            if (r0 == null) goto L42;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getUIData() {
        C18002t0 c18002t0;
        boolean z11;
        String str;
        String format;
        String m127114D;
        int i11;
        boolean z12;
        List m131496e;
        MyCloudMessageItem data = getData();
        if (data != null) {
            if (data.m71033m().m94929K2() instanceof C18002t0) {
                C17969i0 m94929K2 = data.m71033m().m94929K2();
                AbstractC19074t.m100206d(m94929K2, "null cannot be cast to non-null type com.zing.zalo.data.chat.model.message.ChatRichContentLocation");
                c18002t0 = (C18002t0) m94929K2;
            } else {
                c18002t0 = null;
            }
            if (c18002t0 != null) {
                this.f65715E0 = data.m71033m().m94929K2().f91011p;
                this.f65716F0 = data.m71033m().m94929K2().f91015t;
                this.f65717G0 = c18002t0.f91184E;
            }
            boolean z13 = false;
            if (this.f65717G0 && TextUtils.isEmpty(this.f65715E0)) {
                if (data.m71033m().m95032V6()) {
                    format = AbstractC23136l9.m118743r0(AbstractC8020f0.str_my_current_location_in_bubble);
                    AbstractC19074t.m100205c(format);
                } else {
                    ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, data.m71033m().m94862C4(), false, 2, null);
                    if (m141800i == null) {
                        m141800i = new ContactProfile(data.m71033m().m94862C4());
                        m141800i.f42437s = data.m71033m().m94854B4();
                        m131496e = AbstractC25366r.m131496e(data.m71033m().m94862C4());
                        new C12577a(data, m131496e).m141750b();
                    }
                    String m40383Q = m141800i.m40383Q(true, false);
                    if (m40383Q != null && m127114D != null) {
                        int length = m127114D.length() - 1;
                        int i12 = 0;
                        boolean z14 = false;
                        while (i12 <= length) {
                            if (!z14) {
                                i11 = i12;
                            } else {
                                i11 = length;
                            }
                            if (AbstractC19074t.m100209g(m127114D.charAt(i11), 32) <= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z14) {
                                if (!z12) {
                                    z14 = true;
                                } else {
                                    i12++;
                                }
                            } else if (!z12) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        str = m127114D.subSequence(i12, length + 1).toString();
                    }
                    str = "";
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_other_current_location_in_bubble);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    format = String.format(m118743r0, Arrays.copyOf(new Object[]{str}, 1));
                    AbstractC19074t.m100207e(format, "format(...)");
                }
                this.f65715E0 = format;
                z11 = true;
            } else {
                z11 = false;
            }
            if (!this.f65717G0 || z11) {
                z13 = true;
            }
            this.f65718H0 = z13;
        }
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: C0 */
    public C16719g mo70813C0() {
        C16716d c16716d = new C16716d(getContext());
        c16716d.m89106L().m89028L(-1, -1).m89041Y(AbstractC23222t7.f112576o);
        c16716d.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.mycloud.gridtab.d0
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                LocationGridChatItemView.m70919b1(LocationGridChatItemView.this, c16719g);
            }
        });
        c16716d.m89111N0(new C16719g.d() { // from class: com.zing.zalo.ui.mycloud.gridtab.e0
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g) {
                LocationGridChatItemView.m70920c1(LocationGridChatItemView.this, c16719g);
            }
        });
        this.f65711A0 = c16716d;
        C21693c c21693c = new C21693c(getContext());
        c21693c.m89106L().m89028L(-2, -2).m89036T(AbstractC23222t7.f112556e).m89034R(AbstractC23222t7.f112562h);
        Context context = c21693c.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        c21693c.mo111925v1(C27280g.m139659b(context, AbstractC23322a.zds_ic_location_solid_32, AbstractC2808b.f150830r60));
        this.f65712B0 = c21693c;
        C16716d c16716d2 = this.f65711A0;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d2 = null;
        }
        C21693c c21693c2 = this.f65712B0;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("iconModule");
            c21693c2 = null;
        }
        c16716d2.m89001g1(c21693c2);
        C22126c0 c22126c0 = new C22126c0(getContext());
        c22126c0.m89106L().m89028L(-2, -2).m89072y(Boolean.TRUE);
        Context context2 = c22126c0.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_xxsmall));
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC2807a.text_02));
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        this.f65714D0 = c22126c0;
        C16716d c16716d3 = this.f65711A0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d3 = null;
        }
        C22126c0 c22126c02 = this.f65714D0;
        if (c22126c02 == null) {
            AbstractC19074t.m100223u("descModule");
            c22126c02 = null;
        }
        c16716d3.m89001g1(c22126c02);
        C22126c0 c22126c03 = new C22126c0(getContext());
        C16718f m89028L = c22126c03.m89106L().m89028L(-2, -2);
        C22126c0 c22126c04 = this.f65714D0;
        if (c22126c04 == null) {
            AbstractC19074t.m100223u("descModule");
            c22126c04 = null;
        }
        m89028L.m89066s(c22126c04).m89033Q(AbstractC23222t7.f112556e);
        Context context3 = c22126c03.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26707f(c22126c03).m137318a(C26705d.m137293a(context3, AbstractC2814h.t_normal_m));
        c22126c03.m111962J1(C23212s8.m119607o(c22126c03.getContext(), AbstractC2807a.text_01));
        c22126c03.m111980v1(truncateAt);
        this.f65713C0 = c22126c03;
        C16716d c16716d4 = this.f65711A0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("containerModule");
            c16716d4 = null;
        }
        C22126c0 c22126c05 = this.f65713C0;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("titleModule");
            c22126c05 = null;
        }
        c16716d4.m89001g1(c22126c05);
        C16716d c16716d5 = this.f65711A0;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("containerModule");
            return null;
        }
        return c16716d5;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: Q0 */
    public void mo70814Q0() {
        super.mo70814Q0();
        this.f65715E0 = "";
        this.f65716F0 = "";
        this.f65717G0 = false;
        this.f65718H0 = false;
    }

    @Override // com.zing.zalo.p077ui.mycloud.gridtab.GridChatItemViewBase
    /* renamed from: w0 */
    public void mo70815w0() {
        int i11;
        getUIData();
        if (this.f65718H0) {
            C22126c0 c22126c0 = this.f65713C0;
            C22126c0 c22126c02 = null;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("titleModule");
                c22126c0 = null;
            }
            if (getViewOriginalMsgVisible()) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            c22126c0.m111953A1(i11);
            C22126c0 c22126c03 = this.f65713C0;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("titleModule");
                c22126c03 = null;
            }
            c22126c03.m111959G1(this.f65715E0);
            C22126c0 c22126c04 = this.f65714D0;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("descModule");
            } else {
                c22126c02 = c22126c04;
            }
            c22126c02.m111959G1(this.f65716F0);
        }
    }
}
