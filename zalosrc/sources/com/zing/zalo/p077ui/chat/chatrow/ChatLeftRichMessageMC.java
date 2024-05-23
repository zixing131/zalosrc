package com.zing.zalo.p077ui.chat.chatrow;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.adapters.C7075g6;
import com.zing.zalo.p077ui.widget.C13646i;
import com.zing.zalo.p077ui.widget.ChatMsgFooterView;
import com.zing.zalo.p077ui.widget.ChatRichFooterViewV2;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import com.zing.zalo.tracking.actionlogv2.ActionLogChatLocation;
import dj.C17945a0;
import dj.C17970i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p038bl.C2829a;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p379o3.C23999j;
import p379o3.C24003n;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;
import p716zh.C31842a9;
import th.AbstractC26683d;
import tj.C26712d;
import vg.AbstractC28245z3;
import yf0.C30939f0;

/* loaded from: classes5.dex */
public class ChatLeftRichMessageMC extends ChatMessageBase {

    /* renamed from: I */
    LinearLayout f57140I;

    /* renamed from: J */
    RoundedImageView f57141J;

    /* renamed from: K */
    TextView f57142K;

    /* renamed from: L */
    TextView f57143L;

    /* renamed from: M */
    TextView f57144M;

    /* renamed from: N */
    ListView f57145N;

    /* renamed from: O */
    View f57146O;

    /* renamed from: P */
    C17970i1 f57147P;

    /* renamed from: Q */
    TextView f57148Q;

    /* renamed from: R */
    ArrayList f57149R;

    /* renamed from: S */
    C7075g6 f57150S;

    /* renamed from: T */
    ViewStub f57151T;

    /* renamed from: U */
    ChatMsgFooterView f57152U;

    /* renamed from: V */
    InterfaceC11325b f57153V;

    /* renamed from: W */
    ChatRichFooterViewV2 f57154W;

    /* renamed from: a0 */
    ChatRichFooterViewV2 f57155a0;

    /* renamed from: b0 */
    C17945a0 f57156b0;

    /* renamed from: c0 */
    int f57157c0;

    /* renamed from: d0 */
    C13646i.b f57158d0;

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatLeftRichMessageMC$a */
    /* loaded from: classes5.dex */
    class C11324a implements C13646i.b {
        C11324a() {
        }

