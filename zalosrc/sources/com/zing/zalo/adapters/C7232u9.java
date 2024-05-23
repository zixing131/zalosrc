package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7192r2;
import com.zing.zalo.adapters.C7232u9;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.contact.ZaloListItemModuleView;
import com.zing.zalo.p077ui.widget.HeaderPageContactLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.zview.AbstractC17484n;
import com.zing.zalo.zview.ZaloView;
import ho0.AbstractC20110a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jm.AbstractC21289a;
import l30.AbstractC22055v0;
import l30.C22013a0;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p173fz.C19172a;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p542ub.InterfaceC27218a;

/* renamed from: com.zing.zalo.adapters.u9 */
/* loaded from: classes3.dex */
public class C7232u9 extends RecyclerView.AbstractC1880g implements C7192r2.b {

    /* renamed from: A */
    C23528a f39712A;

    /* renamed from: B */
    public AbstractC22055v0.l f39713B;

    /* renamed from: C */
    public c f39714C;

    /* renamed from: D */
    a f39715D;

    /* renamed from: E */
    public InterfaceC27218a f39716E;

    /* renamed from: F */
    private boolean f39717F;

    /* renamed from: r */
    boolean f39718r;

    /* renamed from: s */
    ArrayList f39719s = new ArrayList();

    /* renamed from: t */
    int f39720t;

    /* renamed from: u */
    int f39721u;

    /* renamed from: v */
    int f39722v;

    /* renamed from: w */
    int f39723w;

    /* renamed from: x */
    List f39724x;

    /* renamed from: y */
    List f39725y;

    /* renamed from: z */
    b f39726z;

    /* renamed from: com.zing.zalo.adapters.u9$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        boolean mo36928a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.u9$b */
    /* loaded from: classes3.dex */
    public class b extends f {

        /* renamed from: I */
        RobotoTextView f39727I;

        /* renamed from: J */
        RobotoTextView f39728J;

        /* renamed from: K */
        View f39729K;

