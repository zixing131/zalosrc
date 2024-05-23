package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.C0943w;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ib0.C20500d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import me0.AbstractC23268y2;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p354n3.C23528a;
import p363nh.C23744a;
import p459qs.C25490c;
import p588vw.C28652r;
import p716zh.C31884d6;
import p716zh.C31944h6;
import p716zh.C31973j5;
import p716zh.C31988k5;
import p716zh.C32002l4;
import p716zh.C32098s;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class PinMessageDetailView extends SlidableZaloView implements C23744a.c, View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    View f75995P0;

    /* renamed from: Q0 */
    View f75996Q0;

    /* renamed from: R0 */
    View f75997R0;

    /* renamed from: S0 */
    RecyclingImageView f75998S0;

    /* renamed from: T0 */
    TextView f75999T0;

    /* renamed from: U0 */
    TextView f76000U0;

    /* renamed from: V0 */
    View f76001V0;

    /* renamed from: W0 */
    TextView f76002W0;

    /* renamed from: X0 */
    TextView f76003X0;

    /* renamed from: Y0 */
    View f76004Y0;

    /* renamed from: Z0 */
    RecyclingImageView f76005Z0;

    /* renamed from: a1 */
    View f76006a1;

    /* renamed from: b1 */
    RobotoTextView f76007b1;

    /* renamed from: c1 */
    RobotoTextView f76008c1;

    /* renamed from: d1 */
    MultiStateView f76009d1;

    /* renamed from: e1 */
    C23528a f76010e1;

    /* renamed from: f1 */
    String f76011f1;

    /* renamed from: g1 */
    String f76012g1;

    /* renamed from: h1 */
    C7904b f76013h1;

    /* renamed from: i1 */
    final List f76014i1 = new ArrayList();

    /* renamed from: j1 */
    C20500d f76015j1 = new C20500d(true);

    /* renamed from: k1 */
    String f76016k1 = "";

    /* renamed from: l1 */
    boolean f76017l1 = false;

    /* renamed from: com.zing.zalo.ui.zviews.PinMessageDetailView$a */
    /* loaded from: classes6.dex */
    class C14760a extends C20500d.a {
        C14760a() {
        }

        @Override // ib0.C20500d.a
        /* renamed from: a */
        public void mo80103a(String str) {
            AbstractC23211s7.m119561A(str, C32002l4.m154264g(39), PinMessageDetailView.this.f72421L0.m92662fJ());
        }

        @Override // ib0.C20500d.a
        /* renamed from: c */
        public void mo35612c(String str) {
            AbstractC23184q2.m119465w(str, PinMessageDetailView.this.f72421L0.getContext(), PinMessageDetailView.this.f72421L0.m92676n2());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PinMessageDetailView$b */
    /* loaded from: classes6.dex */
    public class C14761b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C31988k5 f76019a;

        C14761b(C31988k5 c31988k5) {
            this.f76019a = c31988k5;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                C23744a.m124114c().m124116d(67, this.f76019a.m154218b());
                C25490c.m132054j().m132063k(PinMessageDetailView.this.f76011f1, this.f76019a.m154218b());
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.PinMessageDetailView$c */
    /* loaded from: classes6.dex */
    public class C14762c implements InterfaceC20094a {
        C14762c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            PinMessageDetailView.this.f76017l1 = false;
            if (c20096c.m104491c() == 17034) {
                PinMessageDetailView pinMessageDetailView = PinMessageDetailView.this;
                pinMessageDetailView.f76013h1 = null;
                pinMessageDetailView.m82766oM();
            }
            PinMessageDetailView.this.m82764BM(false, c20096c.m104491c());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            PinMessageDetailView.this.f76017l1 = false;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    PinMessageDetailView.this.f76013h1 = new C7904b(optJSONObject, "group_" + PinMessageDetailView.this.f76011f1);
                    PinMessageDetailView.this.f76012g1 = C25490c.m132054j().m132059e(PinMessageDetailView.this.f76013h1).m154218b();
                    PinMessageDetailView.this.m82766oM();
                    PinMessageDetailView.this.m82764BM(false, 0);
                    PinMessageDetailView.this.m82766oM();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                PinMessageDetailView.this.m82764BM(false, -1);
            }
        }
    }

    /* renamed from: AM */
    private void m82746AM() {
        C31973j5 m4472f;
        if (m87077NK() != null && (m4472f = C0943w.m4462l().m4472f(this.f76011f1)) != null) {
            m87077NK().setMiddleSubtitle(m4472f.m153793y());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m82755pM(C32002l4 c32002l4, View view) {
        AbstractC23211s7.m119561A(this.f76013h1.f42750v, c32002l4, this.f72421L0.m92662fJ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ void m82756qM(C32098s c32098s, View view) {
        AbstractC23184q2.m119465w(c32098s.f147969s, this.f72421L0.getContext(), this.f72421L0.m92676n2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011b A[Catch: Exception -> 0x000d, TryCatch #0 {Exception -> 0x000d, blocks: (B:2:0x0000, B:4:0x0009, B:7:0x0010, B:9:0x001e, B:13:0x0033, B:15:0x0039, B:17:0x0040, B:18:0x004d, B:20:0x0058, B:22:0x0078, B:24:0x0080, B:25:0x009d, B:26:0x00b0, B:28:0x00ba, B:31:0x00c5, B:32:0x00ec, B:34:0x0115, B:36:0x011b, B:37:0x0123, B:39:0x0129, B:43:0x0142, B:44:0x013b, B:46:0x015c, B:48:0x0170, B:71:0x0203, B:79:0x0112, B:80:0x00e0, B:81:0x008c, B:82:0x00ab, B:83:0x003c, B:84:0x0024, B:86:0x0028, B:51:0x0178, B:53:0x018f, B:55:0x019b, B:57:0x01b9, B:58:0x01cd, B:61:0x01f3, B:64:0x01c8, B:65:0x01f7, B:67:0x01fd, B:76:0x0108), top: B:1:0x0000, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: rM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void m82757rM() {
        C7904b c7904b;
        boolean z11;
        int i11;
        String m118743r0;
        SpannableStringBuilder spannableStringBuilder;
        List<C7907e.a> list;
        C7904b c7904b2;
        String substring;
        try {
            this.f76014i1.clear();
            if (this.f76013h1 == null) {
                m82763zM();
                return;
            }
            C31973j5 m4472f = C0943w.m4462l().m4472f(this.f76011f1);
            int i12 = 0;
            if ((m4472f != null && m4472f.m153742T()) || ((c7904b = this.f76013h1) != null && c7904b.m40777o())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m4472f != null && m4472f.m153747Y()) {
                i11 = AbstractC8020f0.str_remove_from_community_board;
            } else {
                i11 = AbstractC8020f0.str_remove_from_group_board;
            }
            if (z11) {
                this.f76014i1.add(AbstractC23184q2.m119451i(AbstractC23136l9.m118743r0(i11), i11));
            }
            m82763zM();
            if (this.f76013h1.f42719G != null) {
                this.f75997R0.setVisibility(0);
                this.f75999T0.setText(this.f76013h1.f42719G.m40485u1());
                ContactProfile m141809c = C28203u6.f131407a.m141809c(this.f76013h1.f42719G.f42434r);
                if (m141809c != null && !TextUtils.isEmpty(m141809c.f42446v)) {
                    AbstractC23268y2.m120028b(this.f76010e1, this.f75998S0, m141809c, C23278z2.m120143n(), false);
                } else {
                    AbstractC23268y2.m120031e(this.f76010e1, this.f75998S0, this.f76013h1.f42719G.f42446v, C23278z2.m120143n());
                }
                this.f76000U0.setText(AbstractC23160o0.m119181A(this.f76013h1.f42717E));
            } else {
                this.f75997R0.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f76013h1.f42751w) && !TextUtils.isEmpty(this.f76013h1.f42750v)) {
                final C32002l4 m154264g = C32002l4.m154264g(39);
                C7904b c7904b3 = this.f76013h1;
                m118743r0 = AbstractC21935u.m114542i(c7904b3.f42750v, c7904b3.f42751w);
                this.f76002W0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.s50
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        PinMessageDetailView.this.m82755pM(m154264g, view);
                    }
                });
                this.f76002W0.setText(m118743r0);
                spannableStringBuilder = new SpannableStringBuilder(C28652r.m143349v().m143357H(this.f76013h1.f42754z));
                if (C31944h6.m153544j(spannableStringBuilder)) {
                    try {
                        C31944h6.m153538d(spannableStringBuilder, 7, C31884d6.m153209a());
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
                list = this.f76013h1.f42713A;
                if (list != null) {
                    C31884d6 m153209a = C31884d6.m153209a();
                    for (C7907e.a aVar : list) {
                        if (TextUtils.isEmpty(aVar.f42796f)) {
                            substring = "";
                        } else {
                            substring = aVar.f42796f.substring(1);
                        }
                        String str = substring;
                        String valueOf = String.valueOf(aVar.m40866d());
                        int i13 = aVar.f42795e;
                        C31944h6.m153541g(5, valueOf, i13, i13 + aVar.f42794d, spannableStringBuilder, str, m153209a.f146459e);
                    }
                }
                this.f76003X0.setText(spannableStringBuilder);
                this.f76003X0.setMovementMethod(this.f76015j1);
                c7904b2 = this.f76013h1;
                if (c7904b2.f42746r != 38 && !TextUtils.isEmpty(c7904b2.f42749u)) {
                    try {
                        JSONObject jSONObject = new JSONObject(this.f76013h1.f42749u);
                        if (TextUtils.equals("recommened.link", jSONObject.optString("action"))) {
                            String optString = jSONObject.optString("params");
                            if (!TextUtils.isEmpty(optString)) {
                                this.f76004Y0.setVisibility(0);
                                final C32098s c32098s = new C32098s(new JSONObject(optString));
                                this.f76007b1.setText(c32098s.f147953c);
                                if (!TextUtils.isEmpty(c32098s.f147952b)) {
                                    this.f76008c1.setVisibility(0);
                                    this.f76008c1.setText(c32098s.f147952b);
                                } else {
                                    this.f76008c1.setVisibility(8);
                                }
                                AbstractC23268y2.m120031e(this.f76010e1, this.f76005Z0, this.f76013h1.m40766d(), C23278z2.m120083M0());
                                this.f76004Y0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.t50
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        PinMessageDetailView.this.m82756qM(c32098s, view);
                                    }
                                });
                                View view = this.f76006a1;
                                if (!c32098s.m154939i()) {
                                    i12 = 8;
                                }
                                view.setVisibility(i12);
                                return;
                            }
                            this.f76004Y0.setVisibility(8);
                            return;
                        }
                        this.f76004Y0.setVisibility(8);
                        return;
                    } catch (Exception e12) {
                        AbstractC23350e.m122778h(e12);
                        return;
                    }
                }
            }
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinned_message);
            this.f76002W0.setOnClickListener(null);
            this.f76002W0.setText(m118743r0);
            spannableStringBuilder = new SpannableStringBuilder(C28652r.m143349v().m143357H(this.f76013h1.f42754z));
            if (C31944h6.m153544j(spannableStringBuilder)) {
            }
            list = this.f76013h1.f42713A;
            if (list != null) {
            }
            this.f76003X0.setText(spannableStringBuilder);
            this.f76003X0.setMovementMethod(this.f76015j1);
            c7904b2 = this.f76013h1;
            if (c7904b2.f42746r != 38) {
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public /* synthetic */ void m82758sM(SimpleAdapter simpleAdapter, InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        int intValue = ((Integer) ((HashMap) simpleAdapter.getItem(i11)).get("id")).intValue();
        if (intValue == AbstractC8020f0.str_remove_from_group_board || intValue == AbstractC8020f0.str_remove_from_community_board) {
            showDialog(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public /* synthetic */ void m82759tM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
        m82767xM(C25490c.m132054j().m132062h(this.f76012g1));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: uM */
    public /* synthetic */ void m82760uM(View view) {
        showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m82761vM(boolean z11, int i11) {
        try {
            if (z11) {
                MultiStateView multiStateView = this.f76009d1;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                    this.f76009d1.setState(MultiStateView.EnumC15914e.LOADING);
                }
                this.f75996Q0.setVisibility(8);
                return;
            }
            if (i11 == 0) {
                this.f76009d1.setVisibility(8);
                this.f75996Q0.setVisibility(0);
                return;
            }
            if (i11 != 17034) {
                if (i11 != 50001) {
                    this.f76009d1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_topic_error_loading_topic_info));
                    this.f76009d1.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                } else {
                    this.f76009d1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                    this.f76009d1.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
                }
            } else {
                this.f76009d1.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_topic_is_deleted));
                this.f76009d1.setErrorType(MultiStateView.EnumC15915f.DELETED_ERROR);
                this.f76009d1.setErrorImageResource(AbstractC16803z.empty_delete);
            }
            this.f76009d1.setState(MultiStateView.EnumC15914e.ERROR);
            this.f76009d1.setVisibility(0);
            this.f75996Q0.setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m82762wM() {
        m82768yM(this.f76016k1);
    }

    /* renamed from: zM */
    private void m82763zM() {
        boolean z11;
        if (m87077NK() != null && m87077NK().getTrailingButton() != null) {
            int i11 = 0;
            if (this.f76013h1 != null && !this.f76014i1.isEmpty()) {
                z11 = true;
            } else {
                z11 = false;
            }
            Button trailingButton = m87077NK().getTrailingButton();
            if (!z11) {
                i11 = 8;
            }
            trailingButton.setVisibility(i11);
        }
    }

    /* renamed from: BM */
    void m82764BM(final boolean z11, final int i11) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.o50
            @Override // java.lang.Runnable
            public final void run() {
                PinMessageDetailView.this.m82761vM(z11, i11);
            }
        });
    }

    /* renamed from: CM */
    void m82765CM() {
        this.f75996Q0 = this.f75995P0.findViewById(AbstractC6918a0.content_container);
        MultiStateView multiStateView = (MultiStateView) this.f75995P0.findViewById(AbstractC6918a0.multi_state);
        this.f76009d1 = multiStateView;
        multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.n50
            @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
            /* renamed from: a */
            public final void mo12138a() {
                PinMessageDetailView.this.m82762wM();
            }
        });
        this.f75997R0 = this.f75995P0.findViewById(AbstractC6918a0.post_header);
        RecyclingImageView recyclingImageView = (RecyclingImageView) this.f75995P0.findViewById(AbstractC6918a0.iv_creator_avt);
        this.f75998S0 = recyclingImageView;
        recyclingImageView.setOnClickListener(this);
        TextView textView = (TextView) this.f75995P0.findViewById(AbstractC6918a0.tv_creator_name);
        this.f75999T0 = textView;
        textView.setOnClickListener(this);
        this.f76000U0 = (TextView) this.f75995P0.findViewById(AbstractC6918a0.tv_timeline);
        View findViewById = this.f75995P0.findViewById(AbstractC6918a0.group_board);
        this.f76001V0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f76002W0 = (TextView) this.f75995P0.findViewById(AbstractC6918a0.sender);
        this.f76003X0 = (TextView) this.f75995P0.findViewById(AbstractC6918a0.message);
        View findViewById2 = this.f75995P0.findViewById(AbstractC6918a0.link_container);
        this.f76004Y0 = findViewById2;
        findViewById2.setVisibility(8);
        this.f76005Z0 = (RecyclingImageView) this.f75995P0.findViewById(AbstractC6918a0.link_thumb);
        this.f76006a1 = this.f75995P0.findViewById(AbstractC6918a0.link_play_btn);
        this.f76007b1 = (RobotoTextView) this.f75995P0.findViewById(AbstractC6918a0.link_title);
        this.f76008c1 = (RobotoTextView) this.f75995P0.findViewById(AbstractC6918a0.link_desc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                C8009j.a aVar = new C8009j.a(this.f72421L0.getContext());
                aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_delete_this_item)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.q50
                    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                    /* renamed from: K8 */
                    public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                        PinMessageDetailView.this.m82759tM(interfaceC17463d, i12);
                    }
                });
                return aVar.m43152a();
            }
        } else if (!this.f76014i1.isEmpty()) {
            final SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.getContext(), this.f76014i1, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.getContext());
            aVar2.m43155d(true);
            aVar2.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.p50
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    PinMessageDetailView.this.m82758sM(simpleAdapter, interfaceC17463d, i12);
                }
            });
            return aVar2.m43152a();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75995P0 = layoutInflater.inflate(AbstractC7409c0.pin_message_detail_view, viewGroup, false);
        this.f76010e1 = new C23528a(this.f72421L0.getContext());
        this.f76015j1.m106538e(new C14760a());
        m82765CM();
        return this.f75995P0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            m87077NK.setOnClickListenerTrailingButton(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.r50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PinMessageDetailView.this.m82760uM(view);
                }
            });
        }
        m82746AM();
        m82763zM();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        C23744a.m124114c().m124117e(this, 52);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PinMessageDetailView";
    }

    /* renamed from: oM */
    void m82766oM() {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.m50
            @Override // java.lang.Runnable
            public final void run() {
                PinMessageDetailView.this.m82757rM();
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C7904b c7904b;
        InviteContactProfile inviteContactProfile;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.group_board) {
            finish();
            Bundle bundle = new Bundle();
            bundle.putString("extra_group_id", this.f76011f1);
            this.f72421L0.m92662fJ().m93069k2(GroupBoardView.class, bundle, 1, true);
            return;
        }
        if ((id2 == AbstractC6918a0.iv_creator_avt || id2 == AbstractC6918a0.tv_creator_name) && (c7904b = this.f76013h1) != null && (inviteContactProfile = c7904b.f42719G) != null) {
            AbstractC23211s7.m119562B(inviteContactProfile.f42434r, this.f72421L0.m92662fJ(), this.f76011f1, C32002l4.m154265h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 13));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C23744a.m124114c().m124115b(this, 52);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (AbstractC23184q2.m119459q(this.f76011f1, i11, objArr)) {
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        C7904b c7904b;
        try {
            super.mo37135xJ(bundle);
            Bundle m92642L3 = this.f72421L0.m92642L3();
            if (m92642L3 != null) {
                String string = m92642L3.getString("extra_group_id");
                this.f76011f1 = string;
                if (!TextUtils.isEmpty(string)) {
                    m82746AM();
                }
                if (m92642L3.containsKey("extra_group_board_gen_id")) {
                    this.f76012g1 = m92642L3.getString("extra_group_board_gen_id");
                    C31988k5 m132062h = C25490c.m132054j().m132062h(this.f76012g1);
                    if (m132062h != null && (c7904b = m132062h.f147201b) != null) {
                        this.f76013h1 = c7904b;
                        this.f76016k1 = c7904b.f42715C;
                        m82766oM();
                    }
                    String string2 = m92642L3.getString("extra_topic_id");
                    this.f76016k1 = string2;
                    m82768yM(string2);
                } else {
                    String string3 = m92642L3.getString("extra_topic_id");
                    this.f76016k1 = string3;
                    m82768yM(string3);
                }
                int i11 = 0;
                boolean z11 = m92642L3.getBoolean("extra_shortcut_groupboard", false);
                View view = this.f76001V0;
                if (!z11) {
                    i11 = 8;
                }
                view.setVisibility(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: xM */
    void m82767xM(C31988k5 c31988k5) {
        if (c31988k5 == null) {
            return;
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14761b(c31988k5));
        c0766k.mo1602b5(this.f76011f1, c31988k5.f147200a, c31988k5.m154217a());
    }

    /* renamed from: yM */
    void m82768yM(String str) {
        if (this.f76017l1) {
            return;
        }
        m82764BM(true, 0);
        this.f76017l1 = true;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14762c());
        c0766k.mo1599aa(str);
    }
}
