package com.zing.zalo.adapters;

import ae.C0766k;
import ag0.C0804b;
import ag0.C0814e0;
import ag0.C0824j;
import am.AbstractC0924m0;
import am.AbstractC0939u;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import bi0.AbstractC2807a;
import cd0.C3430i;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.textview.RobotoTextModulesView;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import com.zing.zalo.zdesign.component.Badge;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zinstant.C17170o;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zinstant.ZaloZinstantCommonLayout;
import com.zing.zalo.zview.ZaloView;
import gw.AbstractC19646n0;
import gw.C19636i1;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22013a0;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23268y2;
import me0.C23212s8;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p266jg.AbstractC21244b;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import p604wb.C28905e;
import p716zh.C31973j5;
import p716zh.C31980jc;
import pm0.C24860q;
import vg.C28203u6;
import zl0.AbstractC32232i;

/* loaded from: classes3.dex */
public class MessagesListOAAdapter extends BaseAdapter {

    /* renamed from: A */
    AbstractC22055v0.l f38171A;

    /* renamed from: B */
    final int f38172B;

    /* renamed from: C */
    final int f38173C;

    /* renamed from: D */
    final int f38174D;

    /* renamed from: E */
    final int f38175E;

    /* renamed from: F */
    final int f38176F;

    /* renamed from: G */
    final int f38177G;

    /* renamed from: K */
    InterfaceC6988h f38181K;

    /* renamed from: p */
    public final LayoutInflater f38182p;

    /* renamed from: q */
    Resources f38183q;

    /* renamed from: s */
    C23528a f38185s;

    /* renamed from: y */
    boolean f38191y;

    /* renamed from: z */
    Context f38192z;

    /* renamed from: r */
    boolean f38184r = false;

    /* renamed from: u */
    ArrayList f38187u = new ArrayList();

    /* renamed from: v */
    ArrayList f38188v = new ArrayList();

    /* renamed from: w */
    ArrayList f38189w = new ArrayList();

    /* renamed from: H */
    private JSONObject f38178H = null;

    /* renamed from: I */
    private InterfaceC22508f f38179I = null;

    /* renamed from: J */
    private String f38180J = null;

    /* renamed from: t */
    ArrayList f38186t = new ArrayList();

    /* renamed from: x */
    ArrayList f38190x = new ArrayList();

    /* renamed from: com.zing.zalo.adapters.MessagesListOAAdapter$a */
    /* loaded from: classes3.dex */
    class C6981a extends ZaloZinstantCommonLayout {
        C6981a(Context context) {
            super(context);
        }

        @Override // com.zing.zalo.zinstant.ZaloZinstantCommonLayout
        /* renamed from: l1 */
        public void mo35796l1() {
            super.mo35796l1();
            onStart();
        }
    }

    /* renamed from: com.zing.zalo.adapters.MessagesListOAAdapter$b */
    /* loaded from: classes3.dex */
    class C6982b extends C17170o {

        /* renamed from: b */
        final /* synthetic */ ViewGroup f38196b;

        C6982b(ViewGroup viewGroup) {
            this.f38196b = viewGroup;
        }