        public b(View view, int i11) {
            super(view, i11);
            this.f39727I = (RobotoTextView) view.findViewById(AbstractC6918a0.title_row);
            this.f39728J = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_action);
            this.f39729K = view.findViewById(AbstractC6918a0.shadow_view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public /* synthetic */ void m36930k0(View view) {
            c cVar = C7232u9.this.f39714C;
            if (cVar != null) {
                cVar.mo36932F7("-5");
            }
        }

        @Override // com.zing.zalo.adapters.C7232u9.f
        /* renamed from: i0 */
        void mo36931i0(ContactProfile contactProfile, int i11, int i12) {
            int m118742r;
            Drawable m118665N;
            int i13;
            this.f39727I.setText(contactProfile.f42437s);
            int i14 = 0;
            if (contactProfile.f42335E1 > 0) {
                m118742r = 0;
            } else {
                m118742r = AbstractC23136l9.m118742r(7.0f);
            }
            this.f39727I.setPadding(0, m118742r, 0, m118742r);
            RobotoTextView robotoTextView = this.f39727I;
            if (contactProfile.f42335E1 > 0) {
                m118665N = null;
            } else {
                m118665N = AbstractC23136l9.m118665N(robotoTextView.getContext(), AbstractC16803z.ic_favorite_16);
            }
            robotoTextView.setCompoundDrawablesWithIntrinsicBounds(m118665N, (Drawable) null, (Drawable) null, (Drawable) null);
            RobotoTextView robotoTextView2 = this.f39728J;
            if (contactProfile.f42335E1 > 0) {
                i13 = 8;
            } else {
                i13 = 0;
            }
            robotoTextView2.setVisibility(i13);
            if (contactProfile.f42335E1 == 0) {
                this.f39728J.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.v9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7232u9.b.this.m36930k0(view);
                    }
                });
            }
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.f7784p.getLayoutParams();
            if (!contactProfile.f42407e1) {
                i14 = AbstractC23136l9.m118742r(8.0f);
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i14;
            this.f7784p.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.zing.zalo.adapters.u9$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: F7 */
        void mo36932F7(String str);

        /* renamed from: Gd */
        void mo36933Gd(int i11);

        /* renamed from: Pm */
        void mo36934Pm(String str);

        /* renamed from: U7 */
        void mo36935U7(String str, int i11, boolean z11, boolean z12, boolean z13);

        /* renamed from: y8 */
        void mo36936y8();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.u9$d */
    /* loaded from: classes3.dex */
    public class d extends f {

        /* renamed from: I */
        TextView f39731I;

        /* renamed from: J */
        TextView f39732J;

        /* renamed from: K */
        View f39733K;

        /* renamed from: L */
        View f39734L;

        /* renamed from: M */
        CompoundButton f39735M;

        /* renamed from: N */
        TextView f39736N;

        /* renamed from: O */
        TextView f39737O;

        /* renamed from: P */
        ImageView f39738P;

        /* renamed from: Q */
        ImageView f39739Q;

        /* renamed from: R */
        RobotoTextView f39740R;

        /* renamed from: S */
        RobotoTextView f39741S;

        /* renamed from: T */
        RobotoTextView f39742T;

        /* renamed from: U */
        View f39743U;

        /* renamed from: V */
        TextView f39744V;

        /* renamed from: W */
        RobotoTextView f39745W;

        d(View view, int i11) {
            super(view, i11);
            if (i11 == 2) {
                this.f39735M = (CompoundButton) view.findViewById(AbstractC6918a0.chShowHideRecentUpdate);
                this.f39733K = view.findViewById(AbstractC6918a0.separate_line);
                return;
            }
            if (i11 == 3) {
                this.f39736N = (TextView) view.findViewById(AbstractC6918a0.desUpdateStatus);
                this.f39737O = (TextView) view.findViewById(AbstractC6918a0.desEmptyList);
                this.f39738P = (ImageView) view.findViewById(AbstractC6918a0.ic_start_status);
                this.f39739Q = (ImageView) view.findViewById(AbstractC6918a0.ic_start_status_right);
                return;
            }
            if (i11 == 6) {
                this.f39744V = (TextView) view.findViewById(AbstractC6918a0.btnShowOnlineStatus);
                this.f39734L = view.findViewById(AbstractC6918a0.separate_line);
                return;
            }
            if (i11 == 8) {
                this.f39744V = (TextView) view.findViewById(AbstractC6918a0.btnShowOnlineStatus);
                return;
            }
            if (i11 == 1) {
                this.f39731I = (TextView) view.findViewById(AbstractC6918a0.title_row);
                this.f39732J = (TextView) view.findViewById(AbstractC6918a0.title_contact_row);
                this.f39733K = view.findViewById(AbstractC6918a0.separate_line);
            } else if (i11 == 4) {
                this.f39740R = (RobotoTextView) view.findViewById(AbstractC6918a0.btnSeeMore);
                this.f39741S = (RobotoTextView) view.findViewById(AbstractC6918a0.btnSeeLess);
                this.f39742T = (RobotoTextView) view.findViewById(AbstractC6918a0.label_eol);
            } else if (i11 == 5) {
                this.f39743U = view.findViewById(AbstractC6918a0.btnRefresh);
                this.f39733K = view.findViewById(AbstractC6918a0.separate_line);
            } else if (i11 == 12) {
                this.f39745W = (RobotoTextView) view.findViewById(AbstractC6918a0.progress_text);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q0 */
        public /* synthetic */ void m36944q0(View view) {
            c cVar = C7232u9.this.f39714C;
            if (cVar != null) {
                cVar.mo36936y8();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r0 */
        public /* synthetic */ void m36945r0(View view) {
            c cVar = C7232u9.this.f39714C;
            if (cVar != null) {
                cVar.mo36932F7("-4");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s0 */
        public /* synthetic */ void m36946s0(View view) {
            c cVar = C7232u9.this.f39714C;
            if (cVar != null) {
                cVar.mo36932F7("-4");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t0 */
        public /* synthetic */ void m36947t0(View view) {
            c cVar = C7232u9.this.f39714C;
            if (cVar != null) {
                cVar.mo36932F7("-2");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: u0 */
        public /* synthetic */ void m36948u0(View view) {
            c cVar = C7232u9.this.f39714C;
            if (cVar != null) {
                cVar.mo36932F7("-1");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: v0 */
        public /* synthetic */ void m36949v0(View view) {
            c cVar = C7232u9.this.f39714C;
            if (cVar != null) {
                cVar.mo36932F7("-3");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w0 */
        public static /* synthetic */ void m36950w0(HeaderPageContactLayout headerPageContactLayout) {
            headerPageContactLayout.setTextNewFriend(AbstractC23136l9.m118743r0(AbstractC8020f0.str_lable_new_friend));
        }

        @Override // com.zing.zalo.adapters.C7232u9.f
        /* renamed from: i0 */
        void mo36931i0(ContactProfile contactProfile, int i11, int i12) {
            super.mo36931i0(contactProfile, i11, i12);
            try {
                ContactProfile contactProfile2 = (ContactProfile) C7232u9.this.f39719s.get(i11);
                int i13 = 8;
                boolean z11 = false;
                if (C7232u9.this.m36919X(i11)) {
                    this.f7784p.setBackgroundResource(AbstractC16803z.stencils_contact_bg);
                    boolean z12 = true;
                    if (contactProfile2.f42434r.equals("-2")) {
                        this.f7784p.setBackgroundResource(0);
                        CompoundButton compoundButton = this.f39735M;
                        if (compoundButton != null) {
                            if (AbstractC23309i.m120933Fb() != 1) {
                                z12 = false;
                            }
                            compoundButton.setChecked(z12);
                            this.f39735M.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.w9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    C7232u9.d.this.m36944q0(view);
                                }
                            });
                        }
                        View view = this.f39733K;
                        if (view != null) {
                            if (!contactProfile2.f42407e1) {
                                i13 = 0;
                            }
                            view.setVisibility(i13);
                            return;
                        }
                        return;
                    }
                    if (contactProfile2.f42434r.equals("-3")) {
                        this.f7784p.setBackgroundResource(0);
                        this.f39737O.setVisibility(8);
                        this.f39738P.setVisibility(0);
                        this.f39739Q.setVisibility(0);
                        this.f39736N.setTextColor(C7232u9.this.f39720t);
                        this.f39736N.setText(contactProfile2.f42437s);
                        this.f39736N.setVisibility(0);
                        return;
                    }
                    if (contactProfile2.f42434r.equals("-4")) {
                        this.f7784p.setBackgroundResource(0);
                        this.f39736N.setVisibility(8);
                        this.f39738P.setVisibility(8);
                        this.f39739Q.setVisibility(8);
                        TextView textView = this.f39737O;
                        if (textView != null) {
                            textView.setVisibility(0);
                            this.f39737O.setText(contactProfile2.f42437s);
                            return;
                        }
                        return;
                    }
                    if (!contactProfile2.f42434r.equals("-10") && !contactProfile2.f42434r.equals("-11")) {
                        if (contactProfile2.f42434r.equals("-7")) {
                            this.f7784p.setBackgroundResource(0);
                            this.f39744V.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.x9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    C7232u9.d.this.m36945r0(view2);
                                }
                            });
                            View view2 = this.f39734L;
                            if (view2 != null) {
                                if (!contactProfile2.f42407e1) {
                                    i13 = 0;
                                }
                                view2.setVisibility(i13);
                                return;
                            }
                            return;
                        }
                        if (contactProfile2.f42434r.equals("-9")) {
                            this.f7784p.setBackgroundResource(0);
                            this.f39744V.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.y9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    C7232u9.d.this.m36946s0(view3);
                                }
                            });
                            return;
                        }
                        if (contactProfile2.f42434r.equals("-5")) {
                            this.f7784p.setBackgroundResource(0);
                            int i14 = contactProfile2.f42335E1;
                            if (i14 == 0) {
                                this.f39741S.setVisibility(8);
                                this.f39740R.setVisibility(0);
                                this.f39742T.setVisibility(8);
                            } else if (i14 == 1) {
                                this.f39741S.setVisibility(0);
                                this.f39740R.setVisibility(0);
                                this.f39742T.setVisibility(8);
                            } else if (i14 == 2) {
                                this.f39741S.setVisibility(0);
                                this.f39740R.setVisibility(8);
                                this.f39742T.setVisibility(0);
                            }
                            this.f39740R.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.z9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    C7232u9.d.this.m36947t0(view3);
                                }
                            });
                            this.f39741S.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.aa
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    C7232u9.d.this.m36948u0(view3);
                                }
                            });
                            return;
                        }
                        if (contactProfile2.f42434r.equals("-6")) {
                            this.f7784p.setBackgroundResource(0);
                            this.f39743U.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.ba
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    C7232u9.d.this.m36949v0(view3);
                                }
                            });
                            View view3 = this.f39733K;
                            if (view3 != null) {
                                if (!contactProfile2.f42407e1) {
                                    i13 = 0;
                                }
                                view3.setVisibility(i13);
                                return;
                            }
                            return;
                        }
                        if (contactProfile2.f42434r.equals("-8")) {
                            View view4 = this.f7784p;
                            if (view4 instanceof HeaderPageContactLayout) {
                                final HeaderPageContactLayout headerPageContactLayout = (HeaderPageContactLayout) view4;
                                headerPageContactLayout.m75739b(C21927m.m114302u().f107791K);
                                headerPageContactLayout.setCountPageAll(C21927m.m114302u().f107790J);
                                headerPageContactLayout.setEnablePageOnline(C21927m.m114302u().f107795O);
                                headerPageContactLayout.setEnableCountOnline(C21927m.m114302u().f107796P);
                                headerPageContactLayout.setCountPageOnline(C21927m.m114302u().f107794N);
                                if (C21927m.m114302u().f107793M == 0) {
                                    headerPageContactLayout.setEnablePageNewFriend(false);
                                } else {
                                    headerPageContactLayout.post(new Runnable() { // from class: com.zing.zalo.adapters.ca
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C7232u9.d.m36950w0(HeaderPageContactLayout.this);
                                        }
                                    });
                                    headerPageContactLayout.setEnablePageNewFriend(true);
                                    headerPageContactLayout.setCountPageNewFriend(C21927m.m114302u().f107793M);
                                    if (AbstractC23304d.f113337V && C21927m.m114302u().f107791K != 2) {
                                        z11 = true;
                                    }
                                    headerPageContactLayout.setEnableReddot(z11);
                                }
                            }
                            C7232u9.this.f39721u = this.f7784p.getBottom();
                            return;
                        }
                        if (contactProfile2.f42434r.equals("-13")) {
                            this.f39745W.setVisibility(0);
                            this.f39745W.setText(AbstractC8020f0.str_tv_loading_layout);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (contactProfile2.f42335E1 > 0) {
                    this.f39732J.setText(contactProfile2.f42437s);
                    this.f39732J.setVisibility(0);
                    this.f39731I.setVisibility(8);
                } else {
                    this.f39731I.setText(contactProfile2.f42437s);
                    this.f39731I.setVisibility(0);
                    this.f39732J.setVisibility(8);
                }
                View view5 = this.f39733K;
                if (!contactProfile2.f42407e1) {
                    i13 = 0;
                }
                view5.setVisibility(i13);
                AbstractC23136l9.m118696b1(this.f7784p, null);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.u9$e */
    /* loaded from: classes3.dex */
    public class e extends f {

        /* renamed from: I */
        ZaloListItemModuleView f39747I;

        e(ZaloListItemModuleView zaloListItemModuleView, int i11) {
            super(zaloListItemModuleView, i11);
            this.f39747I = zaloListItemModuleView;
        }

        @Override // com.zing.zalo.adapters.C7232u9.f
        /* renamed from: i0 */
        void mo36931i0(ContactProfile contactProfile, int i11, int i12) {
            boolean z11;
            super.mo36931i0(contactProfile, i11, i12);
            ZaloListItemModuleView zaloListItemModuleView = this.f39747I;
            C7232u9 c7232u9 = C7232u9.this;
            if ((c7232u9.f39718r || c7232u9.m36909V()) && !C7232u9.this.f39717F) {
                z11 = true;
            } else {
                z11 = false;
            }
            zaloListItemModuleView.m69734a0(contactProfile, z11, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.u9$f */
    /* loaded from: classes3.dex */
    public static class f extends RecyclerView.AbstractC1876c0 {
        f(View view, int i11) {
            super(view);
        }

        /* renamed from: i0 */
        void mo36931i0(ContactProfile contactProfile, int i11, int i12) {
        }
    }

    public C7232u9(ZaloView zaloView, C23528a c23528a) {
        this.f39712A = c23528a;
        InterfaceC27218a m92676n2 = zaloView.m92676n2();
        this.f39716E = m92676n2;
        this.f39720t = AbstractC23136l9.m118641B(m92676n2.getContext(), AbstractC16801x.cMtxt2);
        this.f39724x = new ArrayList();
        this.f39725y = new ArrayList();
        this.f39722v = 0;
        this.f39723w = 0;
        this.f39718r = false;
        m9999J(true);
        this.f39717F = AbstractC21289a.m110245b() >= C19172a.m100599j("core@android@range_tier_load_avatar_scroll");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public boolean m36909V() {
        a aVar = this.f39715D;
        if (aVar != null && aVar.mo36928a()) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public void m36910N(View view) {
        if (view != null) {
            this.f39725y.add(new WeakReference(view));
            this.f39723w++;
            m10008p();
        }
    }

    /* renamed from: O */
    public void m36911O(View view) {
        if (view != null) {
            this.f39724x.add(new WeakReference(view));
            this.f39722v++;
            m10008p();
        }
    }

    /* renamed from: P */
    public void m36912P() {
        ArrayList arrayList = this.f39719s;
        if (arrayList != null) {
            arrayList.clear();
            this.f39719s = null;
        }
        List list = this.f39724x;
        if (list != null) {
            list.clear();
            this.f39724x = null;
            this.f39722v = 0;
        }
        List list2 = this.f39725y;
        if (list2 != null) {
            list2.clear();
            this.f39725y = null;
            this.f39723w = 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a5, code lost:            if (r15.equals("-3") == false) goto L6;     */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    int m36913Q(int i11) {
        char c11 = 1;
        if (!m36919X(i11)) {
            return 1;
        }
        String str = m36917U(i11).f42434r;
        str.hashCode();
        switch (str.hashCode()) {
            case 1445:
                if (str.equals("-2")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case 1446:
                break;
            case 1447:
                if (str.equals("-4")) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case 1448:
                if (str.equals("-5")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1449:
                if (str.equals("-6")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case 1450:
                if (str.equals("-7")) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case 1451:
                if (str.equals("-8")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case 1452:
                if (str.equals("-9")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case 44812:
                if (str.equals("-10")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case 44813:
                if (str.equals("-11")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case 44814:
                if (str.equals("-12")) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case 44815:
                if (str.equals("-13")) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return 2;
            case 1:
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case '\b':
                return 9;
            case '\t':
                return 10;
            case '\n':
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    /* renamed from: R */
    public int m36914R() {
        ArrayList arrayList = this.f39719s;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: S */
    public ContactProfile m36915S(int i11) {
        try {
            int m36914R = this.f39722v + m36914R();
            int i12 = this.f39722v;
            if (i11 >= i12 && i11 < m36914R) {
                return (ContactProfile) this.f39719s.get(i11 - i12);
            }
            return null;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: T */
    public int m36916T() {
        return this.f39722v;
    }

    /* renamed from: U */
    public ContactProfile m36917U(int i11) {
        return (ContactProfile) this.f39719s.get(i11);
    }

    /* renamed from: W */
    public boolean m36918W() {
        if (m36914R() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public boolean m36919X(int i11) {
        try {
            ArrayList arrayList = this.f39719s;
            if (arrayList != null && arrayList.size() > i11) {
                return ((ContactProfile) this.f39719s.get(i11)).m40366G0();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void mo9990A(f fVar, int i11) {
        try {
            int m36914R = this.f39722v + m36914R();
            int i12 = this.f39722v;
            if (i11 >= i12 && i11 < m36914R) {
                int i13 = i11 - i12;
                fVar.mo36931i0((ContactProfile) this.f39719s.get(i13), i13, m36913Q(i13));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public f mo9992C(ViewGroup viewGroup, int i11) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        if (i11 >= 100) {
            int i12 = i11 - 100;
            if (i12 < 0 || i12 >= this.f39724x.size() || this.f39724x.get(i12) == null || (view2 = (View) ((WeakReference) this.f39724x.get(i12)).get()) == null) {
                return null;
            }
            view2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new f(view2, i11);
        }
        if (i11 <= -100) {
            int i13 = (-100) - i11;
            if (i13 < 0 || i13 >= this.f39725y.size() || this.f39725y.get(i13) == null || (view = (View) ((WeakReference) this.f39725y.get(i13)).get()) == null) {
                return null;
            }
            view.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new f(view, i11);
        }
        if (i11 == 0) {
            return new e(new ZaloListItemModuleView(context, this.f39712A, this), i11);
        }
        if (i11 == 2) {
            return new d(from.inflate(AbstractC7409c0.header_edit_online_status, viewGroup, false), i11);
        }
        if (i11 == 3) {
            return new d(from.inflate(AbstractC7409c0.item_update_online_status_row, viewGroup, false), i11);
        }
        if (i11 == 9) {
            return new d(from.inflate(AbstractC7409c0.item_empty_online_status_row, viewGroup, false), i11);
        }
        if (i11 == 10) {
            return new d(from.inflate(AbstractC7409c0.item_empty_contact_row, viewGroup, false), i11);
        }
        if (i11 == 11) {
            return new d(from.inflate(AbstractC7409c0.item_description_new_friend_row, viewGroup, false), i11);
        }
        if (i11 == 6) {
            return new d(from.inflate(AbstractC7409c0.off_setting_show_online_status, viewGroup, false), i11);
        }
        if (i11 == 8) {
            return new d(from.inflate(AbstractC7409c0.off_setting_show_online_status_new, viewGroup, false), i11);
        }
        if (i11 == 1) {
            if (ZaloListView.m86977gN()) {
                return new b(from.inflate(AbstractC7409c0.item_header_row_contact, viewGroup, false), i11);
            }
            return new d(from.inflate(AbstractC7409c0.item_list_header_row_material, viewGroup, false), i11);
        }
        if (i11 == 4) {
            return new d(from.inflate(AbstractC7409c0.see_more_item_row_contact_list, viewGroup, false), i11);
        }
        if (i11 == 5) {
            return new d(from.inflate(AbstractC7409c0.all_contact_list_title, viewGroup, false), i11);
        }
        if (i11 == 7) {
            return new d(new HeaderPageContactLayout(context), i11);
        }
        if (i11 != 12) {
            return null;
        }
        View inflate = from.inflate(AbstractC7409c0.layout_loading, viewGroup, false);
        int m118713h0 = ((AbstractC23136l9.m118713h0() - AbstractC23136l9.m118737p0()) - AbstractC17484n.Companion.m92930a()) - this.f39721u;
        if (m118713h0 > 0) {
            inflate.getLayoutParams().height = m118713h0;
            inflate.setLayoutParams(inflate.getLayoutParams());
        }
        return new d(inflate, i11);
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: a */
    public boolean mo36528a(int i11) {
        if (mo10005m(i11) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public void m36922a0(c cVar) {
        this.f39714C = cVar;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: b */
    public void mo36530b(View view, int i11) {
        mo9990A(this.f39726z, i11);
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.f39726z.f7784p.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        this.f39726z.f39728J.setVisibility(8);
        this.f39726z.f7784p.setLayoutParams(layoutParams);
    }

    /* renamed from: b0 */
    public void m36923b0(a aVar) {
        this.f39715D = aVar;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: c */
    public int mo36532c(int i11) {
        while (!mo36528a(i11)) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    /* renamed from: c0 */
    public void m36924c0(List list) {
        this.f39719s = new ArrayList(list);
        if (C22013a0.m114924c().m114932h(3)) {
            m36927f0();
        }
        m10008p();
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: d */
    public View mo36534d(int i11, ViewGroup viewGroup) {
        if (this.f39726z == null) {
            b bVar = new b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_header_row_contact, viewGroup, false), 1);
            this.f39726z = bVar;
            bVar.f39729K.setVisibility(0);
        }
        return this.f39726z.f7784p;
    }

    /* renamed from: d0 */
    public void m36925d0(boolean z11) {
        this.f39718r = z11;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: e */
    public boolean mo36536e(int i11) {
        return false;
    }

    /* renamed from: e0 */
    public void m36926e0(AbstractC22055v0.l lVar) {
        this.f39713B = lVar;
    }

    /* renamed from: f0 */
    void m36927f0() {
        ArrayList arrayList;
        try {
            if (C22013a0.m114924c().m114932h(3) && (arrayList = this.f39719s) != null && !arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = this.f39719s.iterator();
                int i11 = -1;
                int i12 = -1;
                while (it.hasNext()) {
                    i11++;
                    ContactProfile contactProfile = (ContactProfile) it.next();
                    if (contactProfile != null) {
                        if (contactProfile.f42430p1) {
                            if (i12 < 0) {
                                i12 = i11;
                            }
                            if (AbstractC22055v0.m115113C(AbstractC22055v0.m115161u(contactProfile.f42434r))) {
                                arrayList2.add(contactProfile);
                                it.remove();
                            }
                        } else if (i12 >= 0) {
                            break;
                        }
                    }
                }
                if (i12 >= 0) {
                    this.f39719s.addAll(i12, arrayList2);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39722v + m36914R() + this.f39723w;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        ContactProfile contactProfile;
        String str;
        try {
            int i12 = this.f39722v;
            if (i11 >= i12 && i11 < i12 + m36914R() && (contactProfile = (ContactProfile) this.f39719s.get(i11 - this.f39722v)) != null) {
                if (TextUtils.isEmpty(contactProfile.f42434r)) {
                    if (!contactProfile.m40366G0() && (str = contactProfile.f42437s) != null && str.length() == 1) {
                        return contactProfile.f42437s.charAt(0) - 256;
                    }
                    return 0L;
                }
                return Long.parseLong(contactProfile.f42434r);
            }
            return 0L;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return 0L;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 < this.f39722v) {
            return i11 + 100;
        }
        int m36914R = m36914R();
        int i12 = this.f39722v;
        if (i11 >= i12 + m36914R) {
            return (-100) - ((i11 - i12) - m36914R);
        }
        return m36913Q(i11 - i12);
    }
}
