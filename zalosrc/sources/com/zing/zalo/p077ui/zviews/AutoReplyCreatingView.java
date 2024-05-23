package com.zing.zalo.p077ui.zviews;

import ac.C0697c0;
import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.RadioButton;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zdesign.component.inputfield.BaseInputField;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19067n0;
import fn0.C19071q;
import fn0.InterfaceC19066n;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import me0.AbstractC23136l9;
import p542ub.InterfaceC27218a;
import p649xl.C29845i;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import qm0.AbstractC25368s;
import ss.C26374f;
import ss.C26375g;

/* loaded from: classes6.dex */
public final class AutoReplyCreatingView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {
    public static final C14044a Companion = new C14044a(null);

    /* renamed from: P0 */
    private final InterfaceC24854k f72230P0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C26374f.class), new C14066w(new C14065v(this)), C14045b.f72232q);

    /* renamed from: Q0 */
    private C29845i f72231Q0;

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$a */
    /* loaded from: classes6.dex */
    public static final class C14044a {
        private C14044a() {
        }

        public /* synthetic */ C14044a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$b */
    /* loaded from: classes6.dex */
    static final class C14045b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C14045b f72232q = new C14045b();

        C14045b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C26375g();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$c */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14046c extends C19071q implements InterfaceC18505l {
        C14046c(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "openFriendIncludeSelectList", "openFriendIncludeSelectList(Ljava/util/ArrayList;)V", 0);
        }

        /* renamed from: h */
        public final void m78196h(ArrayList arrayList) {
            ((AutoReplyCreatingView) this.f94922q).m78159IM(arrayList);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78196h((ArrayList) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$d */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14047d extends C19071q implements InterfaceC18505l {
        C14047d(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "openFriendExcludeSelectList", "openFriendExcludeSelectList(Ljava/util/ArrayList;)V", 0);
        }

        /* renamed from: h */
        public final void m78197h(ArrayList arrayList) {
            ((AutoReplyCreatingView) this.f94922q).m78158HM(arrayList);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78197h((ArrayList) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$e */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14048e extends C19071q implements InterfaceC18505l {
        C14048e(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "showFriendsIncludedDesc", "showFriendsIncludedDesc(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m78198h(String str) {
            ((AutoReplyCreatingView) this.f94922q).m78168RM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78198h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$f */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14049f extends C19071q implements InterfaceC18505l {
        C14049f(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "showFriendsExcludedDesc", "showFriendsExcludedDesc(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m78199h(String str) {
            ((AutoReplyCreatingView) this.f94922q).m78167QM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78199h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$g */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14050g extends C19071q implements InterfaceC18505l {
        C14050g(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "setRangeTimeOptions", "setRangeTimeOptions(Lcom/zing/zalo/group/autoreply/AutoReplyCreatingViewModel$TimeRangeARData;)V", 0);
        }

        /* renamed from: h */
        public final void m78200h(C26374f.f fVar) {
            AbstractC19074t.m100208f(fVar, "p0");
            ((AutoReplyCreatingView) this.f94922q).m78162LM(fVar);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78200h((C26374f.f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$h */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14051h extends C19071q implements InterfaceC18505l {
        C14051h(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "openTimeRangePicker", "openTimeRangePicker(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: h */
        public final void m78201h(C24860q c24860q) {
            AbstractC19074t.m100208f(c24860q, "p0");
            ((AutoReplyCreatingView) this.f94922q).m78160JM(c24860q);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78201h((C24860q) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$i */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14052i extends C19071q implements InterfaceC18505l {
        C14052i(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "setLimitContentChar", "setLimitContentChar(I)V", 0);
        }

        /* renamed from: h */
        public final void m78202h(int i11) {
            ((AutoReplyCreatingView) this.f94922q).m78161KM(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78202h(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$j */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14053j extends C19071q implements InterfaceC18505l {
        C14053j(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "changeDoneItemStatus", "changeDoneItemStatus(Z)V", 0);
        }

        /* renamed from: h */
        public final void m78203h(boolean z11) {
            ((AutoReplyCreatingView) this.f94922q).m78194zM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78203h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$k */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14054k extends C19071q implements InterfaceC18505l {
        C14054k(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "updateContentEditText", "updateContentEditText(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m78204h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((AutoReplyCreatingView) this.f94922q).m78193UM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78204h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$l */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14055l extends C19071q implements InterfaceC18505l {
        C14055l(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "callSetActionBarTitle", "callSetActionBarTitle(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m78205h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((AutoReplyCreatingView) this.f94922q).m78190yM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78205h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$m */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14056m extends C19071q implements InterfaceC18505l {
        C14056m(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "showBtnDelete", "showBtnDelete(Z)V", 0);
        }

        /* renamed from: h */
        public final void m78206h(boolean z11) {
            ((AutoReplyCreatingView) this.f94922q).m78165OM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78206h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$n */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14057n extends C19071q implements InterfaceC18505l {
        C14057n(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "showDialogConfirmDeleteQuickMessage", "showDialogConfirmDeleteQuickMessage(Z)V", 0);
        }

        /* renamed from: h */
        public final void m78207h(boolean z11) {
            ((AutoReplyCreatingView) this.f94922q).m78166PM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78207h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$o */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14058o extends C19071q implements InterfaceC18505l {
        C14058o(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "showHideLoadingView", "showHideLoadingView(Z)V", 0);
        }

        /* renamed from: h */
        public final void m78208h(boolean z11) {
            ((AutoReplyCreatingView) this.f94922q).m78171c3(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78208h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$p */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14059p extends C19071q implements InterfaceC18505l {
        C14059p(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "closeView", "closeView(Z)V", 0);
        }

        /* renamed from: h */
        public final void m78209h(boolean z11) {
            ((AutoReplyCreatingView) this.f94922q).m78191AM(z11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78209h(((Boolean) obj).booleanValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$q */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14060q extends C19071q implements InterfaceC18505l {
        C14060q(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "showToast", "showToast(Ljava/lang/String;)V", 0);
        }

        /* renamed from: h */
        public final void m78210h(String str) {
            AbstractC19074t.m100208f(str, "p0");
            ((AutoReplyCreatingView) this.f94922q).m78169SM(str);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78210h((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$r */
    /* loaded from: classes6.dex */
    /* synthetic */ class C14061r extends C19071q implements InterfaceC18505l {
        C14061r(Object obj) {
            super(1, obj, AutoReplyCreatingView.class, "setScope", "setScope(B)V", 0);
        }

        /* renamed from: h */
        public final void m78211h(byte b11) {
            ((AutoReplyCreatingView) this.f94922q).m78163MM(b11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m78211h(((Number) obj).byteValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$s */
    /* loaded from: classes6.dex */
    static final class C14062s implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f72233p;

        C14062s(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f72233p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f72233p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f72233p.mo205i9(obj);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$t */
    /* loaded from: classes6.dex */
    public static final class C14063t implements TextWatcher {
        public C14063t() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C26374f m78152BM = AutoReplyCreatingView.this.m78152BM();
            C29845i c29845i = AutoReplyCreatingView.this.f72231Q0;
            if (c29845i == null) {
                AbstractC19074t.m100223u("binding");
                c29845i = null;
            }
            m78152BM.m135854t0(String.valueOf(c29845i.f138090r.getEditText().getText()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$u */
    /* loaded from: classes6.dex */
    public static final class C14064u implements BaseInputField.InterfaceC16995c {
        C14064u() {
        }

        @Override // com.zing.zalo.zdesign.component.inputfield.BaseInputField.InterfaceC16995c
        /* renamed from: a */
        public void mo50287a() {
            AutoReplyCreatingView autoReplyCreatingView = AutoReplyCreatingView.this;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_reach_message_limit_char);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            String format = String.format(m118743r0, Arrays.copyOf(new Object[]{Integer.valueOf(AutoReplyCreatingView.this.m78152BM().m135845c0())}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            autoReplyCreatingView.m78169SM(format);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$v */
    /* loaded from: classes6.dex */
    public static final class C14065v extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f72236q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14065v(ZaloView zaloView) {
            super(0);
            this.f72236q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f72236q;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.AutoReplyCreatingView$w */
    /* loaded from: classes6.dex */
    public static final class C14066w extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f72237q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14066w(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f72237q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f72237q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public final C26374f m78152BM() {
        return (C26374f) this.f72230P0.getValue();
    }

    /* renamed from: CM */
    private final boolean m78153CM(C26374f.f fVar) {
        if (fVar.m135867c() >= fVar.m135866b() && fVar.m135866b() - fVar.m135867c() >= 86400000) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(fVar.m135867c());
        if (calendar.get(11) == 12 && calendar.get(12) == 0) {
            calendar.setTimeInMillis(fVar.m135866b());
            if (calendar.get(11) == 13 && calendar.get(12) == 30) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: DM */
    private final boolean m78154DM(C26374f.f fVar) {
        if (fVar.m135867c() >= fVar.m135866b() && fVar.m135866b() - fVar.m135867c() >= 86400000) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(fVar.m135867c());
        if (calendar.get(11) == 18 && calendar.get(12) == 0) {
            calendar.setTimeInMillis(fVar.m135866b());
            if (calendar.get(11) == 7 && calendar.get(12) == 30) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: EM */
    private final boolean m78155EM(C26374f.f fVar) {
        if (fVar.m135866b() - fVar.m135867c() >= 86400000 && fVar.m135865a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public static final void m78156FM(AutoReplyCreatingView autoReplyCreatingView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(autoReplyCreatingView, "this$0");
        interfaceC17463d.dismiss();
        autoReplyCreatingView.m78152BM().m135853s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m78157GM(AutoReplyCreatingView autoReplyCreatingView, View view) {
        AbstractC19074t.m100208f(autoReplyCreatingView, "this$0");
        autoReplyCreatingView.m78152BM().m135856v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public final void m78158HM(ArrayList arrayList) {
        C19059j0 c19059j0 = new C19059j0();
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.add(new InviteContactProfile(String.valueOf(((Number) arrayList.get(i11)).intValue()), "", ""));
            }
            c19059j0.f94941p = arrayList2;
        }
        Bundle m83056qM = ProfilePickerView.m83056qM((ArrayList) c19059j0.f94941p, 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_friend_select_title));
        m83056qM.putBoolean("extra_show_text_instead_icon", true);
        m83056qM.putBoolean("extra_type_exclude_friends", true);
        m83056qM.putBoolean("extra_use_data_from_picker", true);
        m83056qM.putBoolean("extra_enable_light_status_when_exit", true);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ProfilePickerView.class, m83056qM, 2, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public final void m78159IM(ArrayList arrayList) {
        C19059j0 c19059j0 = new C19059j0();
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.add(new InviteContactProfile(String.valueOf(((Number) arrayList.get(i11)).intValue()), "", ""));
            }
            c19059j0.f94941p = arrayList2;
        }
        Bundle m83056qM = ProfilePickerView.m83056qM((ArrayList) c19059j0.f94941p, 100, AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_friend_select_title));
        m83056qM.putBoolean("extra_show_text_instead_icon", true);
        m83056qM.putBoolean("extra_type_exclude_friends", false);
        m83056qM.putBoolean("extra_use_data_from_picker", true);
        m83056qM.putBoolean("extra_enable_light_status_when_exit", true);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(ProfilePickerView.class, m83056qM, 1, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: JM */
    public final void m78160JM(C24860q c24860q) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 19);
        bundle.putLong("EXTRA_START_TIME", ((Number) c24860q.m129215c()).longValue());
        bundle.putLong("EXTRA_END_TIME", ((Number) c24860q.m129216d()).longValue());
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 3, 1, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public final void m78161KM(int i11) {
        C29845i c29845i = this.f72231Q0;
        if (c29845i == null) {
            AbstractC19074t.m100223u("binding");
            c29845i = null;
        }
        c29845i.f138090r.setMaxLength(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public final void m78162LM(C26374f.f fVar) {
        C29845i c29845i = null;
        if (m78155EM(fVar)) {
            C29845i c29845i2 = this.f72231Q0;
            if (c29845i2 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i2 = null;
            }
            c29845i2.f138083H.m90615f(true, true);
            C29845i c29845i3 = this.f72231Q0;
            if (c29845i3 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i3 = null;
            }
            c29845i3.f138079D.m90615f(false, true);
            C29845i c29845i4 = this.f72231Q0;
            if (c29845i4 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i4 = null;
            }
            c29845i4.f138081F.m90615f(false, true);
            C29845i c29845i5 = this.f72231Q0;
            if (c29845i5 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i5 = null;
            }
            c29845i5.f138085J.m90615f(false, true);
            C29845i c29845i6 = this.f72231Q0;
            if (c29845i6 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29845i = c29845i6;
            }
            c29845i.f138086K.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_time_option_custom_desc));
            return;
        }
        if (m78153CM(fVar)) {
            C29845i c29845i7 = this.f72231Q0;
            if (c29845i7 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i7 = null;
            }
            c29845i7.f138083H.m90615f(false, true);
            C29845i c29845i8 = this.f72231Q0;
            if (c29845i8 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i8 = null;
            }
            c29845i8.f138079D.m90615f(true, true);
            C29845i c29845i9 = this.f72231Q0;
            if (c29845i9 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i9 = null;
            }
            c29845i9.f138081F.m90615f(false, true);
            C29845i c29845i10 = this.f72231Q0;
            if (c29845i10 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i10 = null;
            }
            c29845i10.f138085J.m90615f(false, true);
            C29845i c29845i11 = this.f72231Q0;
            if (c29845i11 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29845i = c29845i11;
            }
            c29845i.f138086K.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_time_option_custom_desc));
            return;
        }
        if (m78154DM(fVar)) {
            C29845i c29845i12 = this.f72231Q0;
            if (c29845i12 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i12 = null;
            }
            c29845i12.f138083H.m90615f(false, true);
            C29845i c29845i13 = this.f72231Q0;
            if (c29845i13 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i13 = null;
            }
            c29845i13.f138079D.m90615f(false, true);
            C29845i c29845i14 = this.f72231Q0;
            if (c29845i14 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i14 = null;
            }
            c29845i14.f138081F.m90615f(true, true);
            C29845i c29845i15 = this.f72231Q0;
            if (c29845i15 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i15 = null;
            }
            c29845i15.f138085J.m90615f(false, true);
            C29845i c29845i16 = this.f72231Q0;
            if (c29845i16 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29845i = c29845i16;
            }
            c29845i.f138086K.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_time_option_custom_desc));
            return;
        }
        C29845i c29845i17 = this.f72231Q0;
        if (c29845i17 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i17 = null;
        }
        c29845i17.f138083H.m90615f(false, true);
        C29845i c29845i18 = this.f72231Q0;
        if (c29845i18 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i18 = null;
        }
        c29845i18.f138079D.m90615f(false, true);
        C29845i c29845i19 = this.f72231Q0;
        if (c29845i19 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i19 = null;
        }
        c29845i19.f138081F.m90615f(false, true);
        C29845i c29845i20 = this.f72231Q0;
        if (c29845i20 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i20 = null;
        }
        c29845i20.f138085J.m90615f(true, true);
        C29845i c29845i21 = this.f72231Q0;
        if (c29845i21 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29845i = c29845i21;
        }
        c29845i.f138086K.setText(m78152BM().m135850i0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public final void m78163MM(byte b11) {
        boolean z11;
        boolean z12;
        boolean z13;
        C29845i c29845i = this.f72231Q0;
        C29845i c29845i2 = null;
        if (c29845i == null) {
            AbstractC19074t.m100223u("binding");
            c29845i = null;
        }
        RadioButton radioButton = c29845i.f138094v;
        boolean z14 = false;
        if (b11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        radioButton.m90615f(z11, true);
        C29845i c29845i3 = this.f72231Q0;
        if (c29845i3 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i3 = null;
        }
        RadioButton radioButton2 = c29845i3.f138077B;
        if (b11 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        radioButton2.m90615f(z12, true);
        C29845i c29845i4 = this.f72231Q0;
        if (c29845i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i4 = null;
        }
        RadioButton radioButton3 = c29845i4.f138098z;
        if (b11 == 2) {
            z13 = true;
        } else {
            z13 = false;
        }
        radioButton3.m90615f(z13, true);
        C29845i c29845i5 = this.f72231Q0;
        if (c29845i5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29845i2 = c29845i5;
        }
        RadioButton radioButton4 = c29845i2.f138096x;
        if (b11 == 3) {
            z14 = true;
        }
        radioButton4.m90615f(z14, true);
    }

    /* renamed from: NM */
    private final void m78164NM() {
        C29845i c29845i = this.f72231Q0;
        C29845i c29845i2 = null;
        if (c29845i == null) {
            AbstractC19074t.m100223u("binding");
            c29845i = null;
        }
        c29845i.f138090r.getEditText().addTextChangedListener(new C14063t());
        C29845i c29845i3 = this.f72231Q0;
        if (c29845i3 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i3 = null;
        }
        c29845i3.f138090r.setPasteTextLengthExceedListener(new C14064u());
        C29845i c29845i4 = this.f72231Q0;
        if (c29845i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i4 = null;
        }
        c29845i4.f138093u.setOnClickListener(this);
        C29845i c29845i5 = this.f72231Q0;
        if (c29845i5 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i5 = null;
        }
        c29845i5.f138076A.setOnClickListener(this);
        C29845i c29845i6 = this.f72231Q0;
        if (c29845i6 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i6 = null;
        }
        c29845i6.f138097y.setOnClickListener(this);
        C29845i c29845i7 = this.f72231Q0;
        if (c29845i7 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i7 = null;
        }
        c29845i7.f138095w.setOnClickListener(this);
        C29845i c29845i8 = this.f72231Q0;
        if (c29845i8 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i8 = null;
        }
        c29845i8.f138082G.setOnClickListener(this);
        C29845i c29845i9 = this.f72231Q0;
        if (c29845i9 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i9 = null;
        }
        c29845i9.f138078C.setOnClickListener(this);
        C29845i c29845i10 = this.f72231Q0;
        if (c29845i10 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i10 = null;
        }
        c29845i10.f138080E.setOnClickListener(this);
        C29845i c29845i11 = this.f72231Q0;
        if (c29845i11 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i11 = null;
        }
        c29845i11.f138084I.setOnClickListener(this);
        C29845i c29845i12 = this.f72231Q0;
        if (c29845i12 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29845i2 = c29845i12;
        }
        c29845i2.f138089q.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OM */
    public final void m78165OM(boolean z11) {
        int i11;
        C29845i c29845i = this.f72231Q0;
        if (c29845i == null) {
            AbstractC19074t.m100223u("binding");
            c29845i = null;
        }
        RobotoTextView robotoTextView = c29845i.f138089q;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PM */
    public final void m78166PM(boolean z11) {
        if (z11) {
            showDialog(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QM */
    public final void m78167QM(String str) {
        C29845i c29845i = null;
        if (str != null && str.length() != 0) {
            C29845i c29845i2 = this.f72231Q0;
            if (c29845i2 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i2 = null;
            }
            c29845i2.f138091s.setText(str);
            C29845i c29845i3 = this.f72231Q0;
            if (c29845i3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29845i = c29845i3;
            }
            c29845i.f138091s.setVisibility(0);
            return;
        }
        C29845i c29845i4 = this.f72231Q0;
        if (c29845i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i4 = null;
        }
        c29845i4.f138091s.setText("");
        C29845i c29845i5 = this.f72231Q0;
        if (c29845i5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29845i = c29845i5;
        }
        c29845i.f138091s.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RM */
    public final void m78168RM(String str) {
        C29845i c29845i = null;
        if (str != null && str.length() != 0) {
            C29845i c29845i2 = this.f72231Q0;
            if (c29845i2 == null) {
                AbstractC19074t.m100223u("binding");
                c29845i2 = null;
            }
            c29845i2.f138092t.setText(str);
            C29845i c29845i3 = this.f72231Q0;
            if (c29845i3 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29845i = c29845i3;
            }
            c29845i.f138092t.setVisibility(0);
            return;
        }
        C29845i c29845i4 = this.f72231Q0;
        if (c29845i4 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i4 = null;
        }
        c29845i4.f138092t.setText("");
        C29845i c29845i5 = this.f72231Q0;
        if (c29845i5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29845i = c29845i5;
        }
        c29845i.f138092t.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SM */
    public final void m78169SM(final String str) {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.a1
            @Override // java.lang.Runnable
            public final void run() {
                AutoReplyCreatingView.m78170TM(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TM */
    public static final void m78170TM(String str) {
        AbstractC19074t.m100208f(str, "$msg");
        ToastUtils.showMess(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m78171c3(boolean z11) {
        if (z11) {
            if (!m78935DL()) {
                mo46829Y();
                return;
            }
            return;
        }
        mo49315c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public final void m78190yM(String str) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setMiddleTitle(str);
        }
    }

    /* renamed from: AM */
    public final void m78191AM(boolean z11) {
        if (z11) {
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(18);
        }
        m78152BM().m135840V().m9219j(this, new C14062s(new C14053j(this)));
        m78152BM().m135843X().m9219j(this, new C14062s(new C14054k(this)));
        m78152BM().m135833P().m9219j(this, new C14062s(new C14055l(this)));
        m78152BM().m135839U0().m9219j(this, new C14062s(new C14056m(this)));
        m78152BM().m135841V0().m9219j(this, new C14062s(new C14057n(this)));
        m78152BM().m135842W0().m9219j(this, new C14062s(new C14058o(this)));
        m78152BM().m135836R().m9219j(this, new C14062s(new C14059p(this)));
        m78152BM().m135844X0().m9219j(this, new C14062s(new C14060q(this)));
        m78152BM().m135835Q0().m9219j(this, new C14062s(new C14061r(this)));
        m78152BM().m135825F0().m9219j(this, new C14062s(new C14046c(this)));
        m78152BM().m135824E0().m9219j(this, new C14062s(new C14047d(this)));
        m78152BM().m135831N0().m9219j(this, new C14062s(new C14048e(this)));
        m78152BM().m135830M0().m9219j(this, new C14062s(new C14049f(this)));
        m78152BM().m135837S0().m9219j(this, new C14062s(new C14050g(this)));
        m78152BM().m135826G0().m9219j(this, new C14062s(new C14051h(this)));
        m78152BM().m135834P0().m9219j(this, new C14062s(new C14052i(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        return mo49769EJ(i11, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: EJ */
    public KeyEventCallbackC17462c mo49769EJ(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "objects");
        if (i11 == 0) {
            C8009j.a aVar = new C8009j.a(getContext());
            aVar.m43159h(7).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ar_delete_comfirm)).m43173v(3).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.delete), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.z0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    AutoReplyCreatingView.m78156FM(AutoReplyCreatingView.this, interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29845i m148051c = C29845i.m148051c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148051c, "inflate(...)");
        this.f72231Q0 = m148051c;
        m78164NM();
        C29845i c29845i = this.f72231Q0;
        if (c29845i == null) {
            AbstractC19074t.m100223u("binding");
            c29845i = null;
        }
        LinearLayout root = c29845i.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.b1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutoReplyCreatingView.m78157GM(AutoReplyCreatingView.this, view);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        m78152BM().m135860z0(bundle);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview
    /* renamed from: TL */
    protected List mo78192TL() {
        List m131506n;
        m131506n = AbstractC25368s.m131506n(165, 166);
        return m131506n;
    }

    /* renamed from: UM */
    public final void m78193UM(String str) {
        AbstractC19074t.m100208f(str, "text");
        C29845i c29845i = this.f72231Q0;
        C29845i c29845i2 = null;
        if (c29845i == null) {
            AbstractC19074t.m100223u("binding");
            c29845i = null;
        }
        c29845i.f138090r.getEditText().setText(str);
        C29845i c29845i3 = this.f72231Q0;
        if (c29845i3 == null) {
            AbstractC19074t.m100223u("binding");
            c29845i3 = null;
        }
        Editable text = c29845i3.f138090r.getEditText().getText();
        if (text != null) {
            C29845i c29845i4 = this.f72231Q0;
            if (c29845i4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29845i2 = c29845i4;
            }
            c29845i2.f138090r.getEditText().setSelection(text.length());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C29845i c29845i = this.f72231Q0;
        if (c29845i == null) {
            AbstractC19074t.m100223u("binding");
            c29845i = null;
        }
        AbstractC2379w.m12430d(c29845i.f138090r);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: aK */
    public void mo54160aK(Bundle bundle) {
        super.mo54160aK(bundle);
        m78152BM().m135823D0(bundle);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "AutoReplyCreatingView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m78152BM().m135859y0(i12, intent);
                    return;
                }
                return;
            }
            m78152BM().m135857w0(i12, intent);
            return;
        }
        m78152BM().m135858x0(i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.btn_delete;
        if (num != null && num.intValue() == i11) {
            m78152BM().m135855u0();
            return;
        }
        int i12 = AbstractC6918a0.receiver_option_all_friends;
        if (num != null && num.intValue() == i12) {
            m78152BM().m135820A0((byte) 0);
            return;
        }
        int i13 = AbstractC6918a0.receiver_option_strangers;
        if (num != null && num.intValue() == i13) {
            m78152BM().m135820A0((byte) 1);
            return;
        }
        int i14 = AbstractC6918a0.receiver_option_friends_exclude;
        if (num != null && num.intValue() == i14) {
            m78152BM().m135820A0((byte) 3);
            return;
        }
        int i15 = AbstractC6918a0.receiver_option_friends_include;
        if (num != null && num.intValue() == i15) {
            m78152BM().m135820A0((byte) 2);
            return;
        }
        int i16 = AbstractC6918a0.time_option_all_day;
        if (num != null && num.intValue() == i16) {
            m78152BM().m135822C0(((Number) m78152BM().m135848g0().m129215c()).longValue(), ((Number) m78152BM().m135848g0().m129216d()).longValue());
            return;
        }
        int i17 = AbstractC6918a0.time_option_1200_1330;
        if (num != null && num.intValue() == i17) {
            m78152BM().m135822C0(((Number) m78152BM().m135846e0().m129215c()).longValue(), ((Number) m78152BM().m135846e0().m129216d()).longValue());
            return;
        }
        int i18 = AbstractC6918a0.time_option_1800_0730;
        if (num != null && num.intValue() == i18) {
            m78152BM().m135822C0(((Number) m78152BM().m135847f0().m129215c()).longValue(), ((Number) m78152BM().m135847f0().m129216d()).longValue());
            return;
        }
        int i19 = AbstractC6918a0.time_option_custom;
        if (num != null && num.intValue() == i19) {
            m78152BM().m135821B0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        m78152BM().m135851j0(i11, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle == null) {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null && m92642L3.containsKey("EXTRA_AUTO_REPLY_ID")) {
                C0697c0.Companion.m1054h(getTrackingKey(), "isEdit", Boolean.TRUE);
            }
            C0697c0.Companion.m1054h(getTrackingKey(), "sessionId", m78152BM().m135849h0());
            m78152BM().m135852q0(m92642L3());
        }
    }

    /* renamed from: zM */
    public final void m78194zM(boolean z11) {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setEnableTrailingButton(z11);
        }
    }
}