        @Override // com.zing.zalo.zinstant.C17170o, com.zing.zalo.zinstant.view.InterfaceC17224a
        /* renamed from: c */
        public int mo35797c() {
            return this.f38196b.getMeasuredWidth();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.MessagesListOAAdapter$c */
    /* loaded from: classes3.dex */
    public class C6983c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f38198a;

        /* renamed from: b */
        final /* synthetic */ MessagesListOAAdapter f38199b;

        C6983c(ContactProfile contactProfile, MessagesListOAAdapter messagesListOAAdapter) {
            this.f38198a = contactProfile;
            this.f38199b = messagesListOAAdapter;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            if (!MessagesListOAAdapter.this.m35772j(this.f38198a, this.f38199b)) {
                MessagesListOAAdapter.this.m35773k(this.f38198a, this.f38199b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.MessagesListOAAdapter$d */
    /* loaded from: classes3.dex */
    public class C6984d implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f38201a;

        /* renamed from: b */
        final /* synthetic */ MessagesListOAAdapter f38202b;

        C6984d(ContactProfile contactProfile, MessagesListOAAdapter messagesListOAAdapter) {
            this.f38201a = contactProfile;
            this.f38202b = messagesListOAAdapter;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            ContactProfile contactProfile;
            if (obj != null) {
                contactProfile = new ContactProfile((JSONObject) obj);
            } else {
                contactProfile = null;
            }
            if (contactProfile != null) {
                String str = contactProfile.f42434r;
                if (str.length() > 0 && !str.equalsIgnoreCase("null")) {
                    if (C7960e.m41971c6() != null) {
                        C7960e.m41971c6().m42221O7(contactProfile, AbstractC21935u.m114558y(str));
                    }
                    C7959d.m41638d1().m41766Y2(contactProfile.f42434r, contactProfile.f42446v, contactProfile.f42437s);
                }
                ContactProfile contactProfile2 = this.f38201a;
                contactProfile2.f42437s = contactProfile.f42437s;
                contactProfile2.f42446v = contactProfile.f42446v;
                this.f38202b.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.MessagesListOAAdapter$e */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C6985e {

        /* renamed from: a */
        static final /* synthetic */ int[] f38204a;

        static {
            int[] iArr = new int[AbstractC1785o.a.values().length];
            f38204a = iArr;
            try {
                iArr[AbstractC1785o.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38204a[AbstractC1785o.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38204a[AbstractC1785o.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38204a[AbstractC1785o.a.ON_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38204a[AbstractC1785o.a.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.MessagesListOAAdapter$f */
    /* loaded from: classes3.dex */
    public static class C6986f {

        /* renamed from: a */
        private final ContactProfile f38205a;

        public C6986f(ContactProfile contactProfile) {
            this.f38205a = contactProfile;
        }

        /* renamed from: b */
        public ContactProfile m35799b() {
            return this.f38205a;
        }
    }

    /* renamed from: com.zing.zalo.adapters.MessagesListOAAdapter$g */
    /* loaded from: classes3.dex */
    public static class C6987g extends C6986f {

        /* renamed from: b */
        private final InterfaceC22508f f38206b;

        /* renamed from: c */
        private final String f38207c;

        public C6987g(ContactProfile contactProfile, InterfaceC22508f interfaceC22508f, String str) {
            super(contactProfile);
            this.f38206b = interfaceC22508f;
            this.f38207c = str;
        }
    }

    /* renamed from: com.zing.zalo.adapters.MessagesListOAAdapter$h */
    /* loaded from: classes3.dex */
    public interface InterfaceC6988h {
        /* renamed from: ar */
        void mo35802ar(ContactProfile contactProfile, int i11);

        /* renamed from: d9 */
        void mo35803d9(String str);

        /* renamed from: dH */
        boolean mo35804dH(ContactProfile contactProfile);

        /* renamed from: l6 */
        void mo35805l6(ContactProfile contactProfile);

        /* renamed from: n0 */
        void mo35806n0(int i11);

        /* renamed from: v4 */
        AbstractC1785o mo35807v4();

        /* renamed from: wB */
        int mo35808wB();
    }

    /* renamed from: com.zing.zalo.adapters.MessagesListOAAdapter$i */
    /* loaded from: classes3.dex */
    public static class C6989i {

        /* renamed from: A */
        public C3430i f38208A;

        /* renamed from: B */
        public TextView f38209B;

        /* renamed from: C */
        public Badge f38210C;

        /* renamed from: D */
        private ZaloZinstantCommonLayout f38211D;

        /* renamed from: E */
        private ZaloZinstantCommonLayout f38212E;

        /* renamed from: F */
        public GroupAvatarView[] f38213F = new GroupAvatarView[3];

        /* renamed from: a */
        public GroupAvatarView f38214a;

        /* renamed from: b */
        public ImageView f38215b;

        /* renamed from: c */
        public RobotoTextModulesView f38216c;

        /* renamed from: d */
        public RobotoTextView f38217d;

        /* renamed from: e */
        public TextView f38218e;

        /* renamed from: f */
        public RobotoTextView f38219f;

        /* renamed from: g */
        public RobotoTextView f38220g;

        /* renamed from: h */
        public TextView f38221h;

        /* renamed from: i */
        public ImageView f38222i;

        /* renamed from: j */
        public ImageView f38223j;

        /* renamed from: k */
        public ImageView f38224k;

        /* renamed from: l */
        public View f38225l;

        /* renamed from: m */
        public View f38226m;

        /* renamed from: n */
        public Button f38227n;

        /* renamed from: o */
        public TextView f38228o;

        /* renamed from: p */
        public ZSimpleGIFView f38229p;

        /* renamed from: q */
        public View f38230q;

        /* renamed from: r */
        public TextView f38231r;

        /* renamed from: s */
        public TextView f38232s;

        /* renamed from: t */
        public TextView f38233t;

        /* renamed from: u */
        public TextView f38234u;

        /* renamed from: v */
        public TextView f38235v;

        /* renamed from: w */
        public View f38236w;

        /* renamed from: x */
        public TextView f38237x;

        /* renamed from: y */
        public RecyclingImageView f38238y;

        /* renamed from: z */
        public View f38239z;
    }

    public MessagesListOAAdapter(ZaloView zaloView, C23528a c23528a, Resources resources) {
        this.f38182p = (LayoutInflater) zaloView.m92648SI().getSystemService("layout_inflater");
        this.f38191y = zaloView.m92676n2().mo35576n3();
        this.f38192z = zaloView.getContext();
        this.f38183q = resources;
        this.f38185s = c23528a;
        this.f38172B = C23212s8.m119607o(this.f38192z, AbstractC21196a.TextColor1);
        this.f38173C = C23212s8.m119607o(this.f38192z, AbstractC21196a.TextColor2);
        int m119607o = C23212s8.m119607o(this.f38192z, AbstractC2807a.accent_sky_blue_text);
        this.f38174D = m119607o;
        this.f38175E = C23212s8.m119607o(this.f38192z, AbstractC2807a.error_text);
        this.f38176F = AbstractC23136l9.m118641B(this.f38192z, AbstractC16801x.orange_color1);
        this.f38177G = m119607o;
    }

    /* renamed from: i */
    private void m35771i(final ZaloZinstantCommonLayout zaloZinstantCommonLayout) {
        AbstractC1785o mo35807v4;
        InterfaceC6988h interfaceC6988h = this.f38181K;
        if (interfaceC6988h != null && (mo35807v4 = interfaceC6988h.mo35807v4()) != null) {
            mo35807v4.mo9335a(new InterfaceC1795t() { // from class: com.zing.zalo.adapters.MessagesListOAAdapter.3
                @Override // androidx.lifecycle.InterfaceC1795t
                /* renamed from: X6 */
                public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                    int i11 = C6985e.f38204a[aVar.ordinal()];
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 == 5) {
                                        interfaceC1801w.getLifecycle().mo9338d(this);
                                        return;
                                    }
                                    return;
                                }
                                zaloZinstantCommonLayout.onStop();
                                return;
                            }
                            zaloZinstantCommonLayout.onPause();
                            return;
                        }
                        zaloZinstantCommonLayout.onResume();
                        return;
                    }
                    zaloZinstantCommonLayout.onStart();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public boolean m35772j(ContactProfile contactProfile, MessagesListOAAdapter messagesListOAAdapter) {
        ContactProfile m141809c = C28203u6.f131407a.m141809c(contactProfile.f42434r);
        if (m141809c != null && !TextUtils.isEmpty(m141809c.f42437s) && !TextUtils.isEmpty(m141809c.f42446v)) {
            contactProfile.f42437s = m141809c.f42437s;
            contactProfile.f42446v = m141809c.f42446v;
            C7959d.m41638d1().m41766Y2(contactProfile.f42434r, contactProfile.f42446v, contactProfile.f42437s);
            messagesListOAAdapter.notifyDataSetChanged();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m35773k(ContactProfile contactProfile, MessagesListOAAdapter messagesListOAAdapter) {
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C6984d(contactProfile, messagesListOAAdapter));
        c0766k.mo1514Q4(contactProfile.f42434r, contactProfile.f42385V0, new TrackingSource((short) 1001));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m35774o(ContactProfile contactProfile, C6989i c6989i, View view) {
        C31980jc m115161u = AbstractC22055v0.m115161u(contactProfile.f42434r);
        if (m115161u != null && AbstractC22055v0.m115114D(contactProfile.f42434r, AbstractC21244b.m110054d(this.f38192z))) {
            this.f38171A.mo47172c(m115161u, c6989i.f38208A, 331);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m35775p(int i11, View view) {
        InterfaceC6988h interfaceC6988h = this.f38181K;
        if (interfaceC6988h != null) {
            interfaceC6988h.mo35806n0(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m35776q(ContactProfile contactProfile, View view) {
        InterfaceC6988h interfaceC6988h = this.f38181K;
        if (interfaceC6988h != null) {
            interfaceC6988h.mo35805l6(contactProfile);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m35777r(ContactProfile contactProfile, int i11, View view) {
        InterfaceC6988h interfaceC6988h = this.f38181K;
        if (interfaceC6988h != null) {
            interfaceC6988h.mo35802ar(contactProfile, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ boolean m35778s(ContactProfile contactProfile, View view) {
        InterfaceC6988h interfaceC6988h = this.f38181K;
        if (interfaceC6988h != null) {
            interfaceC6988h.mo35804dH(contactProfile);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m35779t(C31980jc c31980jc, C6989i c6989i, View view) {
        AbstractC22055v0.l lVar = this.f38171A;
        if (lVar != null) {
            lVar.mo47172c(c31980jc, c6989i.f38208A, 331);
        }
    }

    /* renamed from: u */
    private void m35780u(ContactProfile contactProfile, MessagesListOAAdapter messagesListOAAdapter) {
        if ((TextUtils.isEmpty(contactProfile.f42437s) || TextUtils.isEmpty(contactProfile.f42446v)) && Long.parseLong(contactProfile.f42434r) > 0) {
            C0824j.m2153b(new C6983c(contactProfile, messagesListOAAdapter));
        }
    }

    /* renamed from: A */
    public void m35781A(boolean z11) {
        this.f38184r = z11;
    }

    /* renamed from: B */
    public void m35782B(AbstractC22055v0.l lVar) {
        this.f38171A = lVar;
    }

    /* renamed from: C */
    void m35783C(TextView textView, int i11) {
        textView.setTextColor(i11);
    }

    /* renamed from: D */
    void m35784D(RobotoTextModulesView robotoTextModulesView, int i11) {
        robotoTextModulesView.setTextColor(i11);
    }

    /* renamed from: E */
    public void m35785E(JSONObject jSONObject) {
        if (this.f38178H != jSONObject) {
            this.f38179I = null;
        }
        this.f38178H = jSONObject;
        if (this.f38179I == null) {
            try {
                this.f38179I = new C17244x0(49, jSONObject).m92064b();
            } catch (Exception e11) {
                this.f38179I = null;
                AbstractC20110a.m104536e(e11);
            }
        }
    }

    /* renamed from: F */
    void m35786F(ContactProfile contactProfile) {
        if (contactProfile != null) {
            try {
                if (contactProfile.m40424q0() == 10) {
                    C28905e.m144373n().m144402x(contactProfile.f42416j0 + "", 10, 1, C23793c.m124316k().mo124311f(), contactProfile.f42422m0);
                } else if (contactProfile.m40424q0() == 13) {
                    C28905e.m144373n().m144402x(contactProfile.f42416j0 + "", 10, 4, C23793c.m124316k().mo124311f(), contactProfile.f42422m0);
                } else if (contactProfile.m40424q0() == 14) {
                    C28905e.m144373n().m144402x(contactProfile.f42416j0 + "", 10, 6, C23793c.m124316k().mo124311f(), contactProfile.f42422m0);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: G */
    void m35787G(C6989i c6989i, int i11, boolean z11, int i12, int i13) {
        try {
            if (i11 > 0) {
                c6989i.f38221h.setBackgroundResource(i12);
                if (z11) {
                    c6989i.f38221h.setText(this.f38183q.getString(AbstractC8020f0.str_noti_N_character));
                } else if (i11 > 5) {
                    c6989i.f38221h.setText(this.f38183q.getString(AbstractC8020f0.str_noti_over_5));
                } else {
                    c6989i.f38221h.setText(String.valueOf(i11));
                }
                c6989i.f38221h.setVisibility(0);
                if (i13 == 34) {
                    c6989i.f38225l.setVisibility(0);
                    return;
                } else {
                    c6989i.f38225l.setVisibility(8);
                    return;
                }
            }
            c6989i.f38221h.setVisibility(8);
            c6989i.f38225l.setVisibility(8);
        } catch (Resources.NotFoundException e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f38186t.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i11) {
        ContactProfile contactProfile;
        C31973j5 m40388T;
        try {
            C6986f item = getItem(i11);
            if (item != null && (contactProfile = item.f38205a) != null) {
                if (contactProfile.f42434r.equals("-2")) {
                    return 5;
                }
                if (contactProfile.f42434r.equals("-1")) {
                    return 6;
                }
                if (contactProfile.f42434r.equals("-3")) {
                    return 7;
                }
                if (contactProfile.f42434r.equals("-4")) {
                    return 9;
                }
                if (contactProfile.f42434r.equals("-7")) {
                    return 10;
                }
                if (!contactProfile.f42434r.equals("-5") && !contactProfile.f42434r.equals("-6") && !contactProfile.f42434r.equals("-18")) {
                    if (contactProfile.m40424q0() == 14) {
                        return 4;
                    }
                    if (contactProfile.m40374K0() && (m40388T = contactProfile.m40388T(true)) != null && m40388T.m153762h() != null) {
                        int size = m40388T.m153762h().size();
                        if (size == 0 || size == 1) {
                            return 0;
                        }
                        if (size == 2) {
                            return 1;
                        }
                        if (size == 3) {
                            return 2;
                        }
                        return 3;
                    }
                }
                return 8;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x04e6 A[Catch: Exception -> 0x02d7, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0533 A[Catch: Exception -> 0x02d7, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05bc A[Catch: Exception -> 0x02d7, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05d5 A[Catch: Exception -> 0x02d7, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x061f A[Catch: Exception -> 0x02d7, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0542 A[Catch: Exception -> 0x02d7, TRY_LEAVE, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0515 A[Catch: Exception -> 0x02d7, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0526 A[Catch: Exception -> 0x02d7, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0b70 A[Catch: Exception -> 0x02d7, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0b58  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0c72 A[Catch: Exception -> 0x02d7, TryCatch #2 {Exception -> 0x02d7, blocks: (B:8:0x0266, B:10:0x0270, B:31:0x0c1b, B:33:0x0c2f, B:35:0x0c35, B:37:0x0c40, B:39:0x0c4c, B:41:0x0c52, B:43:0x0c56, B:45:0x0c60, B:46:0x0c6e, B:48:0x0c72, B:50:0x0c7b, B:51:0x0c7f, B:53:0x0c83, B:54:0x0c91, B:62:0x02ca, B:65:0x02df, B:67:0x02e5, B:69:0x02e9, B:72:0x02fa, B:75:0x033e, B:77:0x0347, B:80:0x034f, B:82:0x0352, B:84:0x0356, B:87:0x035e, B:89:0x0368, B:91:0x0377, B:93:0x03a4, B:96:0x03ab, B:103:0x03e5, B:109:0x03e2, B:112:0x037f, B:114:0x0389, B:115:0x0391, B:117:0x039b, B:122:0x03ef, B:124:0x03fa, B:125:0x03ff, B:128:0x044a, B:130:0x0462, B:132:0x04c1, B:137:0x04cf, B:140:0x04d6, B:142:0x04e6, B:144:0x052b, B:146:0x0533, B:147:0x05b8, B:149:0x05bc, B:151:0x05c0, B:153:0x05c6, B:154:0x05cd, B:156:0x05d5, B:158:0x05dd, B:160:0x05e5, B:162:0x05e9, B:163:0x0609, B:164:0x061b, B:166:0x061f, B:168:0x063a, B:169:0x0648, B:170:0x0602, B:171:0x060f, B:172:0x0542, B:187:0x05b3, B:191:0x05b0, B:192:0x04fa, B:194:0x0502, B:198:0x050e, B:200:0x0515, B:201:0x0526, B:204:0x0655, B:206:0x065b, B:208:0x0663, B:210:0x067e, B:211:0x06ba, B:213:0x06c2, B:215:0x06e4, B:217:0x06ea, B:219:0x06f2, B:222:0x06fa, B:224:0x0704, B:225:0x071e, B:226:0x0737, B:228:0x073d, B:230:0x0747, B:231:0x0761, B:232:0x077a, B:233:0x0787, B:234:0x0b1e, B:236:0x0b28, B:239:0x0b31, B:243:0x0b3a, B:244:0x0b4c, B:247:0x0b59, B:250:0x0b69, B:252:0x0b70, B:254:0x0b74, B:255:0x0b79, B:258:0x0b40, B:260:0x0798, B:261:0x06a0, B:262:0x07be, B:264:0x07c6, B:266:0x07e1, B:267:0x081d, B:269:0x0825, B:271:0x084e, B:273:0x0866, B:274:0x086b, B:275:0x0886, B:276:0x0869, B:277:0x0879, B:278:0x0895, B:279:0x0803, B:280:0x08bb, B:282:0x08d6, B:284:0x08db, B:285:0x09a3, B:287:0x09b0, B:288:0x09d2, B:290:0x09d6, B:291:0x0a64, B:293:0x0a69, B:296:0x0a73, B:297:0x0ab4, B:299:0x0ab8, B:303:0x0aa0, B:305:0x0a88, B:307:0x0a92, B:313:0x09df, B:315:0x09e5, B:319:0x09ee, B:320:0x0a51, B:323:0x0a61, B:325:0x09f4, B:327:0x09fe, B:328:0x0a13, B:329:0x0a28, B:330:0x0a3d, B:331:0x09b8, B:332:0x08fe, B:334:0x0908, B:335:0x0924, B:336:0x0946, B:338:0x094f, B:340:0x0956, B:341:0x096c, B:343:0x0972, B:344:0x0988, B:345:0x0ace, B:347:0x0ad4, B:349:0x03fd, B:350:0x0b80, B:352:0x0b87, B:354:0x0b8f, B:356:0x0b97, B:358:0x0b9b, B:360:0x0ba5, B:361:0x0bb4, B:363:0x0bb8, B:366:0x0bdf, B:367:0x0c0a, B:368:0x0c12, B:370:0x0c16, B:99:0x03b1, B:101:0x03c1, B:104:0x03d1, B:175:0x0550, B:177:0x0559, B:179:0x0567, B:181:0x0583), top: B:7:0x0266, inners: #1, #3 }] */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View getView(final int i11, View view, ViewGroup viewGroup) {
        final C6989i c6989i;
        View view2;
        final MessagesListOAAdapter messagesListOAAdapter;
        Badge badge;
        boolean z11;
        boolean z12;
        boolean z13;
        int m118669P;
        Button button;
        InterfaceC6988h interfaceC6988h;
        final C31980jc m115161u;
        C3430i c3430i;
        ViewStub viewStub;
        View view3;
        View inflate;
        int itemViewType = getItemViewType(i11);
        if (view == null) {
            C6989i c6989i2 = new C6989i();
            if (itemViewType == 5) {
                inflate = this.f38182p.inflate(AbstractC7409c0.seperate_list_global_search, viewGroup, false);
                c6989i2.f38230q = inflate.findViewById(AbstractC6918a0.extra_view_item_end);
            } else if (itemViewType == 6) {
                inflate = this.f38182p.inflate(AbstractC7409c0.header_row_global_search, viewGroup, false);
                c6989i2.f38231r = (TextView) inflate.findViewById(AbstractC6918a0.title_label);
                c6989i2.f38232s = (TextView) inflate.findViewById(AbstractC6918a0.title_funtion);
            } else if (itemViewType == 7) {
                inflate = this.f38182p.inflate(AbstractC7409c0.find_more_oa_layout_item_list, viewGroup, false);
                c6989i2.f38238y = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.buddy_dp);
                c6989i2.f38233t = (TextView) inflate.findViewById(AbstractC6918a0.title_find_more);
                c6989i2.f38234u = (TextView) inflate.findViewById(AbstractC6918a0.desc_find_more);
                c6989i2.f38235v = (TextView) inflate.findViewById(AbstractC6918a0.action_find_more);
            } else if (itemViewType == 8) {
                inflate = this.f38182p.inflate(AbstractC7409c0.item_see_more_global_search, viewGroup, false);
                c6989i2.f38236w = inflate.findViewById(AbstractC6918a0.separate_line1);
                c6989i2.f38237x = (TextView) inflate.findViewById(AbstractC6918a0.tvTitleSeeMore);
                c6989i2.f38213F[0] = (GroupAvatarView) inflate.findViewById(AbstractC6918a0.img_avatar_1);
                c6989i2.f38213F[1] = (GroupAvatarView) inflate.findViewById(AbstractC6918a0.img_avatar_2);
                c6989i2.f38213F[2] = (GroupAvatarView) inflate.findViewById(AbstractC6918a0.img_avatar_3);
                c6989i2.f38209B = (TextView) inflate.findViewById(AbstractC6918a0.tvCount);
                c6989i2.f38223j = (ImageView) inflate.findViewById(AbstractC6918a0.icon_next);
            } else if (itemViewType == 9) {
                inflate = this.f38182p.inflate(AbstractC7409c0.item_channel_media_box, viewGroup, false);
                c6989i2.f38211D = (ZaloZinstantCommonLayout) inflate.findViewById(AbstractC6918a0.channel_zinstant);
                if (this.f38179I == null) {
                    c6989i2.f38211D.setVisibility(8);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C24860q("js.action.channel", this.f38180J));
                    c6989i2.f38211D.setActions(arrayList);
                    c6989i2.f38211D.m91433f1(this.f38179I);
                    AbstractC0924m0.m3967kl(false);
                    m35771i(c6989i2.f38211D);
                }
            } else if (itemViewType == 10) {
                C6981a c6981a = new C6981a(viewGroup.getContext());
                c6981a.setContextProvider(new C6982b(viewGroup));
                AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
                c6981a.setLayoutParams(layoutParams);
                c6981a.setZinstantLayoutParams(layoutParams);
                c6989i2.f38212E = c6981a;
                m35771i(c6981a);
                C6986f item = getItem(i11);
                if (!(item instanceof C6987g)) {
                    c6989i2.f38212E.setVisibility(8);
                } else {
                    C6987g c6987g = (C6987g) item;
                    InterfaceC22508f interfaceC22508f = c6987g.f38206b;
                    if (interfaceC22508f == null) {
                        c6989i2.f38212E.setVisibility(8);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new C24860q("js.action.oa", c6987g.f38207c));
                        c6989i2.f38212E.setActions(arrayList2);
                        c6989i2.f38212E.m91433f1(interfaceC22508f);
                        c6989i2.f38212E.setVisibility(0);
                    }
                }
                inflate = c6981a;
            } else if (itemViewType != 4) {
                inflate = this.f38182p.inflate(AbstractC7409c0.messages_oa_row, viewGroup, false);
                c6989i2.f38214a = (GroupAvatarView) inflate.findViewById(AbstractC6918a0.buddy_dp);
                c6989i2.f38215b = (ImageView) inflate.findViewById(AbstractC6918a0.file_preview_icon);
                c6989i2.f38226m = inflate.findViewById(AbstractC6918a0.layout_custom_message);
                c6989i2.f38216c = (RobotoTextModulesView) inflate.findViewById(AbstractC6918a0.custom_message);
                c6989i2.f38217d = (RobotoTextView) inflate.findViewById(AbstractC6918a0.custom_message_group);
                c6989i2.f38218e = (TextView) inflate.findViewById(AbstractC6918a0.tv_chat_txt_sms_indicator);
                c6989i2.f38219f = (RobotoTextView) inflate.findViewById(AbstractC6918a0.date_time_message);
                c6989i2.f38220g = (RobotoTextView) inflate.findViewById(AbstractC6918a0.name);
                c6989i2.f38221h = (TextView) inflate.findViewById(AbstractC6918a0.numnotification);
                c6989i2.f38222i = (ImageView) inflate.findViewById(AbstractC6918a0.ic_VipStatus);
                c6989i2.f38224k = (ImageView) inflate.findViewById(AbstractC6918a0.ic_mute_message);
                c6989i2.f38225l = inflate.findViewById(AbstractC6918a0.ic_unread_msg_feed);
                c6989i2.f38227n = (Button) inflate.findViewById(AbstractC6918a0.btnAct);
                c6989i2.f38228o = (TextView) inflate.findViewById(AbstractC6918a0.txt_adsmsg);
                c6989i2.f38239z = inflate.findViewById(AbstractC6918a0.layout_datetime_message);
                c6989i2.f38210C = (Badge) inflate.findViewById(AbstractC6918a0.sideTagline);
            } else {
                inflate = this.f38182p.inflate(AbstractC7409c0.messages_edit_row_sticky_gif, viewGroup, false);
                ZSimpleGIFView zSimpleGIFView = (ZSimpleGIFView) inflate.findViewById(AbstractC6918a0.simpleGifStickyMsg);
                c6989i2.f38229p = zSimpleGIFView;
                zSimpleGIFView.setCropMode(1);
            }
            inflate.setTag(c6989i2);
            c6989i = c6989i2;
            view2 = inflate;
        } else {
            c6989i = (C6989i) view.getTag();
            view2 = view;
        }
        try {
            final ContactProfile contactProfile = getItem(i11).f38205a;
            if (contactProfile != null) {
                String mo2478b = contactProfile.mo2478b();
                try {
                    String m119222U0 = AbstractC23160o0.m119222U0(contactProfile.m40402e0(), true);
                    C3430i c3430i2 = c6989i.f38208A;
                    if (c3430i2 != null && (view3 = c3430i2.f14376p) != null) {
                        view3.setVisibility(8);
                        RobotoTextView robotoTextView = c6989i.f38219f;
                        if (robotoTextView != null) {
                            robotoTextView.setVisibility(0);
                        }
                        View view4 = c6989i.f38239z;
                        if (view4 != null) {
                            ((ViewGroup.MarginLayoutParams) view4.getLayoutParams()).rightMargin = 0;
                        }
                    }
                    if (itemViewType == 5) {
                        View view5 = c6989i.f38230q;
                        if (view5 != null) {
                            view5.setVisibility(contactProfile.f42405d1 ? 0 : 8);
                        }
                    } else {
                        if (itemViewType == 6) {
                            c6989i.f38232s.setVisibility(8);
                            if (contactProfile.f42434r.equals("-1")) {
                                messagesListOAAdapter = this;
                                c6989i.f38231r.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.label_section_suggest_oa));
                            }
                        } else {
                            messagesListOAAdapter = this;
                            if (itemViewType == 9) {
                                if (AbstractC0924m0.m3987lb() && messagesListOAAdapter.f38179I != null) {
                                    c6989i.f38211D.m91999q0("js.action.channel", messagesListOAAdapter.f38180J);
                                    AbstractC0924m0.m3967kl(false);
                                }
                            } else if (itemViewType == 7) {
                                c6989i.f38233t.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.mypages_find_more_title));
                                c6989i.f38234u.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.mypages_find_more_desc));
                                c6989i.f38235v.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.str_btn_find_more_oa));
                                view2.findViewById(AbstractC6918a0.ic_close_view).setVisibility(4);
                                c6989i.f38238y.setImageDrawable(messagesListOAAdapter.f38183q.getDrawable(AbstractC16803z.media_oa_less));
                            } else {
                                ArrayList arrayList3 = null;
                                if (itemViewType == 8) {
                                    view2.setBackgroundResource(AbstractC16803z.stencils_bg_white_with_press_state);
                                    View view6 = c6989i.f38236w;
                                    if (view6 != null) {
                                        view6.setVisibility(contactProfile.f42407e1 ? 8 : 0);
                                    }
                                    TextView textView = c6989i.f38237x;
                                    if (textView != null) {
                                        textView.setText(contactProfile.f42437s);
                                    }
                                    for (int i12 = 0; i12 < 3; i12++) {
                                        c6989i.f38213F[i12].setVisibility(8);
                                    }
                                    c6989i.f38209B.setVisibility(8);
                                    if (contactProfile.f42434r.equals("-5")) {
                                        c6989i.f38223j.setVisibility(8);
                                        arrayList3 = messagesListOAAdapter.f38187u;
                                    } else if (contactProfile.f42434r.equals("-6")) {
                                        c6989i.f38223j.setVisibility(0);
                                        arrayList3 = messagesListOAAdapter.f38189w;
                                    } else if (contactProfile.f42434r.equals("-18")) {
                                        c6989i.f38223j.setVisibility(0);
                                        arrayList3 = messagesListOAAdapter.f38188v;
                                    }
                                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                                            try {
                                                ContactProfile contactProfile2 = (ContactProfile) arrayList3.get(i13);
                                                if (contactProfile2.f42434r.equals("-16")) {
                                                    c6989i.f38209B.setText(contactProfile2.f42437s);
                                                    c6989i.f38209B.setVisibility(0);
                                                } else {
                                                    c6989i.f38213F[i13].setVisibility(0);
                                                    AbstractC23268y2.m120027a(c6989i.f38213F[i13], contactProfile2, messagesListOAAdapter.f38184r);
                                                }
                                            } catch (Exception e11) {
                                                e11.printStackTrace();
                                            }
                                        }
                                    }
                                } else if (itemViewType != 4 && itemViewType != 10) {
                                    messagesListOAAdapter.m35780u(contactProfile, messagesListOAAdapter);
                                    view2.setBackgroundResource(messagesListOAAdapter.m35790n(contactProfile.f42434r) ? AbstractC16803z.stencils_contact_bg_new : AbstractC16803z.stencils_contact_bg);
                                    messagesListOAAdapter.m35786F(contactProfile);
                                    c6989i.f38220g.setTextStyleBold(false);
                                    messagesListOAAdapter.m35783C(c6989i.f38220g, messagesListOAAdapter.f38172B);
                                    messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38173C);
                                    messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38173C);
                                    messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38173C);
                                    c6989i.f38219f.setTextStyleBold(false);
                                    c6989i.f38219f.setCompoundDrawables(null, null, null, null);
                                    c6989i.f38222i.setVisibility(8);
                                    c6989i.f38225l.setVisibility(8);
                                    c6989i.f38224k.setVisibility(C0804b.m2025g().m2033i(mo2478b) ? 0 : 8);
                                    c6989i.f38217d.setVisibility(8);
                                    c6989i.f38227n.setVisibility(8);
                                    c6989i.f38228o.setVisibility(8);
                                    if (!contactProfile.m40374K0()) {
                                        c6989i.f38214a.setStrokeDisableColor(AbstractC22055v0.m115162v(messagesListOAAdapter.f38192z));
                                        c6989i.f38214a.setStateLoadingStory(AbstractC22055v0.m115112B(contactProfile.f42434r));
                                        c6989i.f38214a.m75736i(AbstractC22055v0.m115116F(contactProfile.f42434r, AbstractC21244b.m110054d(messagesListOAAdapter.f38192z)), AbstractC22055v0.m115115E(contactProfile.f42434r, AbstractC21244b.m110054d(messagesListOAAdapter.f38192z)));
                                        c6989i.f38214a.m75731c(contactProfile);
                                        c6989i.f38214a.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.d4
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view7) {
                                                MessagesListOAAdapter.this.m35774o(contactProfile, c6989i, view7);
                                            }
                                        });
                                        c6989i.f38214a.setClickable(AbstractC22055v0.m115114D(contactProfile.f42434r, AbstractC21244b.m110054d(messagesListOAAdapter.f38192z)));
                                        if (!C21927m.m114302u().m114318P(contactProfile.f42434r) && !AbstractC25495a.m132086k(contactProfile.f42434r)) {
                                            z12 = false;
                                            if (!z12 && !contactProfile.m40387S0()) {
                                                if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                                                    c6989i.f38222i.setImageDrawable(messagesListOAAdapter.f38183q.getDrawable(AbstractC16803z.ic_banned));
                                                    c6989i.f38222i.setVisibility(0);
                                                }
                                                if (!contactProfile.f42399a1.isEmpty()) {
                                                    c6989i.f38220g.setText(contactProfile.m40383Q(true, false).trim());
                                                } else {
                                                    SpannableString spannableString = new SpannableString(contactProfile.m40383Q(true, false).trim());
                                                    int i14 = 0;
                                                    for (int i15 = 1; i14 < contactProfile.f42399a1.size() - i15; i15 = 1) {
                                                        try {
                                                            if (((Integer) contactProfile.f42399a1.get(i14)).intValue() >= 0) {
                                                                int i16 = i14 + 1;
                                                                if (((Integer) contactProfile.f42399a1.get(i16)).intValue() > ((Integer) contactProfile.f42399a1.get(i14)).intValue()) {
                                                                    spannableString.setSpan(new StyleSpan(i15), ((Integer) contactProfile.f42399a1.get(i14)).intValue(), ((Integer) contactProfile.f42399a1.get(i16)).intValue(), 33);
                                                                }
                                                            }
                                                            i14 += 2;
                                                        } catch (Exception e12) {
                                                            e12.toString();
                                                        }
                                                    }
                                                    c6989i.f38220g.setText(spannableString);
                                                }
                                                if (contactProfile.f42411g1 && (interfaceC6988h = messagesListOAAdapter.f38181K) != null && interfaceC6988h.mo35808wB() == 0) {
                                                    messagesListOAAdapter.f38181K.mo35803d9(contactProfile.f42434r);
                                                }
                                                if (contactProfile.f42434r.equals("-1") && contactProfile.m40424q0() == 13) {
                                                    if (!TextUtils.isEmpty(contactProfile.f42419k1) && (button = c6989i.f38227n) != null) {
                                                        button.setText(contactProfile.f42419k1.toUpperCase());
                                                        c6989i.f38227n.setVisibility(0);
                                                        c6989i.f38227n.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.e4
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view7) {
                                                                MessagesListOAAdapter.this.m35775p(i11, view7);
                                                            }
                                                        });
                                                    } else {
                                                        c6989i.f38227n.setVisibility(8);
                                                    }
                                                    c6989i.f38228o.setVisibility(0);
                                                } else {
                                                    c6989i.f38227n.setVisibility(8);
                                                    c6989i.f38228o.setVisibility(8);
                                                }
                                                if (contactProfile.f42356L1) {
                                                    c6989i.f38227n.setVisibility(0);
                                                    c6989i.f38227n.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.f4
                                                        @Override // android.view.View.OnClickListener
                                                        public final void onClick(View view7) {
                                                            MessagesListOAAdapter.this.m35776q(contactProfile, view7);
                                                        }
                                                    });
                                                    if (C21927m.m114302u().m114318P(contactProfile.f42434r)) {
                                                        c6989i.f38227n.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.str_view));
                                                    } else {
                                                        c6989i.f38227n.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.btn_vip_follow));
                                                    }
                                                }
                                            }
                                            if (!ContactProfile.m40345C0(contactProfile.f42352K0) && !AbstractC25495a.m132086k(contactProfile.f42434r)) {
                                                z13 = false;
                                                m118669P = AbstractC23136l9.m118669P(z13, z12);
                                                if (m118669P == -1) {
                                                    c6989i.f38222i.setImageDrawable(messagesListOAAdapter.f38183q.getDrawable(m118669P));
                                                    c6989i.f38222i.setVisibility(0);
                                                } else {
                                                    c6989i.f38222i.setVisibility(8);
                                                }
                                                if (!contactProfile.f42399a1.isEmpty()) {
                                                }
                                                if (contactProfile.f42411g1) {
                                                    messagesListOAAdapter.f38181K.mo35803d9(contactProfile.f42434r);
                                                }
                                                if (contactProfile.f42434r.equals("-1")) {
                                                }
                                                c6989i.f38227n.setVisibility(8);
                                                c6989i.f38228o.setVisibility(8);
                                                if (contactProfile.f42356L1) {
                                                }
                                            }
                                            z13 = true;
                                            m118669P = AbstractC23136l9.m118669P(z13, z12);
                                            if (m118669P == -1) {
                                            }
                                            if (!contactProfile.f42399a1.isEmpty()) {
                                            }
                                            if (contactProfile.f42411g1) {
                                            }
                                            if (contactProfile.f42434r.equals("-1")) {
                                            }
                                            c6989i.f38227n.setVisibility(8);
                                            c6989i.f38228o.setVisibility(8);
                                            if (contactProfile.f42356L1) {
                                            }
                                        }
                                        z12 = true;
                                        if (!z12) {
                                            if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                                            }
                                            if (!contactProfile.f42399a1.isEmpty()) {
                                            }
                                            if (contactProfile.f42411g1) {
                                            }
                                            if (contactProfile.f42434r.equals("-1")) {
                                            }
                                            c6989i.f38227n.setVisibility(8);
                                            c6989i.f38228o.setVisibility(8);
                                            if (contactProfile.f42356L1) {
                                            }
                                        }
                                        if (!ContactProfile.m40345C0(contactProfile.f42352K0)) {
                                            z13 = false;
                                            m118669P = AbstractC23136l9.m118669P(z13, z12);
                                            if (m118669P == -1) {
                                            }
                                            if (!contactProfile.f42399a1.isEmpty()) {
                                            }
                                            if (contactProfile.f42411g1) {
                                            }
                                            if (contactProfile.f42434r.equals("-1")) {
                                            }
                                            c6989i.f38227n.setVisibility(8);
                                            c6989i.f38228o.setVisibility(8);
                                            if (contactProfile.f42356L1) {
                                            }
                                        }
                                        z13 = true;
                                        m118669P = AbstractC23136l9.m118669P(z13, z12);
                                        if (m118669P == -1) {
                                        }
                                        if (!contactProfile.f42399a1.isEmpty()) {
                                        }
                                        if (contactProfile.f42411g1) {
                                        }
                                        if (contactProfile.f42434r.equals("-1")) {
                                        }
                                        c6989i.f38227n.setVisibility(8);
                                        c6989i.f38228o.setVisibility(8);
                                        if (contactProfile.f42356L1) {
                                        }
                                    }
                                    if (contactProfile.m40433v0() <= 0) {
                                        if (AbstractC25495a.m132081f(contactProfile.f42434r)) {
                                            c6989i.f38218e.setVisibility(8);
                                            c6989i.f38215b.setVisibility(8);
                                            c6989i.f38216c.setVisibility(0);
                                            if (C19636i1.m102737w().m102761R(mo2478b)) {
                                                c6989i.f38220g.setTextStyleBold(true);
                                                messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38172B);
                                                messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38172B);
                                                c6989i.f38219f.setTextStyleBold(true);
                                                messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38172B);
                                            } else {
                                                c6989i.f38220g.setTextStyleBold(false);
                                                messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38173C);
                                                messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38173C);
                                                messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38173C);
                                            }
                                            if (AbstractC25495a.m132081f(contactProfile.f42434r)) {
                                                c6989i.f38222i.setVisibility(8);
                                                c6989i.f38219f.setVisibility(8);
                                                c6989i.f38219f.setText(m119222U0);
                                                c6989i.f38220g.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.oa_msg_thread_title));
                                                InterfaceC6988h interfaceC6988h2 = messagesListOAAdapter.f38181K;
                                                if (interfaceC6988h2 != null && interfaceC6988h2.mo35808wB() == 0 && !TextUtils.isEmpty(contactProfile.f42437s)) {
                                                    if (!contactProfile.m40377M0()) {
                                                        if (!TextUtils.isEmpty(contactProfile.m40378N())) {
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append(contactProfile.f42437s);
                                                            sb2.append(": ");
                                                            sb2.append(contactProfile.m40378N());
                                                            c6989i.f38216c.setText(sb2);
                                                        } else {
                                                            c6989i.f38216c.setText(String.format(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.cm_vipmsg), contactProfile.f42437s));
                                                        }
                                                    } else if (!AbstractC19646n0.m102948Y0(contactProfile)) {
                                                        if (!TextUtils.isEmpty(contactProfile.m40378N())) {
                                                            StringBuilder sb3 = new StringBuilder();
                                                            sb3.append(contactProfile.f42437s);
                                                            sb3.append(": ");
                                                            sb3.append(contactProfile.m40378N());
                                                            c6989i.f38216c.setText(sb3);
                                                        } else {
                                                            c6989i.f38216c.setText(String.format(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.cm_send_vipmsg), contactProfile.f42437s));
                                                        }
                                                    } else {
                                                        c6989i.f38216c.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.cm_draft_vipmsg));
                                                    }
                                                }
                                                m35787G(c6989i, C19669z.f97580b0, true, AbstractC16803z.stencils_bg_number_notif, contactProfile.m40432u0());
                                            } else {
                                                c6989i.f38219f.setVisibility(4);
                                                c6989i.f38221h.setVisibility(8);
                                                c6989i.f38220g.setText(contactProfile.m40383Q(true, false).trim());
                                                c6989i.f38216c.setText(contactProfile.m40378N());
                                            }
                                        } else if (AbstractC25495a.m132084i(contactProfile.f42434r)) {
                                            c6989i.f38218e.setVisibility(8);
                                            c6989i.f38215b.setVisibility(8);
                                            c6989i.f38216c.setVisibility(0);
                                            if (C19636i1.m102737w().m102761R(mo2478b)) {
                                                c6989i.f38220g.setTextStyleBold(true);
                                                messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38172B);
                                                messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38172B);
                                                c6989i.f38219f.setTextStyleBold(true);
                                                messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38172B);
                                            } else {
                                                c6989i.f38220g.setTextStyleBold(false);
                                                messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38173C);
                                                messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38173C);
                                                messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38173C);
                                            }
                                            if (AbstractC25495a.m132084i(contactProfile.f42434r)) {
                                                c6989i.f38219f.setVisibility(0);
                                                c6989i.f38219f.setText(m119222U0);
                                                c6989i.f38220g.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.title_strangermsg));
                                                int m103222h0 = C19669z.m103146Y().m103222h0();
                                                int m102741B = C19636i1.m102737w().m102741B();
                                                if (m103222h0 > 0) {
                                                    RobotoTextModulesView robotoTextModulesView = c6989i.f38216c;
                                                    String string = messagesListOAAdapter.f38183q.getString(AbstractC8020f0.cm_strangermsg_with_count);
                                                    Object[] objArr = new Object[2];
                                                    objArr[0] = Integer.valueOf(m103222h0);
                                                    objArr[1] = messagesListOAAdapter.f38183q.getString(m103222h0 > 1 ? AbstractC8020f0.str_more_s : AbstractC8020f0.str_single_form);
                                                    robotoTextModulesView.setText(String.format(string, objArr));
                                                } else {
                                                    c6989i.f38216c.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.cm_strangermsg));
                                                }
                                                m35787G(c6989i, m102741B, false, AbstractC16803z.stencils_bg_number_notif_stranger_item, contactProfile.m40432u0());
                                            } else {
                                                c6989i.f38219f.setVisibility(4);
                                                c6989i.f38221h.setVisibility(8);
                                                c6989i.f38220g.setText(contactProfile.m40383Q(true, false).trim());
                                                c6989i.f38216c.setText(contactProfile.m40378N());
                                            }
                                        } else {
                                            c6989i.f38215b.setVisibility(8);
                                            c6989i.f38216c.setVisibility(8);
                                            c6989i.f38218e.setVisibility(8);
                                            if (C19636i1.m102737w().m102762S(mo2478b)) {
                                                if (contactProfile.f42375S != 3) {
                                                    c6989i.f38220g.setTextStyleBold(true);
                                                    messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38172B);
                                                    messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38172B);
                                                    c6989i.f38219f.setTextStyleBold(true);
                                                    messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38172B);
                                                } else if (C0804b.m2025g().m2033i(mo2478b)) {
                                                    c6989i.f38220g.setTextStyleBold(false);
                                                    messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38173C);
                                                    messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38173C);
                                                    messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38173C);
                                                } else {
                                                    c6989i.f38220g.setTextStyleBold(true);
                                                    messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38172B);
                                                    messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38172B);
                                                    c6989i.f38219f.setTextStyleBold(true);
                                                    messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38172B);
                                                }
                                            } else {
                                                c6989i.f38220g.setTextStyleBold(false);
                                                InterfaceC6988h interfaceC6988h3 = messagesListOAAdapter.f38181K;
                                                if (interfaceC6988h3 != null && interfaceC6988h3.mo35808wB() == 1) {
                                                    messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38173C);
                                                    messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38173C);
                                                    messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38173C);
                                                } else if (!AbstractC19646n0.m102948Y0(contactProfile)) {
                                                    messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38173C);
                                                    messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38173C);
                                                    messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38173C);
                                                } else {
                                                    messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38172B);
                                                    messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38172B);
                                                    c6989i.f38219f.setTextStyleBold(true);
                                                    messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38173C);
                                                }
                                            }
                                            contactProfile.m40432u0();
                                            if (TextUtils.isEmpty(contactProfile.m40378N())) {
                                                c6989i.f38226m.setVisibility(8);
                                            } else {
                                                c6989i.f38216c.setText(contactProfile.m40378N());
                                                c6989i.f38216c.setVisibility(0);
                                                c6989i.f38215b.setVisibility(8);
                                                c6989i.f38226m.setVisibility(0);
                                            }
                                            if (contactProfile.f42356L1) {
                                                c6989i.f38219f.setVisibility(8);
                                            } else {
                                                if (!AbstractC19646n0.m102948Y0(contactProfile)) {
                                                    int m40398b0 = contactProfile.m40398b0();
                                                    if (m40398b0 == 0) {
                                                        messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38175E);
                                                        c6989i.f38219f.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.deliveried_message_send_fail));
                                                    } else if (m40398b0 != 1) {
                                                        c6989i.f38219f.setText(m119222U0);
                                                    } else if (C0814e0.m2059e(contactProfile.m40394Y())) {
                                                        messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38177G);
                                                        c6989i.f38219f.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.sending_message_state));
                                                    } else {
                                                        messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38175E);
                                                        c6989i.f38219f.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.deliveried_message_send_fail));
                                                    }
                                                } else {
                                                    messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38176F);
                                                    c6989i.f38219f.setText(messagesListOAAdapter.f38183q.getString(AbstractC8020f0.deliveried_message_draft_state));
                                                }
                                                RobotoTextView robotoTextView2 = c6989i.f38219f;
                                                robotoTextView2.setVisibility(!TextUtils.isEmpty(robotoTextView2.getText()) ? 0 : 8);
                                            }
                                            InterfaceC6988h interfaceC6988h4 = messagesListOAAdapter.f38181K;
                                            int mo35808wB = interfaceC6988h4 != null ? interfaceC6988h4.mo35808wB() : -1;
                                            if (mo35808wB == 1) {
                                                m35787G(c6989i, 0, true, AbstractC16803z.stencils_bg_number_notif, contactProfile.m40432u0());
                                            } else {
                                                if (mo35808wB != 2 && mo35808wB == 0) {
                                                    z11 = !AbstractC25495a.m132086k(contactProfile.mo2478b()) && AbstractC21935u.m114518H(contactProfile.mo2478b());
                                                } else {
                                                    z11 = false;
                                                }
                                                m35787G(c6989i, C19636i1.m102737w().m102746E(mo2478b), z11, AbstractC16803z.stencils_bg_number_notif, contactProfile.m40432u0());
                                            }
                                            if (contactProfile.f42356L1) {
                                                messagesListOAAdapter.m35783C(c6989i.f38220g, messagesListOAAdapter.f38172B);
                                                messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38173C);
                                                messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38173C);
                                            }
                                        }
                                    } else if (contactProfile.m40433v0() > 0) {
                                        c6989i.f38218e.setVisibility(8);
                                        c6989i.f38215b.setVisibility(8);
                                        c6989i.f38219f.setVisibility(8);
                                        c6989i.f38221h.setVisibility(8);
                                        c6989i.f38216c.setText(contactProfile.m40378N());
                                        c6989i.f38216c.setVisibility(0);
                                        messagesListOAAdapter.m35784D(c6989i.f38216c, messagesListOAAdapter.f38172B);
                                        messagesListOAAdapter.m35783C(c6989i.f38217d, messagesListOAAdapter.f38172B);
                                        c6989i.f38220g.setText(contactProfile.f42437s.trim());
                                        c6989i.f38219f.setTextStyleBold(true);
                                        messagesListOAAdapter.m35783C(c6989i.f38219f, messagesListOAAdapter.f38172B);
                                    }
                                    ContactProfile m141811g = C28203u6.f131407a.m141811g(contactProfile.f42434r);
                                    boolean z14 = m141811g != null && m141811g.m40359B0();
                                    if (!contactProfile.m40384Q0() && !z14) {
                                        c6989i.f38220g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                                        RobotoTextModulesView robotoTextModulesView2 = c6989i.f38216c;
                                        robotoTextModulesView2.setTextStyleBold(robotoTextModulesView2.getCurrentTextColor() != messagesListOAAdapter.f38172B);
                                        RobotoTextView robotoTextView3 = c6989i.f38217d;
                                        robotoTextView3.setTextStyleBold(robotoTextView3.getCurrentTextColor() != messagesListOAAdapter.f38172B);
                                        badge = c6989i.f38210C;
                                        if (badge != null) {
                                            if (contactProfile.f42370Q0) {
                                                badge.setVisibility(0);
                                            } else {
                                                badge.setVisibility(8);
                                            }
                                        }
                                    }
                                    c6989i.f38222i.setImageResource(AbstractC16803z.ic_oa_verify);
                                    c6989i.f38222i.setVisibility(0);
                                    RobotoTextModulesView robotoTextModulesView22 = c6989i.f38216c;
                                    robotoTextModulesView22.setTextStyleBold(robotoTextModulesView22.getCurrentTextColor() != messagesListOAAdapter.f38172B);
                                    RobotoTextView robotoTextView32 = c6989i.f38217d;
                                    robotoTextView32.setTextStyleBold(robotoTextView32.getCurrentTextColor() != messagesListOAAdapter.f38172B);
                                    badge = c6989i.f38210C;
                                    if (badge != null) {
                                    }
                                } else if (getItemViewType(i11) == 4) {
                                    if (contactProfile.m40424q0() == 14 && !TextUtils.isEmpty(contactProfile.f42426o0)) {
                                        ZSimpleGIFView zSimpleGIFView2 = c6989i.f38229p;
                                        if (zSimpleGIFView2 != null) {
                                            if (zSimpleGIFView2.getLayoutParams().height != contactProfile.f42435r0) {
                                                c6989i.f38229p.getLayoutParams().height = contactProfile.f42435r0;
                                                c6989i.f38229p.requestLayout();
                                            }
                                            int i17 = contactProfile.f42424n0;
                                            if (i17 == 0) {
                                                c6989i.f38229p.setVisibility(0);
                                                c6989i.f38229p.m88227l(new ZSimpleGIFView.C16554f(contactProfile.f42426o0, contactProfile.f42429p0, contactProfile.f42432q0, contactProfile.f42435r0, "MessagesListOAAdapter"), i11, null);
                                            } else if (i17 == 1) {
                                                c6989i.f38229p.setVisibility(0);
                                                c6989i.f38229p.m88227l(new ZSimpleGIFView.C16554f(contactProfile.f42426o0, contactProfile.f42429p0, contactProfile.f42432q0, contactProfile.f42435r0, "MessagesListOAAdapter"), i11, null);
                                                c6989i.f38229p.m88224g(100L);
                                            } else {
                                                c6989i.f38229p.setVisibility(8);
                                            }
                                        }
                                    } else {
                                        ZSimpleGIFView zSimpleGIFView3 = c6989i.f38229p;
                                        if (zSimpleGIFView3 != null) {
                                            zSimpleGIFView3.setVisibility(8);
                                        }
                                    }
                                }
                            }
                        }
                        view2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.g4
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view7) {
                                MessagesListOAAdapter.this.m35777r(contactProfile, i11, view7);
                            }
                        });
                        view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.h4
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view7) {
                                boolean m35778s;
                                m35778s = MessagesListOAAdapter.this.m35778s(contactProfile, view7);
                                return m35778s;
                            }
                        });
                        if (!messagesListOAAdapter.f38191y && C22013a0.m114928g() && C22013a0.m114924c().m114932h(5)) {
                            m115161u = AbstractC22055v0.m115161u(contactProfile.f42434r);
                            if (AbstractC22055v0.m115113C(m115161u) && !m115161u.m153829v()) {
                                if (c6989i.f38208A == null && (viewStub = (ViewStub) view2.findViewById(AbstractC6918a0.stub_story_populate)) != null) {
                                    C3430i m17229k = C3430i.m17229k(viewStub.inflate());
                                    c6989i.f38208A = m17229k;
                                    m17229k.m17193f(7);
                                }
                                c3430i = c6989i.f38208A;
                                if (c3430i != null) {
                                    c3430i.f14376p.setVisibility(0);
                                    RobotoTextView robotoTextView4 = c6989i.f38219f;
                                    if (robotoTextView4 != null) {
                                        robotoTextView4.setVisibility(4);
                                    }
                                    View view7 = c6989i.f38239z;
                                    if (view7 != null) {
                                        ((ViewGroup.MarginLayoutParams) view7.getLayoutParams()).rightMargin = AbstractC32232i.m155453a(42.0f);
                                    }
                                    c6989i.f38208A.mo17230p(m115161u, messagesListOAAdapter.f38185s);
                                    c6989i.f38208A.f14376p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.i4
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view8) {
                                            MessagesListOAAdapter.this.m35779t(m115161u, c6989i, view8);
                                        }
                                    });
                                }
                            }
                        }
                    }
                    messagesListOAAdapter = this;
                    view2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.g4
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view72) {
                            MessagesListOAAdapter.this.m35777r(contactProfile, i11, view72);
                        }
                    });
                    view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.h4
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view72) {
                            boolean m35778s;
                            m35778s = MessagesListOAAdapter.this.m35778s(contactProfile, view72);
                            return m35778s;
                        }
                    });
                    if (!messagesListOAAdapter.f38191y) {
                        m115161u = AbstractC22055v0.m115161u(contactProfile.f42434r);
                        if (AbstractC22055v0.m115113C(m115161u)) {
                            if (c6989i.f38208A == null) {
                                C3430i m17229k2 = C3430i.m17229k(viewStub.inflate());
                                c6989i.f38208A = m17229k2;
                                m17229k2.m17193f(7);
                            }
                            c3430i = c6989i.f38208A;
                            if (c3430i != null) {
                            }
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    AbstractC20110a.m104539h(e);
                    return view2;
                }
            }
        } catch (Exception e14) {
            e = e14;
            AbstractC20110a.m104539h(e);
            return view2;
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 11;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < this.f38186t.size()) {
                    C6986f c6986f = (C6986f) this.f38186t.get(i11);
                    if (c6986f.f38205a != null) {
                        return c6986f.f38205a.m40366G0();
                    }
                    return false;
                }
                return false;
            } catch (Exception e11) {
                e11.printStackTrace();
                return false;
            }
        }
        return false;
    }

    /* renamed from: l */
    public List m35788l() {
        try {
            return new ArrayList(this.f38186t);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6986f getItem(int i11) {
        if (i11 >= 0) {
            try {
                if (i11 < this.f38186t.size()) {
                    return (C6986f) this.f38186t.get(i11);
                }
                return null;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
        return null;
    }

    /* renamed from: n */
    boolean m35790n(String str) {
        try {
            return this.f38190x.contains(str);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: v */
    public void m35791v(String str) {
        this.f38180J = str;
    }

    /* renamed from: w */
    public void m35792w(InterfaceC6988h interfaceC6988h) {
        this.f38181K = interfaceC6988h;
    }

    /* renamed from: x */
    public void m35793x(List list) {
        this.f38186t = new ArrayList(list);
    }

    /* renamed from: y */
    public void m35794y(List list) {
        if (list != null) {
            this.f38187u = new ArrayList(list);
        } else {
            this.f38187u.clear();
        }
    }

    /* renamed from: z */
    public void m35795z(List list) {
        if (list != null) {
            this.f38189w = new ArrayList(list);
        } else {
            this.f38189w.clear();
        }
    }
}
