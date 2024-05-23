package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.UnMuteCallBottomSheet;
import com.zing.zalo.utils.ToastUtils;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.C23055e5;
import me0.C23212s8;
import on0.AbstractC24341v;
import p262jb.AbstractC21196a;
import p445qe.C25244a;
import p649xl.C29752ce;
import p716zh.C31853b5;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25370t;

/* loaded from: classes6.dex */
public final class UnMuteCallBottomSheet extends BottomSheetZaloViewWithAnim {
    public static final C15216a Companion = new C15216a(null);

    /* renamed from: W0 */
    private C29752ce f78517W0;

    /* renamed from: X0 */
    private String f78518X0 = "";

    /* renamed from: com.zing.zalo.ui.zviews.UnMuteCallBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C15216a {
        private C15216a() {
        }

        public /* synthetic */ C15216a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.UnMuteCallBottomSheet$b */
    /* loaded from: classes6.dex */
    public static final class C15217b extends AbstractC19075u implements InterfaceC18505l {
        C15217b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m85495c(UnMuteCallBottomSheet unMuteCallBottomSheet) {
            AbstractC19074t.m100208f(unMuteCallBottomSheet, "this$0");
            unMuteCallBottomSheet.mo49315c4();
            unMuteCallBottomSheet.close();
        }

        /* renamed from: b */
        public final void m85496b(boolean z11) {
            if (z11) {
                final UnMuteCallBottomSheet unMuteCallBottomSheet = UnMuteCallBottomSheet.this;
                unMuteCallBottomSheet.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.hv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        UnMuteCallBottomSheet.C15217b.m85495c(UnMuteCallBottomSheet.this);
                    }
                });
            } else {
                ToastUtils.m89266n(AbstractC8020f0.str_call_ringtone_general_error, new Object[0]);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m85496b(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    public UnMuteCallBottomSheet() {
        m78539iM(true);
    }

    /* renamed from: nM */
    private final SpannableString m85489nM(Context context, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m92652XI(AbstractC8020f0.str_call_notif_unmute_all_sheet_desc));
        int length = sb2.length();
        sb2.append(" ");
        sb2.append(str);
        int length2 = sb2.length();
        SpannableString spannableString = new SpannableString(sb2.toString());
        AbstractC23217t2.m119664p(spannableString, length, length2, C23212s8.m119607o(context, AbstractC21196a.TextColor2), 7, 33);
        return spannableString;
    }

    /* renamed from: pM */
    private final void m85490pM() {
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        bottomSheetLayout.setEnableScrollY(false);
        bottomSheetLayout.setEnableToggleWHenClickNoConsume(false);
        bottomSheetLayout.setCanOverTranslateMaxY(false);
        m78539iM(true);
        bottomSheetLayout.setMaxTranslationY(mo37128eM());
        bottomSheetLayout.setMinTranslationY(mo37128eM());
        bottomSheetLayout.setMinimized(true);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            String string = m92642L3.getString("USER_NAME_TO_UN_MUTE", "");
            String string2 = m92642L3.getString("USER_ID_TO_UN_MUTE", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f78518X0 = string2;
            C29752ce c29752ce = this.f78517W0;
            C29752ce c29752ce2 = null;
            if (c29752ce == null) {
                AbstractC19074t.m100223u("binding");
                c29752ce = null;
            }
            RobotoTextView robotoTextView = c29752ce.f137448r;
            C29752ce c29752ce3 = this.f78517W0;
            if (c29752ce3 == null) {
                AbstractC19074t.m100223u("binding");
                c29752ce3 = null;
            }
            Context context = c29752ce3.f137448r.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            AbstractC19074t.m100205c(string);
            robotoTextView.setText(m85489nM(context, string));
            C29752ce c29752ce4 = this.f78517W0;
            if (c29752ce4 == null) {
                AbstractC19074t.m100223u("binding");
                c29752ce4 = null;
            }
            c29752ce4.f137447q.setIdTracking("call_notif_un_mute_all_sheet");
            C29752ce c29752ce5 = this.f78517W0;
            if (c29752ce5 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29752ce2 = c29752ce5;
            }
            c29752ce2.f137447q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.gv0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnMuteCallBottomSheet.m85491qM(UnMuteCallBottomSheet.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public static final void m85491qM(UnMuteCallBottomSheet unMuteCallBottomSheet, View view) {
        AbstractC19074t.m100208f(unMuteCallBottomSheet, "this$0");
        unMuteCallBottomSheet.m85492rM();
    }

    /* renamed from: rM */
    private final void m85492rM() {
        boolean m127128x;
        int m131511r;
        List m131187O0;
        C25244a c25244a = C25244a.f121072a;
        c25244a.m130646A("rmenu");
        if (C23055e5.m118272g(true)) {
            m127128x = AbstractC24341v.m127128x(this.f78518X0);
            if (m127128x) {
                return;
            }
            C31853b5 m130654p = c25244a.m130654p();
            m131511r = AbstractC25370t.m131511r(m130654p, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            Iterator<E> it = m130654p.iterator();
            while (it.hasNext()) {
                arrayList.add(((ContactProfile) it.next()).f42434r);
            }
            m131187O0 = AbstractC25332a0.m131187O0(arrayList);
            m131187O0.remove(this.f78518X0);
            mo46829Y();
            C25244a.f121072a.m130653P(true, m131187O0, new C15217b());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29752ce c29752ce = this.f78517W0;
        if (c29752ce == null) {
            AbstractC19074t.m100223u("binding");
            c29752ce = null;
        }
        LinearLayout root = c29752ce.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: X0 */
    public boolean mo37120X0(float f11, boolean z11, float f12) {
        if (f11 > AbstractC23136l9.m118742r(100.0f)) {
            close();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return this.f72454M0.getHeight() - m85493oM();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        C29752ce m147824c = C29752ce.m147824c(LayoutInflater.from(getContext()), linearLayout, true);
        AbstractC19074t.m100207e(m147824c, "inflate(...)");
        this.f78517W0 = m147824c;
        m85490pM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "UnMuteCallBottomSheetView";
    }

    /* renamed from: oM */
    public final int m85493oM() {
        C29752ce c29752ce = this.f78517W0;
        if (c29752ce == null) {
            AbstractC19074t.m100223u("binding");
            c29752ce = null;
        }
        return c29752ce.getRoot().getMeasuredHeight() + AbstractC23136l9.m118737p0();
    }
}
