package com.zing.zalo.common.chat.label;

import ag0.C0804b;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7005a5;
import com.zing.zalo.adapters.SelectMultiItemAddChatLabelAdapter;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.common.chat.label.SelectMultiItemAddChatLabelView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.p077ui.zviews.KeyboardAwareLinearLayout;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import dg0.AbstractC17930e;
import ed0.AbstractC18391a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19669z;
import hm0.C20096c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import ln0.AbstractC22543l;
import me0.AbstractC23089h6;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p130eh.C18431b;
import p132ej.C18440b;
import p132ej.C18451m;
import p227i3.C20215s;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.C23648e;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C29767db;
import p716zh.C32020m7;
import p720zl.C32223a;
import vg.C28146o3;
import zc0.C31784b;

/* loaded from: classes3.dex */
public final class SelectMultiItemAddChatLabelView extends SlidableZaloView {
    public static final C7855a Companion = new C7855a(null);

    /* renamed from: P0 */
    public C29767db f42248P0;

    /* renamed from: S0 */
    public SelectMultiItemAddChatLabelAdapter f42251S0;

    /* renamed from: d1 */
    private C28146o3 f42262d1;

    /* renamed from: Q0 */
    private C7005a5 f42249Q0 = new C7005a5();

    /* renamed from: R0 */
    private final C23528a f42250R0 = new C23528a(this.f72421L0.m92648SI());

    /* renamed from: T0 */
    private final C32223a f42252T0 = new C32223a();

    /* renamed from: U0 */
    private ArrayList f42253U0 = new ArrayList();

    /* renamed from: V0 */
    private ArrayList f42254V0 = new ArrayList();

    /* renamed from: W0 */
    private ArrayList f42255W0 = new ArrayList();

    /* renamed from: X0 */
    private ArrayList f42256X0 = new ArrayList();

    /* renamed from: Y0 */
    private HashMap f42257Y0 = new HashMap();

    /* renamed from: Z0 */
    private C32223a f42258Z0 = new C32223a();

    /* renamed from: a1 */
    private final HashSet f42259a1 = new HashSet();

    /* renamed from: b1 */
    private boolean f42260b1 = true;

    /* renamed from: c1 */
    private final TextWatcher f42261c1 = new C7857c();

    /* renamed from: com.zing.zalo.common.chat.label.SelectMultiItemAddChatLabelView$a */
    /* loaded from: classes3.dex */
    public static final class C7855a {
        private C7855a() {
        }

        public /* synthetic */ C7855a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.common.chat.label.SelectMultiItemAddChatLabelView$b */
    /* loaded from: classes3.dex */
    public static final class C7856b implements C28146o3.b {
        C7856b() {
        }

        @Override // vg.C28146o3.b
        /* renamed from: a */
        public void mo40211a() {
            int i11;
            boolean z11;
            String valueOf = String.valueOf(SelectMultiItemAddChatLabelView.this.m40205tM().f137567y.getText());
            int length = valueOf.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(valueOf.charAt(i11), 32) <= 0) {
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
            if (TextUtils.isEmpty(valueOf.subSequence(i12, length + 1).toString())) {
                SelectMultiItemAddChatLabelView.this.m40207vM().clear();
                SelectMultiItemAddChatLabelView.this.m40207vM().addAll(SelectMultiItemAddChatLabelView.this.m40193oM());
                if (!SelectMultiItemAddChatLabelView.this.m40207vM().isEmpty()) {
                    SelectMultiItemAddChatLabelView.this.m40202LM(false);
                    SelectMultiItemAddChatLabelView.this.m40206uM().m10008p();
                } else {
                    SelectMultiItemAddChatLabelView.this.m40202LM(true);
                }
            }
        }