        @Override // com.zing.zalo.p077ui.widget.C13646i.b
        /* renamed from: a */
        public void mo60887a(String str, String str2, int i11) {
            String str3;
            C17945a0 c17945a0 = ChatLeftRichMessageMC.this.f57156b0;
            if (c17945a0 != null) {
                str3 = c17945a0.m95029V3().m41046j();
            } else {
                str3 = "";
            }
            String str4 = str3;
            ChatLeftRichMessageMC chatLeftRichMessageMC = ChatLeftRichMessageMC.this;
            InterfaceC11325b interfaceC11325b = chatLeftRichMessageMC.f57153V;
            if (interfaceC11325b != null) {
                interfaceC11325b.mo60891d(str, str2, i11, chatLeftRichMessageMC.f57157c0, str4, chatLeftRichMessageMC.f57156b0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatLeftRichMessageMC$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11325b {
        /* renamed from: a */
        boolean mo60888a();

        /* renamed from: b */
        void mo60889b(C17945a0 c17945a0, int i11, boolean z11, boolean z12);

        /* renamed from: c */
        void mo60890c(String str);

        /* renamed from: d */
        void mo60891d(String str, String str2, int i11, int i12, String str3, C17945a0 c17945a0);

        /* renamed from: e */
        void mo60892e(C31842a9 c31842a9);
    }

    public ChatLeftRichMessageMC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57158d0 = new C11324a();
    }

    /* renamed from: k */
    public /* synthetic */ void m60878k(View view) {
        InterfaceC11325b interfaceC11325b;
        try {
            if (this.f57147P.m95600b() != null && (interfaceC11325b = this.f57153V) != null) {
                interfaceC11325b.mo60892e(this.f57147P.m95600b());
            } else {
                InterfaceC11325b interfaceC11325b2 = this.f57153V;
                if (interfaceC11325b2 != null) {
                    interfaceC11325b2.mo60890c(this.f57147P.m95603e());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public /* synthetic */ void m60879l(AdapterView adapterView, View view, int i11, long j11) {
        InterfaceC11325b interfaceC11325b;
        try {
            C17970i1 c17970i1 = (C17970i1) this.f57149R.get(i11);
            if (c17970i1.m95600b() != null && (interfaceC11325b = this.f57153V) != null) {
                interfaceC11325b.mo60892e(c17970i1.m95600b());
            } else {
                InterfaceC11325b interfaceC11325b2 = this.f57153V;
                if (interfaceC11325b2 != null) {
                    interfaceC11325b2.mo60890c(c17970i1.m95603e());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    void m60880i(C17945a0 c17945a0) {
        int m13676a;
        try {
            Map mo150728A = AbstractC23306f.m120726x1().mo150728A();
            if (c17945a0 != null && this.f57153V != null && mo150728A.size() > 0 && this.f57153V.mo60888a() && (m13676a = C2829a.m13676a(mo150728A, c17945a0.mo95039W2(), c17945a0.m95029V3().m41045i())) > 0) {
                this.f57153V.mo60889b(c17945a0, m13676a, false, false);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    void m60881j() {
        try {
            this.f57140I = (LinearLayout) this.f57167F.findViewById(AbstractC6918a0.layout_parent_message);
            RoundedImageView roundedImageView = (RoundedImageView) this.f57167F.findViewById(AbstractC6918a0.img_header);
            this.f57141J = roundedImageView;
            roundedImageView.getLayoutParams().height = (int) ((AbstractC23136l9.m118766z(getContext()) - (AbstractC23136l9.m118742r(10.0f) * 2)) / 1.55d);
            this.f57142K = (TextView) this.f57167F.findViewById(AbstractC6918a0.des_header_overlay);
            this.f57143L = (TextView) this.f57167F.findViewById(AbstractC6918a0.des_header);
            this.f57144M = (TextView) this.f57167F.findViewById(AbstractC6918a0.description);
            this.f57145N = (ListView) this.f57167F.findViewById(AbstractC6918a0.list_richmessage);
            this.f57146O = this.f57167F.findViewById(AbstractC6918a0.list_richmessage_divider);
            this.f57148Q = (TextView) this.f57167F.findViewById(AbstractC6918a0.chat_left_rich_msg_time);
            C7075g6 c7075g6 = new C7075g6(getContext(), new ArrayList());
            this.f57150S = c7075g6;
            this.f57145N.setAdapter((ListAdapter) c7075g6);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    void m60882m(C17945a0 c17945a0) {
        C30939f0.a aVar = C30939f0.Companion;
        if (!aVar.m150479e()) {
            return;
        }
        C17970i1 m95285w4 = c17945a0.m95285w4();
        ArrayList m94922J3 = c17945a0.m94922J3();
        if (!aVar.m150479e()) {
            return;
        }
        if (m95285w4 != null) {
            String m95603e = m95285w4.m95603e();
            if (!TextUtils.isEmpty(m95603e)) {
                aVar.m150482h(getContext(), m95603e, null);
            }
        }
        if (m94922J3 != null && m94922J3.size() > 0) {
            Iterator it = m94922J3.iterator();
            while (it.hasNext()) {
                C17970i1 c17970i1 = (C17970i1) it.next();
                if (c17970i1 != null) {
                    String m95603e2 = c17970i1.m95603e();
                    if (!TextUtils.isEmpty(m95603e2)) {
                        C30939f0.Companion.m150482h(getContext(), m95603e2, null);
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public void m60883n(C17945a0 c17945a0, boolean z11) {
        if (this.f57148Q != null) {
            if (c17945a0.m94967O4().trim().length() <= 0) {
                this.f57148Q.setVisibility(8);
            } else if (z11) {
                this.f57148Q.setText(c17945a0.m94967O4());
                this.f57148Q.setVisibility(0);
            } else {
                this.f57148Q.setVisibility(8);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (AbstractC26683d.f126393l) {
            TextView textView = this.f57143L;
            if (textView != null) {
                AbstractC28245z3.m142218a(textView.getText(), this.f57143L);
            }
            TextView textView2 = this.f57144M;
            if (textView2 != null) {
                AbstractC28245z3.m142218a(textView2.getText(), this.f57144M);
            }
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        m60896a(getContext());
        setOrientation(1);
        m60881j();
    }

    /* renamed from: p */
    public void m60884p(C23528a c23528a, C17945a0 c17945a0, InterfaceC27218a interfaceC27218a, C24003n c24003n, boolean z11) {
        try {
            this.f57156b0 = c17945a0;
            this.f57141J.setVisibility(0);
            this.f57147P = c17945a0.m95285w4();
            this.f57149R = c17945a0.m94922J3();
            if (this.f57147P.m95605g().isEmpty()) {
                this.f57141J.setVisibility(8);
            } else {
                if (z11 && !C23999j.m125696L2(this.f57147P.m95605g(), c24003n)) {
                    this.f57141J.setImageDrawable(C23212s8.m119609q(getContext(), AbstractC16781w.DefaultBitmapImagePlaceHolder));
                }
                ((C23528a) c23528a.m123612r(this.f57141J)).m123618x(this.f57147P.m95605g(), c24003n);
            }
            CharSequence m95606h = this.f57147P.m95606h();
            if (AbstractC26683d.f126393l) {
                m95606h = C28652r.m143349v().m143353D(this.f57147P.m95606h());
                AbstractC28245z3.m142219b(m95606h, this.f57143L);
            }
            this.f57142K.setText(this.f57147P.m95606h());
            this.f57143L.setText(m95606h);
            ViewOnClickListenerC11466e viewOnClickListenerC11466e = new View.OnClickListener() { // from class: com.zing.zalo.ui.chat.chatrow.e
                public /* synthetic */ ViewOnClickListenerC11466e() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChatLeftRichMessageMC.this.m60878k(view);
                }
            };
            this.f57141J.setOnClickListener(viewOnClickListenerC11466e);
            this.f57142K.setOnClickListener(viewOnClickListenerC11466e);
            this.f57143L.setOnClickListener(viewOnClickListenerC11466e);
            this.f57144M.setOnClickListener(viewOnClickListenerC11466e);
            this.f57142K.setVisibility(8);
            this.f57143L.setVisibility(8);
            if (!TextUtils.isEmpty(this.f57147P.m95602d())) {
                CharSequence m95602d = this.f57147P.m95602d();
                if (AbstractC26683d.f126393l) {
                    m95602d = C28652r.m143349v().m143353D(this.f57147P.m95602d());
                    AbstractC28245z3.m142219b(m95602d, this.f57144M);
                }
                this.f57144M.setText(m95602d);
                this.f57144M.setVisibility(0);
                this.f57143L.setVisibility(0);
            } else {
                this.f57144M.setVisibility(8);
                this.f57142K.setVisibility(0);
            }
            if (this.f57147P.m95607i().equals("l.a.header.full")) {
                this.f57145N.setVisibility(8);
                this.f57146O.setVisibility(8);
            } else {
                ArrayList arrayList = this.f57149R;
                if (arrayList != null && arrayList.size() > 0) {
                    this.f57145N.setVisibility(0);
                    this.f57146O.setVisibility(0);
                    this.f57150S.m36111b(c23528a);
                    this.f57150S.m36110a(this.f57149R);
                    this.f57145N.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.zing.zalo.ui.chat.chatrow.f
                        public /* synthetic */ C11470f() {
                        }

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
                            ChatLeftRichMessageMC.this.m60879l(adapterView, view, i11, j11);
                        }
                    });
                    if (this.f57149R.size() > 0) {
                        View view = this.f57150S.getView(0, null, this.f57140I);
                        view.measure(View.MeasureSpec.makeMeasureSpec(AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(10.0f) * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                        int measuredHeight = view.getMeasuredHeight();
                        this.f57145N.getLayoutParams().height = this.f57149R.size() * measuredHeight;
                        this.f57145N.setLayoutParams(new LinearLayout.LayoutParams(-1, measuredHeight * this.f57149R.size()));
                    }
                    this.f57150S.notifyDataSetChanged();
                } else {
                    this.f57145N.setVisibility(8);
                    this.f57146O.setVisibility(8);
                }
            }
            m60885q(c17945a0, interfaceC27218a);
            m60880i(c17945a0);
            m60886r(c17945a0);
            m60882m(c17945a0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    void m60885q(C17945a0 c17945a0, InterfaceC27218a interfaceC27218a) {
        try {
            ChatMsgFooterView chatMsgFooterView = this.f57152U;
            if (chatMsgFooterView != null) {
                chatMsgFooterView.setVisibility(8);
            }
            if (c17945a0.m94912I2() != null) {
                if (this.f57151T == null) {
                    ViewStub viewStub = (ViewStub) this.f57167F.findViewById(AbstractC6918a0.viewstubMsgFooter);
                    this.f57151T = viewStub;
                    viewStub.setVisibility(0);
                    this.f57152U = (ChatMsgFooterView) this.f57167F.findViewById(AbstractC6918a0.chat_footer_container_layout);
                }
                ChatMsgFooterView chatMsgFooterView2 = this.f57152U;
                if (chatMsgFooterView2 != null) {
                    chatMsgFooterView2.m75617b(c17945a0, interfaceC27218a);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: r */
    void m60886r(C17945a0 c17945a0) {
        try {
            ChatRichFooterViewV2 chatRichFooterViewV2 = this.f57154W;
            if (chatRichFooterViewV2 != null) {
                chatRichFooterViewV2.setVisibility(8);
            }
            ChatRichFooterViewV2 chatRichFooterViewV22 = this.f57155a0;
            if (chatRichFooterViewV22 != null) {
                chatRichFooterViewV22.setVisibility(8);
            }
            if (c17945a0 != null && c17945a0.m95071Z3() != null && c17945a0.m95071Z3().m137362g() && !c17945a0.m95071Z3().m137358c().isEmpty()) {
                List m137358c = c17945a0.m95071Z3().m137358c();
                ActionLogChatLocation.FooterLogData footerLogData = new ActionLogChatLocation.FooterLogData(c17945a0.m95029V3(), c17945a0.m95071Z3().m137360e());
                this.f57157c0 = c17945a0.m95041W4();
                int m118722k0 = AbstractC23136l9.m118722k0() - (AbstractC23136l9.m118742r(10.0f) * 2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < m137358c.size(); i11++) {
                    if (((C26712d) m137358c.get(i11)).m137348p()) {
                        C26712d c26712d = (C26712d) m137358c.get(i11);
                        if (c26712d.m137346n()) {
                            arrayList.add(c26712d);
                        } else if (c26712d.m137347o()) {
                            arrayList2.add(c26712d);
                        }
                    }
                    if (i11 == 0 && ((C26712d) m137358c.get(i11)).m137344l() == 0) {
                        break;
                    }
                }
                if (arrayList.size() > 0) {
                    if (this.f57154W == null) {
                        ChatRichFooterViewV2 chatRichFooterViewV23 = (ChatRichFooterViewV2) ((ViewStub) this.f57167F.findViewById(AbstractC6918a0.stubFooterV2Inside)).inflate();
                        this.f57154W = chatRichFooterViewV23;
                        chatRichFooterViewV23.setFooterClickListener(this.f57158d0);
                    }
                    this.f57154W.setVisibility(0);
                    this.f57154W.m75622a(arrayList, m118722k0, footerLogData);
                }
                if (arrayList2.size() > 0) {
                    if (this.f57155a0 == null) {
                        ChatRichFooterViewV2 chatRichFooterViewV24 = (ChatRichFooterViewV2) ((ViewStub) this.f57167F.findViewById(AbstractC6918a0.stubFooterV2Outside)).inflate();
                        this.f57155a0 = chatRichFooterViewV24;
                        chatRichFooterViewV24.setFooterClickListener(this.f57158d0);
                    }
                    this.f57155a0.setVisibility(0);
                    this.f57155a0.m75622a(arrayList2, m118722k0, footerLogData);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setOnListItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        ListView listView = this.f57145N;
        if (listView != null) {
            listView.setOnItemLongClickListener(onItemLongClickListener);
        }
    }

    public void setOnLongClickAction(View.OnLongClickListener onLongClickListener) {
        RoundedImageView roundedImageView = this.f57141J;
        if (roundedImageView != null) {
            roundedImageView.setOnLongClickListener(onLongClickListener);
        }
        TextView textView = this.f57142K;
        if (textView != null) {
            textView.setOnLongClickListener(onLongClickListener);
        }
        TextView textView2 = this.f57143L;
        if (textView2 != null) {
            textView2.setOnLongClickListener(onLongClickListener);
        }
        TextView textView3 = this.f57144M;
        if (textView3 != null) {
            textView3.setOnLongClickListener(onLongClickListener);
        }
    }

    public void setRichMessageListener(InterfaceC11325b interfaceC11325b) {
        this.f57153V = interfaceC11325b;
    }

    public void setViewTag(Object obj) {
        try {
            setTag(obj);
            RoundedImageView roundedImageView = this.f57141J;
            if (roundedImageView != null) {
                roundedImageView.setTag(obj);
            }
            TextView textView = this.f57142K;
            if (textView != null) {
                textView.setTag(obj);
            }
            TextView textView2 = this.f57143L;
            if (textView2 != null) {
                textView2.setTag(obj);
            }
            TextView textView3 = this.f57144M;
            if (textView3 != null) {
                textView3.setTag(obj);
            }
            ListView listView = this.f57145N;
            if (listView != null) {
                listView.setTag(obj);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