        @Override // vg.C28146o3.b
        /* renamed from: b */
        public void mo40212b(boolean z11, String str, ArrayList arrayList, int i11) {
            C32020m7 c32020m7;
            int i12;
            boolean z12;
            AbstractC19074t.m100208f(str, "searchText");
            AbstractC19074t.m100208f(arrayList, "itemList");
            try {
                String valueOf = String.valueOf(SelectMultiItemAddChatLabelView.this.m40205tM().f137567y.getText());
                int length = valueOf.length() - 1;
                int i13 = 0;
                boolean z13 = false;
                while (i13 <= length) {
                    if (!z13) {
                        i12 = i13;
                    } else {
                        i12 = length;
                    }
                    if (AbstractC19074t.m100209g(valueOf.charAt(i12), 32) <= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z13) {
                        if (!z12) {
                            z13 = true;
                        } else {
                            i13++;
                        }
                    } else if (!z12) {
                        break;
                    } else {
                        length--;
                    }
                }
                if (AbstractC19074t.m100204b(str, valueOf.subSequence(i13, length + 1).toString())) {
                    SelectMultiItemAddChatLabelView.this.m40207vM().clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                        if (SelectMultiItemAddChatLabelView.this.m40208wM().containsKey(inviteContactProfile.f42434r) && (c32020m7 = (C32020m7) SelectMultiItemAddChatLabelView.this.m40208wM().get(inviteContactProfile.f42434r)) != null) {
                            SelectMultiItemAddChatLabelView.this.m40207vM().add(c32020m7);
                        }
                    }
                    if (z11 || (!SelectMultiItemAddChatLabelView.this.m40207vM().isEmpty())) {
                        SelectMultiItemAddChatLabelView.this.m40202LM(false);
                    }
                    if (!SelectMultiItemAddChatLabelView.this.m40207vM().isEmpty()) {
                        SelectMultiItemAddChatLabelView.this.m40202LM(false);
                        SelectMultiItemAddChatLabelView.this.m40206uM().m10008p();
                    } else {
                        SelectMultiItemAddChatLabelView.this.m40202LM(true);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.common.chat.label.SelectMultiItemAddChatLabelView$c */
    /* loaded from: classes3.dex */
    public static final class C7857c extends AbstractC18391a {
        C7857c() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            int i14;
            boolean z11;
            AbstractC19074t.m100208f(charSequence, C20215s.f99966b);
            CustomEditText customEditText = SelectMultiItemAddChatLabelView.this.m40205tM().f137567y;
            SelectMultiItemAddChatLabelView selectMultiItemAddChatLabelView = SelectMultiItemAddChatLabelView.this;
            String valueOf = String.valueOf(customEditText.getText());
            int length = valueOf.length() - 1;
            int i15 = 0;
            boolean z12 = false;
            while (i15 <= length) {
                if (!z12) {
                    i14 = i15;
                } else {
                    i14 = length;
                }
                if (AbstractC19074t.m100209g(valueOf.charAt(i14), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i15++;
                    }
                } else if (!z11) {
                    break;
                } else {
                    length--;
                }
            }
            selectMultiItemAddChatLabelView.m40204rM(valueOf.subSequence(i15, length + 1).toString());
        }
    }

    /* renamed from: com.zing.zalo.common.chat.label.SelectMultiItemAddChatLabelView$d */
    /* loaded from: classes3.dex */
    public static final class C7858d extends RecyclerView.AbstractC1892s {

        /* renamed from: a */
        final /* synthetic */ C29767db f42265a;

        C7858d(C29767db c29767db) {
            this.f42265a = c29767db;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            try {
                AbstractC2379w.m12430d(this.f42265a.f137567y);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.common.chat.label.SelectMultiItemAddChatLabelView$e */
    /* loaded from: classes3.dex */
    public static final class C7859e implements C7860a.c {
        C7859e() {
        }

        /* renamed from: f */
        public static final void m40214f(SelectMultiItemAddChatLabelView selectMultiItemAddChatLabelView) {
            AbstractC19074t.m100208f(selectMultiItemAddChatLabelView, "this$0");
            selectMultiItemAddChatLabelView.f72421L0.finish();
            C19669z.Companion.m103232a().m103198O0();
            ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_toast_add_chat_label_multi_success, Integer.valueOf(selectMultiItemAddChatLabelView.m40209xM().m155397k()), C7860a.Companion.m40303b().m40273Q(1)));
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: a */
        public void mo40215a(C20096c c20096c) {
            if (c20096c != null) {
                ToastUtils.m89268p(c20096c.m104492d());
            }
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: b */
        public void mo40216b(Object obj) {
            SelectMultiItemAddChatLabelView selectMultiItemAddChatLabelView = SelectMultiItemAddChatLabelView.this;
            selectMultiItemAddChatLabelView.mo70710wy(new Runnable() { // from class: ch.t
                public /* synthetic */ RunnableC3485t() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SelectMultiItemAddChatLabelView.C7859e.m40214f(SelectMultiItemAddChatLabelView.this);
                }
            });
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: c */
        public void mo40217c() {
            SelectMultiItemAddChatLabelView.this.f72421L0.mo46829Y();
        }

        @Override // com.zing.zalo.common.chat.label.C7860a.c
        /* renamed from: d */
        public void mo40218d() {
            SelectMultiItemAddChatLabelView.this.f72421L0.mo49315c4();
        }
    }

    /* renamed from: AM */
    public static final void m40175AM(SelectMultiItemAddChatLabelView selectMultiItemAddChatLabelView) {
        AbstractC19074t.m100208f(selectMultiItemAddChatLabelView, "this$0");
        if (selectMultiItemAddChatLabelView.f42254V0.isEmpty()) {
            selectMultiItemAddChatLabelView.m40202LM(true);
        } else {
            selectMultiItemAddChatLabelView.m40202LM(false);
            selectMultiItemAddChatLabelView.m40206uM().m35838Z(selectMultiItemAddChatLabelView.f42254V0);
            selectMultiItemAddChatLabelView.m40206uM().m10008p();
        }
        selectMultiItemAddChatLabelView.m40183IM();
    }

    /* renamed from: BM */
    public static final void m40176BM(SelectMultiItemAddChatLabelView selectMultiItemAddChatLabelView, RecyclerView recyclerView, int i11, View view) {
        AbstractC19074t.m100208f(selectMultiItemAddChatLabelView, "this$0");
        C32020m7 m35833U = selectMultiItemAddChatLabelView.m40206uM().m35833U(i11);
        if (m35833U != null) {
            int i12 = m35833U.f147410a;
            if (i12 != 1) {
                if (i12 == 41) {
                    selectMultiItemAddChatLabelView.m40180FM();
                    return;
                }
                return;
            }
            ContactProfile contactProfile = m35833U.f147411b;
            if (contactProfile != null) {
                AbstractC19074t.m100205c(contactProfile);
                if (selectMultiItemAddChatLabelView.f42252T0.m155390d(contactProfile.f42434r)) {
                    selectMultiItemAddChatLabelView.m40182HM(contactProfile);
                } else {
                    selectMultiItemAddChatLabelView.m40181GM(contactProfile);
                }
            }
        }
    }

    /* renamed from: CM */
    public static final void m40177CM(SelectMultiItemAddChatLabelView selectMultiItemAddChatLabelView, View view) {
        AbstractC19074t.m100208f(selectMultiItemAddChatLabelView, "this$0");
        C18431b m40271O = C7860a.Companion.m40303b().m40271O(1);
        ArrayList arrayList = new ArrayList();
        Iterator it = selectMultiItemAddChatLabelView.f42252T0.m155392f().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            arrayList.add(new Conversation((InviteContactProfile) next));
        }
        if (m40271O != null) {
            C7860a.b bVar = C7860a.Companion;
            String m40261E = bVar.m40303b().m40261E(C23648e.Companion.m123930b(), "label_multi", "chat_label", 0, arrayList);
            bVar.m40303b().m40295v(m40271O.m97665c(), new ArrayList(selectMultiItemAddChatLabelView.f42252T0.m155394h()), new C7859e(), m40261E);
        }
    }

    /* renamed from: DM */
    public static final boolean m40178DM(CustomEditText customEditText, TextView textView, int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(customEditText, "$this_apply");
        if (i11 == 3) {
            AbstractC2379w.m12430d(customEditText);
            return true;
        }
        return false;
    }

    /* renamed from: EM */
    public static final void m40179EM(SelectMultiItemAddChatLabelView selectMultiItemAddChatLabelView, RecyclerView recyclerView, int i11, View view) {
        AbstractC19074t.m100208f(selectMultiItemAddChatLabelView, "this$0");
        try {
            Object obj = selectMultiItemAddChatLabelView.f42252T0.m155392f().get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            InviteContactProfile inviteContactProfile = (InviteContactProfile) obj;
            if (selectMultiItemAddChatLabelView.f42252T0.m155390d(inviteContactProfile.f42434r)) {
                selectMultiItemAddChatLabelView.m40182HM(inviteContactProfile);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: FM */
    private final void m40180FM() {
        this.f42260b1 = false;
        this.f42254V0.clear();
        this.f42254V0.addAll(m40193oM());
        m40206uM().m10008p();
    }

    /* renamed from: GM */
    private final void m40181GM(ContactProfile contactProfile) {
        if (contactProfile != null) {
            this.f42252T0.m155387a(new InviteContactProfile(contactProfile));
            this.f42249Q0.m35846M(this.f42252T0.m155392f());
            this.f42249Q0.m10008p();
            m40206uM().m10008p();
        }
        Editable text = m40205tM().f137567y.getText();
        if (text != null) {
            text.clear();
        }
        m40203MM();
        m40184NM();
    }

    /* renamed from: HM */
    private final void m40182HM(ContactProfile contactProfile) {
        if (contactProfile != null) {
            this.f42252T0.m155396j(new InviteContactProfile(contactProfile));
            this.f42249Q0.m35846M(this.f42252T0.m155392f());
            this.f42249Q0.m10008p();
            m40206uM().m10008p();
        }
        Editable text = m40205tM().f137567y.getText();
        if (text != null) {
            text.clear();
        }
        m40203MM();
        m40184NM();
    }

    /* renamed from: IM */
    private final void m40183IM() {
        Iterator it = this.f42253U0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            C32020m7 c32020m7 = (C32020m7) next;
            if (this.f42259a1.contains(c32020m7.m154394a())) {
                this.f42252T0.m155387a(new InviteContactProfile(c32020m7.f147411b));
            }
        }
        this.f42259a1.clear();
        this.f42249Q0.m35846M(this.f42252T0.m155392f());
        m40203MM();
        this.f42249Q0.m10008p();
        m40206uM().m10008p();
        m40184NM();
    }

    /* renamed from: NM */
    private final void m40184NM() {
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_selected_num, Integer.valueOf(this.f42252T0.m155397k()));
            AbstractC19074t.m100207e(m118746s0, "getString(...)");
            m87077NK.setMiddleSubtitle(m118746s0);
        }
    }

    /* renamed from: oM */
    public final ArrayList m40193oM() {
        int m116584g;
        ArrayList arrayList = new ArrayList();
        if (!this.f42255W0.isEmpty()) {
            C32020m7 c32020m7 = new C32020m7(6);
            ContactProfile contactProfile = new ContactProfile("LABEL_SECTION_MUTE");
            contactProfile.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_section_mute);
            c32020m7.f147411b = contactProfile;
            arrayList.add(c32020m7);
            if (this.f42260b1) {
                ArrayList arrayList2 = this.f42255W0;
                m116584g = AbstractC22543l.m116584g(arrayList2.size(), 5);
                arrayList.addAll(arrayList2.subList(0, m116584g));
                if (this.f42255W0.size() > 5) {
                    arrayList.add(new C32020m7(41));
                }
            } else {
                arrayList.addAll(this.f42255W0);
            }
        }
        if (!this.f42256X0.isEmpty()) {
            C32020m7 c32020m72 = new C32020m7(6);
            c32020m72.f147416g = !arrayList.isEmpty();
            ContactProfile contactProfile2 = new ContactProfile("LABEL_SECTION_OTHERS");
            contactProfile2.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_section_others);
            c32020m72.f147411b = contactProfile2;
            arrayList.add(c32020m72);
            arrayList.addAll(this.f42256X0);
        }
        return arrayList;
    }

    /* renamed from: pM */
    private final boolean m40194pM(C32020m7 c32020m7) {
        ContactProfile contactProfile;
        if (C0804b.m2025g().m2032f(c32020m7.m154394a()) != null && (contactProfile = c32020m7.f147411b) != null && !AbstractC21935u.m114518H(contactProfile.f42434r) && !C21927m.m114302u().m114358t().containsKey(c32020m7.m154394a()) && !AbstractC23089h6.m118442j(c32020m7.m154394a())) {
            return true;
        }
        return false;
    }

    /* renamed from: qM */
    public static final void m40195qM(SelectMultiItemAddChatLabelView selectMultiItemAddChatLabelView) {
        AbstractC19074t.m100208f(selectMultiItemAddChatLabelView, "this$0");
        selectMultiItemAddChatLabelView.m40206uM().m35837Y();
        selectMultiItemAddChatLabelView.m40206uM().m35838Z(selectMultiItemAddChatLabelView.f42254V0);
        selectMultiItemAddChatLabelView.m40206uM().m10008p();
        selectMultiItemAddChatLabelView.f42249Q0.m10008p();
    }

    /* renamed from: sM */
    private final void m40196sM(ArrayList arrayList) {
        this.f42255W0.clear();
        this.f42256X0.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC19074t.m100207e(next, "next(...)");
            C32020m7 c32020m7 = (C32020m7) next;
            if (c32020m7.f147410a == 1) {
                if (m40194pM(c32020m7)) {
                    this.f42255W0.add(c32020m7);
                } else {
                    this.f42256X0.add(c32020m7);
                }
            }
        }
    }

    /* renamed from: yM */
    private final void m40197yM() {
        MultiStateView multiStateView = m40205tM().f137562t;
        m40205tM().f137565w.setVisibility(8);
        m40205tM().f137568z.setVisibility(8);
        multiStateView.setVisibility(0);
        multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
        this.f42253U0.clear();
        boolean m121513V = AbstractC23309i.m121513V();
        if (m121513V) {
            C21933s.m114404I().m114440R0(false);
            C19669z.Companion.m103232a().m103198O0();
        }
        AbstractC17930e.Companion.m94550a().mo94531e(new Runnable() { // from class: ch.n

            /* renamed from: q */
            public final /* synthetic */ boolean f14578q;

            public /* synthetic */ RunnableC3479n(boolean m121513V2) {
                r2 = m121513V2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                SelectMultiItemAddChatLabelView.m40198zM(SelectMultiItemAddChatLabelView.this, r2);
            }
        }, 500L);
    }

    /* renamed from: zM */
    public static final void m40198zM(SelectMultiItemAddChatLabelView selectMultiItemAddChatLabelView, boolean z11) {
        AbstractC19074t.m100208f(selectMultiItemAddChatLabelView, "this$0");
        for (C18451m c18451m : C19669z.m103155e0(C19669z.Companion.m103232a(), 0, null, 2, null)) {
            if (c18451m instanceof C18440b) {
                C18440b c18440b = (C18440b) c18451m;
                C32020m7 c32020m7 = new C32020m7(c18440b.m97729o().m40996I());
                selectMultiItemAddChatLabelView.f42253U0.add(c32020m7);
                selectMultiItemAddChatLabelView.f42257Y0.put(c18440b.m97729o().f42893q, c32020m7);
                selectMultiItemAddChatLabelView.f42258Z0.m155387a(new InviteContactProfile(c32020m7.f147411b));
            }
        }
        selectMultiItemAddChatLabelView.m40196sM(selectMultiItemAddChatLabelView.f42253U0);
        selectMultiItemAddChatLabelView.f42254V0.clear();
        selectMultiItemAddChatLabelView.f42254V0.addAll(selectMultiItemAddChatLabelView.m40193oM());
        if (z11) {
            C21933s.m114404I().m114440R0(z11);
            C19669z.Companion.m103232a().m103198O0();
        }
        selectMultiItemAddChatLabelView.f72827B0.post(new Runnable() { // from class: ch.s
            public /* synthetic */ RunnableC3484s() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SelectMultiItemAddChatLabelView.m40175AM(SelectMultiItemAddChatLabelView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ArrayList<String> stringArrayList;
        try {
            super.mo37111CJ(bundle);
            if (bundle != null) {
                try {
                    if (bundle.containsKey("BUNDLE_SAVE_KEY_ARR_SELECTED_ITEMS") && (stringArrayList = bundle.getStringArrayList("BUNDLE_SAVE_KEY_ARR_SELECTED_ITEMS")) != null) {
                        this.f42259a1.addAll(stringArrayList);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29767db m147860a = C29767db.m147860a(layoutInflater.inflate(AbstractC7409c0.select_multi_item_add_chat_label_view, (ViewGroup) null, false));
        AbstractC19074t.m100207e(m147860a, "bind(...)");
        CustomEditText customEditText = m147860a.f137567y;
        customEditText.setImeOptions(3);
        customEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: ch.o
            public /* synthetic */ C3480o() {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                boolean m40178DM;
                m40178DM = SelectMultiItemAddChatLabelView.m40178DM(CustomEditText.this, textView, i11, keyEvent);
                return m40178DM;
            }
        });
        customEditText.setSingleLine(true);
        customEditText.addTextChangedListener(this.f42261c1);
        C7005a5 c7005a5 = this.f42249Q0;
        c7005a5.f38321u = true;
        c7005a5.f38320t = false;
        RecyclerView recyclerView = m147860a.f137564v;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI(), 0, false));
        recyclerView.setAdapter(this.f42249Q0);
        C31784b.m152808a(recyclerView).m152809b(new C31784b.d() { // from class: ch.p
            public /* synthetic */ C3481p() {
            }

            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView2, int i11, View view) {
                SelectMultiItemAddChatLabelView.m40179EM(SelectMultiItemAddChatLabelView.this, recyclerView2, i11, view);
            }
        });
        RecyclerView recyclerView2 = m147860a.f137565w;
        C31784b.m152808a(recyclerView2).m152809b(new C31784b.d() { // from class: ch.q
            public /* synthetic */ C3482q() {
            }

            @Override // zc0.C31784b.d
            /* renamed from: i0 */
            public final void mo17458i0(RecyclerView recyclerView3, int i11, View view) {
                SelectMultiItemAddChatLabelView.m40176BM(SelectMultiItemAddChatLabelView.this, recyclerView3, i11, view);
            }
        });
        recyclerView2.m9826E(new C7858d(m147860a));
        Context m92689tK = this.f72421L0.m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        HashSet m155394h = this.f42252T0.m155394h();
        AbstractC19074t.m100207e(m155394h, "getUidSet(...)");
        m40201KM(new SelectMultiItemAddChatLabelAdapter(m92689tK, m155394h));
        recyclerView2.setAdapter(m40206uM());
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI()));
        recyclerView2.setHasFixedSize(true);
        m147860a.f137559q.setOnClickListener(new View.OnClickListener() { // from class: ch.r
            public /* synthetic */ ViewOnClickListenerC3483r() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectMultiItemAddChatLabelView.m40177CM(SelectMultiItemAddChatLabelView.this, view);
            }
        });
        m40199JM(m147860a);
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null && m92676n2.getWindow() != null) {
            m92676n2.mo35554O(18);
            m40205tM().getRoot().setEnableMeasureKeyboard(false);
        }
        KeyboardAwareLinearLayout root = m40205tM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: JM */
    public final void m40199JM(C29767db c29767db) {
        AbstractC19074t.m100208f(c29767db, "<set-?>");
        this.f42248P0 = c29767db;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 36);
    }

    /* renamed from: KM */
    public final void m40201KM(SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter) {
        AbstractC19074t.m100208f(selectMultiItemAddChatLabelAdapter, "<set-?>");
        this.f42251S0 = selectMultiItemAddChatLabelAdapter;
    }

    /* renamed from: LM */
    public final void m40202LM(boolean z11) {
        if (z11) {
            C29767db m40205tM = m40205tM();
            m40205tM.f137565w.setVisibility(8);
            m40205tM.f137562t.setVisibility(0);
            m40205tM.f137562t.setEmptyViewString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_empty_list_select_multi_item_add_chat_label));
            m40205tM.f137562t.setState(MultiStateView.EnumC15914e.EMPTY);
            return;
        }
        C29767db m40205tM2 = m40205tM();
        m40205tM2.f137565w.setVisibility(0);
        m40205tM2.f137562t.setVisibility(8);
    }

    /* renamed from: MM */
    public final void m40203MM() {
        try {
            if (this.f42252T0.m155395i()) {
                m40205tM().f137568z.setVisibility(8);
                m40205tM().f137563u.setVisibility(8);
            } else {
                m40205tM().f137568z.setVisibility(0);
                m40205tM().f137568z.setOnClickListener(null);
                m40205tM().f137563u.setVisibility(0);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            String m40272P = C7860a.Companion.m40303b().m40272P(AbstractC0924m0.m2896A4());
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_select_multi_item_add_chat_label, m40272P);
                AbstractC19074t.m100207e(m118746s0, "getString(...)");
                m87077NK.setMiddleTitle(m118746s0);
                String m118746s02 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_selected_num, Integer.valueOf(this.f42252T0.m155397k()));
                AbstractC19074t.m100207e(m118746s02, "getString(...)");
                m87077NK.setMiddleSubtitle(m118746s02);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SelectMultiItemAddChatLabelView", e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        AbstractC19074t.m100208f(bundle, "outState");
        super.mo37118SJ(bundle);
        if (this.f42252T0.m155397k() > 0) {
            bundle.putStringArrayList("BUNDLE_SAVE_KEY_ARR_SELECTED_ITEMS", new ArrayList<>(this.f42252T0.m155394h()));
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SelectMultiItemAddChatLabelView";
    }

    /* renamed from: rM */
    public final void m40204rM(String str) {
        C28146o3 c28146o3 = this.f42262d1;
        if (c28146o3 != null) {
            c28146o3.m141659d();
        }
        if (this.f42254V0.isEmpty()) {
            m40202LM(true);
        }
        C28146o3 c28146o32 = new C28146o3(str, false, this.f42258Z0.m155392f(), null, new C7856b());
        this.f42262d1 = c28146o32;
        c28146o32.start();
    }

    /* renamed from: tM */
    public final C29767db m40205tM() {
        C29767db c29767db = this.f42248P0;
        if (c29767db != null) {
            return c29767db;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: uM */
    public final SelectMultiItemAddChatLabelAdapter m40206uM() {
        SelectMultiItemAddChatLabelAdapter selectMultiItemAddChatLabelAdapter = this.f42251S0;
        if (selectMultiItemAddChatLabelAdapter != null) {
            return selectMultiItemAddChatLabelAdapter;
        }
        AbstractC19074t.m100223u("mContactAdapter");
        return null;
    }

    /* renamed from: vM */
    public final ArrayList m40207vM() {
        return this.f42254V0;
    }

    /* renamed from: wM */
    public final HashMap m40208wM() {
        return this.f42257Y0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 36) {
            mo70710wy(new Runnable() { // from class: ch.m
                public /* synthetic */ RunnableC3478m() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SelectMultiItemAddChatLabelView.m40195qM(SelectMultiItemAddChatLabelView.this);
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m40197yM();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SelectMultiItemAddChatLabelView", e11);
        }
    }

    /* renamed from: xM */
    public final C32223a m40209xM() {
        return this.f42252T0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 36);
    }
}
