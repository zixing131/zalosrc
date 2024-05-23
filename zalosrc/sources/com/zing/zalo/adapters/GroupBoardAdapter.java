package com.zing.zalo.adapters;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupBoardAdapter;
import com.zing.zalo.control.C7904b;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.group.poll.PollPreviewControl;
import com.zing.zalo.p077ui.widget.CustomTypefaceSpan;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import h70.AbstractC19907a;
import ib0.C20500d;
import ib0.C20503g;
import java.util.ArrayList;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23184q2;
import me0.AbstractC23244v8;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p459qs.C25490c;
import p471r3.C25630b;
import p588vw.C28644j;
import p588vw.C28652r;
import p716zh.C31884d6;
import p716zh.C31944h6;
import p716zh.C31961i8;
import p716zh.C31988k5;
import p716zh.C32003l5;
import vg.AbstractC28236y3;
import vg.C28020b3;

/* loaded from: classes3.dex */
public class GroupBoardAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    Context f37944r;

    /* renamed from: s */
    C23528a f37945s;

    /* renamed from: t */
    InterfaceC6930c f37946t;

    /* renamed from: u */
    String f37947u;

    /* renamed from: v */
    ArrayList f37948v = new ArrayList();

    /* renamed from: w */
    public boolean f37949w = false;

    /* renamed from: x */
    public int f37950x = 0;

    /* loaded from: classes3.dex */
    public class PinMessageModuleView extends ModulesView implements InterfaceC6928a {

        /* renamed from: K */
        C16716d f37951K;

        /* renamed from: L */
        C6932e f37952L;

        /* renamed from: M */
        C16716d f37953M;

        /* renamed from: N */
        C16719g f37954N;

        /* renamed from: O */
        C21693c f37955O;

        /* renamed from: P */
        C22126c0 f37956P;

        /* renamed from: Q */
        C22126c0 f37957Q;

        /* renamed from: R */
        Context f37958R;

        /* renamed from: S */
        C31988k5 f37959S;

        /* renamed from: T */
        Drawable f37960T;

        /* renamed from: U */
        C3977j f37961U;

        /* renamed from: V */
        int f37962V;

        /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$PinMessageModuleView$a */
        /* loaded from: classes3.dex */
        public class C6926a extends C28020b3.b {
            C6926a() {
            }

            @Override // vg.C28020b3.b
            /* renamed from: b */
            public void mo35607b(String str, C25630b c25630b, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                super.mo35607b(str, c25630b, interfaceC3968a, c3979l, c23995f);
                if (c3979l.m18839c() != null) {
                    PinMessageModuleView.this.f37955O.mo111925v1(new BitmapDrawable(AbstractC23136l9.m118698c0(), c3979l.m18839c()));
                }
            }
        }

        public PinMessageModuleView(Context context) {
            super(context);
            this.f37962V = AbstractC23136l9.m118742r(48.0f);
            this.f37958R = context;
            m88987U(-1, -2);
            C16716d c16716d = new C16716d(context);
            this.f37951K = c16716d;
            c16716d.m89106L().m89028L(-1, -2).m89034R(AbstractC23136l9.m118742r(8.0f)).m89035S(AbstractC23136l9.m118742r(8.0f)).m89036T(AbstractC23136l9.m118742r(8.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f));
            this.f37951K.m89087B0(AbstractC16803z.rounded_bubble_chat_background);
            C6932e c6932e = new C6932e(context);
            this.f37952L = c6932e;
            c6932e.m89106L().m89028L(-1, -2);
            C16716d c16716d2 = new C16716d(context);
            this.f37953M = c16716d2;
            c16716d2.m89106L().m89028L(-1, -2).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(16.0f)).m89036T(AbstractC23136l9.m118742r(12.0f)).m89023G(this.f37952L);
            C22126c0 c22126c0 = new C22126c0(context, AbstractC23136l9.m118742r(14.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor1), true);
            this.f37956P = c22126c0;
            C16718f m89028L = c22126c0.m89106L().m89028L(-1, -2);
            Boolean bool = Boolean.TRUE;
            m89028L.m89073z(bool).m89034R(AbstractC23136l9.m118742r(15.0f));
            C16716d c16716d3 = new C16716d(context);
            c16716d3.m89106L().m89028L(-1, -2).m89036T(AbstractC23136l9.m118742r(6.0f)).m89023G(this.f37956P);
            C21693c c21693c = new C21693c(context);
            this.f37955O = c21693c;
            C16718f m89106L = c21693c.m89106L();
            int i11 = this.f37962V;
            m89106L.m89028L(i11, i11).m89073z(bool).m89018B(bool).m89034R(AbstractC23136l9.m118742r(15.0f));
            this.f37955O.m111929z1(5);
            C22126c0 c22126c02 = new C22126c0(context, AbstractC23136l9.m118742r(16.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor1), false);
            this.f37957Q = c22126c02;
            c22126c02.m111980v1(TextUtils.TruncateAt.END);
            this.f37957Q.m89106L().m89073z(bool).m89027K(true).m89034R(AbstractC23136l9.m118742r(15.0f));
            c16716d3.m89001g1(this.f37955O);
            c16716d3.m89001g1(this.f37957Q);
            C16719g c16719g = new C16719g(context);
            this.f37954N = c16719g;
            c16719g.m89106L().m89028L(AbstractC23136l9.m118742r(3.0f), -1).m89073z(bool).m89020D(this.f37956P).m89036T(AbstractC23136l9.m118742r(2.0f)).m89033Q(AbstractC23136l9.m118742r(2.0f)).m89067t(c16716d3);
            this.f37954N.m89087B0(AbstractC16803z.chat_reply_line);
            this.f37953M.m89001g1(this.f37956P);
            this.f37953M.m89001g1(c16716d3);
            this.f37953M.m89001g1(this.f37954N);
            this.f37951K.m89001g1(this.f37952L);
            this.f37951K.m89001g1(this.f37953M);
            mo69681L(this.f37951K);
            this.f37961U = new C3977j(context);
            this.f37960T = C23278z2.m120122e().f116261b;
        }

        /* renamed from: W */
        public /* synthetic */ void m35604W(View view) {
            GroupBoardAdapter.this.f37946t.mo35617l3(this.f37959S);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00d3, code lost:            if (r10.f37955O.m89136d0() == 0) goto L92;     */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00d5, code lost:            r10.f37957Q.m89106L().m89034R(me0.AbstractC23136l9.m118742r(27.0f) + r10.f37962V);     */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0100, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00e6, code lost:            r10.f37957Q.m89106L().m89034R(me0.AbstractC23136l9.m118742r(15.0f));     */
        /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:            return;     */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00fd, code lost:            if (r10.f37955O.m89136d0() != 0) goto L93;     */
        /* renamed from: X */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        void m35605X(C7904b c7904b) {
            Drawable m142197h;
            try {
                try {
                    this.f37955O.m111929z1(5);
                    this.f37955O.mo44614b1(0);
                    int i11 = c7904b.f42746r;
                    if (i11 != 31) {
                        if (i11 != 32) {
                            if (i11 != 43) {
                                if (i11 != 44) {
                                    if (i11 != 46) {
                                        if (i11 != 49) {
                                            switch (i11) {
                                                case 36:
                                                    if (!TextUtils.isEmpty(c7904b.f42749u)) {
                                                        C25630b m143282P0 = C28644j.m143233Y().m143282P0(new C25630b(new JSONObject(c7904b.f42749u)));
                                                        if (m143282P0.m132448z()) {
                                                            this.f37955O.mo111924u1(C28020b3.f130648a.m141206w(m143282P0));
                                                            break;
                                                        } else {
                                                            C28020b3.f130648a.m141182F(this.f37961U, GroupBoardAdapter.this.f37945s, m143282P0, null, false, new C6926a());
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 37:
                                                case 38:
                                                    break;
                                                default:
                                                    this.f37955O.mo44614b1(8);
                                                    break;
                                            }
                                        }
                                    } else if (!TextUtils.isEmpty(c7904b.f42749u)) {
                                        C21693c c21693c = this.f37955O;
                                        if (c7904b.f42752x == 2) {
                                            m142197h = AbstractC23136l9.m118665N(this.f37958R, AbstractC16803z.icn_folder);
                                        } else {
                                            m142197h = AbstractC28236y3.m142197h(this.f37958R, c7904b.f42753y);
                                        }
                                        c21693c.mo111925v1(m142197h);
                                        this.f37955O.m111929z1(0);
                                    }
                                }
                            } else {
                                this.f37955O.mo111926w1(AbstractC16803z.icon_quote_location);
                            }
                        }
                        AbstractC23268y2.m120033g(GroupBoardAdapter.this.f37945s, this.f37961U, this.f37955O, c7904b.m40766d(), C23278z2.m120122e(), GroupBoardAdapter.this.f37949w);
                    } else {
                        this.f37955O.mo111926w1(AbstractC16803z.icon_quote_voice);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } catch (Throwable th2) {
                if (this.f37955O.m89136d0() == 0) {
                    this.f37957Q.m89106L().m89034R(AbstractC23136l9.m118742r(27.0f) + this.f37962V);
                } else {
                    this.f37957Q.m89106L().m89034R(AbstractC23136l9.m118742r(15.0f));
                }
                throw th2;
            }
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6928a
        /* renamed from: k */
        public void mo35606k(C32003l5 c32003l5, int i11, boolean z11) {
            C7904b c7904b;
            try {
                C31988k5 m35597M = GroupBoardAdapter.this.m35597M(i11);
                this.f37959S = m35597M;
                if (m35597M != null && (c7904b = m35597M.f147201b) != null) {
                    this.f37952L.m35627q1(m35597M, z11);
                    String m40767e = c7904b.m40767e();
                    if (TextUtils.isEmpty(m40767e)) {
                        m40767e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_pinned_message);
                    }
                    this.f37956P.m111959G1(m40767e);
                    String m40773k = c7904b.m40773k();
                    String m119761y = AbstractC23244v8.m119761y(m40773k);
                    if (!TextUtils.isEmpty(m119761y)) {
                        m40773k = m119761y;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C28652r.m143349v().m143357H(m40773k));
                    if (!TextUtils.isEmpty(m119761y)) {
                        String string = this.f37958R.getResources().getString(AbstractC8020f0.btn_see_more);
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) string);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C23212s8.m119607o(this.f37958R, AbstractC16781w.AppPrimaryColor)), length, spannableStringBuilder.length(), 33);
                    }
                    this.f37957Q.m111959G1(spannableStringBuilder);
                    m35605X(c7904b);
                    setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.b1
                        public /* synthetic */ ViewOnClickListenerC7013b1() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupBoardAdapter.PinMessageModuleView.this.m35604W(view);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class TopicModuleView extends ModulesView implements InterfaceC6928a {

        /* renamed from: K */
        C16716d f37965K;

        /* renamed from: L */
        C6932e f37966L;

        /* renamed from: M */
        C22126c0 f37967M;

        /* renamed from: N */
        C3977j f37968N;

        /* renamed from: O */
        C16716d f37969O;

        /* renamed from: P */
        C21693c f37970P;

        /* renamed from: Q */
        C22126c0 f37971Q;

        /* renamed from: R */
        C22126c0 f37972R;

        /* renamed from: S */
        Context f37973S;

        /* renamed from: T */
        C31988k5 f37974T;

        /* renamed from: U */
        C20503g f37975U;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$TopicModuleView$a */
        /* loaded from: classes3.dex */
        public class C6927a extends C20500d.a {

            /* renamed from: a */
            final /* synthetic */ GroupBoardAdapter f37977a;

            C6927a(GroupBoardAdapter groupBoardAdapter) {
                this.f37977a = groupBoardAdapter;
            }

            @Override // ib0.C20500d.a
            /* renamed from: c */
            public void mo35612c(String str) {
                GroupBoardAdapter.this.f37946t.mo35620o3(str);
            }

            @Override // ib0.C20500d.a
            /* renamed from: d */
            public void mo35613d() {
                TopicModuleView topicModuleView = TopicModuleView.this;
                GroupBoardAdapter.this.f37946t.mo35617l3(topicModuleView.f37974T);
            }
        }

        public TopicModuleView(Context context) {
            super(context);
            this.f37973S = context;
            m88987U(-1, -2);
            C16716d c16716d = new C16716d(context);
            this.f37965K = c16716d;
            c16716d.m89106L().m89028L(-1, -2).m89034R(AbstractC23136l9.m118742r(8.0f)).m89035S(AbstractC23136l9.m118742r(8.0f)).m89036T(AbstractC23136l9.m118742r(8.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f));
            this.f37965K.m89087B0(AbstractC16803z.rounded_bubble_chat_background);
            new C16716d(context).m89106L().m89028L(-1, -2);
            C6932e c6932e = new C6932e(context);
            this.f37966L = c6932e;
            c6932e.m89106L().m89028L(-1, -2);
            C22126c0 c22126c0 = new C22126c0(context, AbstractC23136l9.m118742r(16.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor1), false);
            this.f37967M = c22126c0;
            c22126c0.m111980v1(TextUtils.TruncateAt.END);
            C16718f m89035S = this.f37967M.m89106L().m89028L(-1, -2).m89036T(AbstractC23136l9.m118742r(11.0f)).m89035S(AbstractC23136l9.m118742r(16.0f));
            Boolean bool = Boolean.TRUE;
            m89035S.m89073z(bool).m89023G(this.f37966L);
            C20503g c20503g = new C20503g(true);
            this.f37975U = c20503g;
            c20503g.m106543g(new C6927a(GroupBoardAdapter.this));
            this.f37967M.m111955C1(this.f37975U);
            this.f37968N = new C3977j(context);
            C16716d c16716d2 = new C16716d(context);
            this.f37969O = c16716d2;
            c16716d2.m89087B0(AbstractC16803z.bg_topic_link_attachment);
            this.f37969O.m89106L().m89028L(-1, -2).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(16.0f)).m89041Y(AbstractC23136l9.m118742r(10.0f)).m89023G(this.f37967M).m89036T(AbstractC23136l9.m118742r(16.0f));
            C21693c c21693c = new C21693c(context);
            this.f37970P = c21693c;
            c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f)).m89073z(bool).m89027K(true);
            C16716d c16716d3 = new C16716d(context);
            c16716d3.m89106L().m89028L(-1, -2).m89027K(true).m89034R(AbstractC23136l9.m118742r(8.0f)).m89054h0(this.f37970P);
            C22126c0 c22126c02 = new C22126c0(context, AbstractC23136l9.m118742r(14.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor1), true);
            this.f37971Q = c22126c02;
            c22126c02.m89106L().m89028L(-1, -2);
            this.f37971Q.m111953A1(2);
            C22126c0 c22126c03 = new C22126c0(context, AbstractC23136l9.m118742r(13.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor2), false);
            this.f37972R = c22126c03;
            c22126c03.m111953A1(1);
            this.f37972R.m89106L().m89028L(-1, -2).m89036T(AbstractC23136l9.m118742r(1.0f)).m89023G(this.f37971Q);
            c16716d3.m89001g1(this.f37971Q);
            c16716d3.m89001g1(this.f37972R);
            this.f37969O.m89001g1(this.f37970P);
            this.f37969O.m89001g1(c16716d3);
            this.f37965K.m89001g1(this.f37966L);
            this.f37965K.m89001g1(this.f37967M);
            this.f37965K.m89001g1(this.f37969O);
            mo69681L(this.f37965K);
        }

        /* renamed from: X */
        public /* synthetic */ void m35610X(C7904b c7904b, C16719g c16719g) {
            GroupBoardAdapter.this.f37946t.mo35616k3(c7904b.f42738j);
        }

        /* renamed from: Y */
        public /* synthetic */ void m35611Y(View view) {
            GroupBoardAdapter.this.f37946t.mo35617l3(this.f37974T);
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6928a
        /* renamed from: k */
        public void mo35606k(C32003l5 c32003l5, int i11, boolean z11) {
            C7904b c7904b;
            try {
                C31988k5 m35597M = GroupBoardAdapter.this.m35597M(i11);
                this.f37974T = m35597M;
                if (m35597M != null && (c7904b = m35597M.f147201b) != null) {
                    this.f37966L.m35627q1(m35597M, z11);
                    String m40771i = c7904b.m40771i();
                    String m40770h = c7904b.m40770h();
                    if (!TextUtils.isEmpty(m40771i)) {
                        m40770h = m40771i;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C28652r.m143349v().m143357H(m40770h));
                    if (C31944h6.m153544j(spannableStringBuilder)) {
                        try {
                            C31944h6.m153538d(spannableStringBuilder, 7, C31884d6.m153209a());
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                    }
                    if (!TextUtils.isEmpty(m40771i)) {
                        String string = this.f37973S.getResources().getString(AbstractC8020f0.btn_see_more);
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) string);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(C23212s8.m119607o(this.f37973S, AbstractC16781w.AppPrimaryColor)), length, spannableStringBuilder.length(), 33);
                    }
                    this.f37967M.m111953A1(Integer.MAX_VALUE);
                    this.f37967M.mo111965M1(0);
                    this.f37967M.m111959G1(spannableStringBuilder);
                    this.f37967M.m89106L().m89034R(AbstractC23136l9.m118742r(16.0f));
                    if (c7904b.f42729a == 1) {
                        this.f37969O.mo44614b1(0);
                        AbstractC23268y2.m120033g(GroupBoardAdapter.this.f37945s, this.f37968N, this.f37970P, c7904b.m40766d(), C23278z2.m120083M0(), z11);
                        this.f37971Q.m111959G1(c7904b.m40768f());
                        this.f37972R.m111959G1(c7904b.f42739k);
                    } else {
                        this.f37969O.mo44614b1(8);
                    }
                    this.f37969O.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.e1

                        /* renamed from: q */
                        public final /* synthetic */ C7904b f38537q;

                        public /* synthetic */ C7048e1(C7904b c7904b2) {
                            r2 = c7904b2;
                        }

                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            GroupBoardAdapter.TopicModuleView.this.m35610X(r2, c16719g);
                        }
                    });
                    setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.f1
                        public /* synthetic */ ViewOnClickListenerC7059f1() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupBoardAdapter.TopicModuleView.this.m35611Y(view);
                        }
                    });
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$a */
    /* loaded from: classes3.dex */
    private interface InterfaceC6928a {
        /* renamed from: k */
        void mo35606k(C32003l5 c32003l5, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$b */
    /* loaded from: classes3.dex */
    public static class C6929b extends C6933f {

        /* renamed from: I */
        ModulesView f37979I;

        public C6929b(ModulesView modulesView) {
            super(modulesView);
            this.f37979I = modulesView;
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.C6933f, com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6928a
        /* renamed from: k */
        public void mo35606k(C32003l5 c32003l5, int i11, boolean z11) {
            try {
                super.mo35606k(c32003l5, i11, z11);
                ViewParent viewParent = this.f37979I;
                if (viewParent instanceof InterfaceC6928a) {
                    ((InterfaceC6928a) viewParent).mo35606k(c32003l5, i11, z11);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC6930c {
        /* renamed from: i3 */
        void mo35614i3();

        /* renamed from: j3 */
        void mo35615j3(int i11);

        /* renamed from: k3 */
        void mo35616k3(String str);

        /* renamed from: l3 */
        void mo35617l3(C31988k5 c31988k5);

        /* renamed from: m3 */
        void mo35618m3();

        /* renamed from: n3 */
        void mo35619n3(C31988k5 c31988k5);

        /* renamed from: o3 */
        void mo35620o3(String str);

        /* renamed from: p3 */
        void mo35621p3(String str, boolean z11);

        /* renamed from: v1 */
        void mo35622v1(String str);
    }

    /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$d */
    /* loaded from: classes3.dex */
    public static class C6931d extends C6933f {

        /* renamed from: I */
        LinearLayout f37980I;

        /* renamed from: J */
        LinearLayout f37981J;

        public C6931d(View view) {
            super(view);
            this.f37980I = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterError);
            this.f37981J = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$e */
    /* loaded from: classes3.dex */
    public class C6932e extends C16716d {

        /* renamed from: M0 */
        C16716d f37982M0;

        /* renamed from: N0 */
        C21693c f37983N0;

        /* renamed from: O0 */
        C22126c0 f37984O0;

        /* renamed from: P0 */
        C22126c0 f37985P0;

        /* renamed from: Q0 */
        C21693c f37986Q0;

        /* renamed from: R0 */
        C3977j f37987R0;

        public C6932e(Context context) {
            super(context);
            this.f37987R0 = new C3977j(context);
            C16716d c16716d = new C16716d(context);
            this.f37982M0 = c16716d;
            c16716d.m89106L().m89028L(-1, -2);
            C21693c c21693c = new C21693c(context);
            this.f37983N0 = c21693c;
            C16718f m89036T = c21693c.m89106L().m89028L(AbstractC23136l9.m118742r(36.0f), AbstractC23136l9.m118742r(36.0f)).m89034R(AbstractC23136l9.m118742r(16.0f)).m89035S(AbstractC23136l9.m118742r(8.0f)).m89036T(AbstractC23136l9.m118742r(12.0f));
            Boolean bool = Boolean.TRUE;
            m89036T.m89073z(bool);
            C21693c c21693c2 = new C21693c(context);
            this.f37986Q0 = c21693c2;
            c21693c2.mo111926w1(AbstractC16803z.icon_groupboard_menu);
            this.f37986Q0.m89106L().m89041Y(AbstractC23136l9.m118742r(16.0f)).m89017A(bool);
            this.f37986Q0.m89087B0(AbstractC16803z.item_background_ripple);
            C16716d c16716d2 = new C16716d(context);
            c16716d2.m89106L().m89028L(-1, -2).m89025I(true).m89036T(AbstractC23136l9.m118742r(12.0f)).m89054h0(this.f37983N0).m89049e0(this.f37986Q0);
            C22126c0 c22126c0 = new C22126c0(context, AbstractC23136l9.m118742r(14.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor1), false);
            this.f37984O0 = c22126c0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            this.f37984O0.m89106L().m89028L(-1, -2);
            C22126c0 c22126c02 = new C22126c0(context, AbstractC23136l9.m118742r(13.0f), C23212s8.m119607o(context, AbstractC21196a.TextColor2), false);
            this.f37985P0 = c22126c02;
            c22126c02.m111953A1(1);
            this.f37985P0.m111980v1(truncateAt);
            this.f37985P0.m89106L().m89028L(-1, -2).m89023G(this.f37984O0);
            c16716d2.m89001g1(this.f37984O0);
            c16716d2.m89001g1(this.f37985P0);
            this.f37982M0.m89001g1(this.f37983N0);
            this.f37982M0.m89001g1(this.f37986Q0);
            this.f37982M0.m89001g1(c16716d2);
            m89001g1(this.f37982M0);
        }

        /* renamed from: r1 */
        public /* synthetic */ void m35625r1(C7904b c7904b, C16719g c16719g) {
            InviteContactProfile inviteContactProfile = c7904b.f42719G;
            if (inviteContactProfile != null) {
                GroupBoardAdapter.this.f37946t.mo35622v1(inviteContactProfile.f42434r);
            }
        }

        /* renamed from: s1 */
        public /* synthetic */ void m35626s1(C31988k5 c31988k5, C16719g c16719g) {
            GroupBoardAdapter.this.f37946t.mo35619n3(c31988k5);
        }

        /* renamed from: q1 */
        public void m35627q1(C31988k5 c31988k5, boolean z11) {
            C7904b c7904b;
            String str;
            String format;
            if (c31988k5 != null && (c7904b = c31988k5.f147201b) != null) {
                AbstractC23268y2.m120029c(GroupBoardAdapter.this.f37945s, this.f37987R0, this.f37983N0, c7904b.f42719G, C23278z2.m120143n(), z11);
                InviteContactProfile inviteContactProfile = c7904b.f42719G;
                if (inviteContactProfile == null) {
                    str = "";
                } else {
                    str = inviteContactProfile.m40485u1();
                }
                String m119442G = AbstractC23184q2.m119442G(str, 32);
                if (c7904b.f42729a != 2) {
                    if (c7904b.f42732d > 0) {
                        format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_so_created_a_time_reminder), m119442G);
                    } else {
                        format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_so_created_a_note), m119442G);
                    }
                } else {
                    format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_so_pinned_a_message), m119442G);
                }
                SpannableString spannableString = new SpannableString(format);
                spannableString.setSpan(new CustomTypefaceSpan("", AbstractC23136l9.m118642B0(true)), 0, m119442G.length(), 0);
                this.f37984O0.m111959G1(spannableString);
                this.f37985P0.m111959G1(AbstractC23160o0.m119181A(c7904b.f42717E));
                C7025c1 c7025c1 = new C16719g.c() { // from class: com.zing.zalo.adapters.c1

                    /* renamed from: q */
                    public final /* synthetic */ C7904b f38396q;

                    public /* synthetic */ C7025c1(C7904b c7904b2) {
                        r2 = c7904b2;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        GroupBoardAdapter.C6932e.this.m35625r1(r2, c16719g);
                    }
                };
                this.f37983N0.mo89109M0(c7025c1);
                this.f37984O0.mo89109M0(c7025c1);
                this.f37986Q0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.d1

                    /* renamed from: q */
                    public final /* synthetic */ C31988k5 f38471q;

                    public /* synthetic */ C7037d1(C31988k5 c31988k52) {
                        r2 = c31988k52;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        GroupBoardAdapter.C6932e.this.m35626s1(r2, c16719g);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$f */
    /* loaded from: classes3.dex */
    public static class C6933f extends RecyclerView.AbstractC1876c0 implements InterfaceC6928a {
        public C6933f(View view) {
            super(view);
        }

        /* renamed from: k */
        public void mo35606k(C32003l5 c32003l5, int i11, boolean z11) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$g */
    /* loaded from: classes3.dex */
    public class ViewOnClickListenerC6934g extends C6933f implements View.OnClickListener {

        /* renamed from: I */
        TextView f37989I;

        /* renamed from: J */
        TextView f37990J;

        /* renamed from: K */
        ImageView f37991K;

        /* renamed from: L */
        int f37992L;

        public ViewOnClickListenerC6934g(View view) {
            super(view);
            this.f37989I = (TextView) view.findViewById(AbstractC6918a0.tv_title);
            this.f37990J = (TextView) view.findViewById(AbstractC6918a0.btn_action);
            this.f37991K = (ImageView) view.findViewById(AbstractC6918a0.icon);
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.C6933f, com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6928a
        /* renamed from: k */
        public void mo35606k(C32003l5 c32003l5, int i11, boolean z11) {
            this.f37992L = 0;
            if (c32003l5 == null) {
                return;
            }
            this.f37992L = c32003l5.f147254d;
            this.f37989I.setText(c32003l5.f147252b);
            if (TextUtils.isEmpty(c32003l5.f147253c)) {
                this.f37990J.setVisibility(8);
            } else {
                this.f37990J.setVisibility(0);
                this.f37990J.setText(c32003l5.f147253c);
                this.f37990J.setOnClickListener(this);
            }
            this.f37991K.setImageResource(c32003l5.f147255e);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == AbstractC6918a0.btn_action) {
                int i11 = this.f37992L;
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            AbstractC23647d.m123897g("1001655");
                        }
                    } else {
                        AbstractC23647d.m123897g("1001656");
                    }
                } else {
                    AbstractC23647d.m123897g("1001657");
                }
                InterfaceC6930c interfaceC6930c = GroupBoardAdapter.this.f37946t;
                if (interfaceC6930c != null) {
                    interfaceC6930c.mo35615j3(this.f37992L);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$h */
    /* loaded from: classes3.dex */
    public class C6935h extends C6933f {

        /* renamed from: I */
        PollPreviewControl f37994I;

        /* renamed from: J */
        C31988k5 f37995J;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$h$a */
        /* loaded from: classes3.dex */
        public class a extends AbstractC19907a {

            /* renamed from: a */
            final /* synthetic */ GroupBoardAdapter f37997a;

            a(GroupBoardAdapter groupBoardAdapter) {
                this.f37997a = groupBoardAdapter;
            }

            @Override // h70.AbstractC19907a
            /* renamed from: a */
            public void mo35628a() {
                C31988k5 c31988k5;
                C31961i8 c31961i8;
                C6935h c6935h = C6935h.this;
                InterfaceC6930c interfaceC6930c = GroupBoardAdapter.this.f37946t;
                if (interfaceC6930c != null && (c31988k5 = c6935h.f37995J) != null && (c31961i8 = c31988k5.f147202c) != null) {
                    interfaceC6930c.mo35622v1(c31961i8.f146884e);
                }
            }

            @Override // h70.AbstractC19907a
            /* renamed from: b */
            public void mo35629b() {
                C6935h c6935h = C6935h.this;
                InterfaceC6930c interfaceC6930c = GroupBoardAdapter.this.f37946t;
                if (interfaceC6930c != null) {
                    interfaceC6930c.mo35619n3(c6935h.f37995J);
                }
            }

            @Override // h70.AbstractC19907a
            /* renamed from: c */
            public void mo35630c(boolean z11) {
                C6935h c6935h = C6935h.this;
                if (GroupBoardAdapter.this.f37946t != null && c6935h.f37995J.f147202c != null) {
                    AbstractC23647d.m123897g("10010007");
                    C6935h c6935h2 = C6935h.this;
                    GroupBoardAdapter.this.f37946t.mo35621p3(c6935h2.f37995J.f147202c.f146880a, z11);
                }
            }
        }

        public C6935h(View view) {
            super(view);
            PollPreviewControl pollPreviewControl = (PollPreviewControl) view.findViewById(AbstractC6918a0.poll_preview_control);
            this.f37994I = pollPreviewControl;
            pollPreviewControl.setChatPollViewListener(new a(GroupBoardAdapter.this));
        }

        @Override // com.zing.zalo.adapters.GroupBoardAdapter.C6933f, com.zing.zalo.adapters.GroupBoardAdapter.InterfaceC6928a
        /* renamed from: k */
        public void mo35606k(C32003l5 c32003l5, int i11, boolean z11) {
            C31961i8 c31961i8;
            C31988k5 m35597M = GroupBoardAdapter.this.m35597M(i11);
            this.f37995J = m35597M;
            if (m35597M != null && (c31961i8 = m35597M.f147202c) != null) {
                this.f37994I.m66614b(c31961i8, true, z11);
                this.f37994I.invalidate();
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupBoardAdapter$i */
    /* loaded from: classes3.dex */
    public class ViewOnClickListenerC6936i extends C6933f implements View.OnClickListener {

        /* renamed from: I */
        View f37999I;

        /* renamed from: J */
        View f38000J;

        /* renamed from: K */
        View f38001K;

        /* renamed from: L */
        View f38002L;

        public ViewOnClickListenerC6936i(View view) {
            super(view);
            View findViewById = view.findViewById(AbstractC6918a0.item_create_notice);
            this.f37999I = findViewById;
            findViewById.setOnClickListener(this);
            View findViewById2 = view.findViewById(AbstractC6918a0.item_create_poll);
            this.f38000J = findViewById2;
            findViewById2.setOnClickListener(this);
            View findViewById3 = view.findViewById(AbstractC6918a0.item_create_reminder);
            this.f38001K = findViewById3;
            findViewById3.setOnClickListener(this);
            View findViewById4 = view.findViewById(AbstractC6918a0.btn_more);
            this.f38002L = findViewById4;
            findViewById4.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC6930c interfaceC6930c;
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.item_create_notice) {
                AbstractC23647d.m123897g("1001658");
                InterfaceC6930c interfaceC6930c2 = GroupBoardAdapter.this.f37946t;
                if (interfaceC6930c2 != null) {
                    interfaceC6930c2.mo35615j3(1);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.item_create_poll) {
                AbstractC23647d.m123897g("1001658");
                InterfaceC6930c interfaceC6930c3 = GroupBoardAdapter.this.f37946t;
                if (interfaceC6930c3 != null) {
                    interfaceC6930c3.mo35615j3(2);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.item_create_reminder) {
                AbstractC23647d.m123897g("1001658");
                InterfaceC6930c interfaceC6930c4 = GroupBoardAdapter.this.f37946t;
                if (interfaceC6930c4 != null) {
                    interfaceC6930c4.mo35615j3(3);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.btn_more && (interfaceC6930c = GroupBoardAdapter.this.f37946t) != null) {
                interfaceC6930c.mo35618m3();
            }
        }
    }

    public GroupBoardAdapter(Context context, String str, InterfaceC6930c interfaceC6930c) {
        this.f37944r = context;
        this.f37945s = new C23528a(context);
        this.f37947u = str;
        this.f37946t = interfaceC6930c;
    }

    /* renamed from: O */
    public /* synthetic */ void m35596O(View view) {
        InterfaceC6930c interfaceC6930c = this.f37946t;
        if (interfaceC6930c != null) {
            interfaceC6930c.mo35614i3();
        }
    }

    /* renamed from: M */
    public C31988k5 m35597M(int i11) {
        if (i11 >= 0 && i11 < this.f37948v.size()) {
            return C25490c.m132054j().m132062h(m35598N(i11).f147251a);
        }
        return null;
    }

    /* renamed from: N */
    public C32003l5 m35598N(int i11) {
        if (i11 >= 0 && i11 < this.f37948v.size()) {
            return (C32003l5) this.f37948v.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P */
    public void mo9990A(C6933f c6933f, int i11) {
        try {
            if (c6933f.m9931C() == 105) {
                int i12 = this.f37950x;
                if (i12 == 1) {
                    ((C6931d) c6933f).f37980I.setVisibility(8);
                    ((C6931d) c6933f).f37981J.setVisibility(0);
                } else if (i12 == 2) {
                    ((C6931d) c6933f).f37981J.setVisibility(8);
                    ((C6931d) c6933f).f37980I.setVisibility(0);
                    ((C6931d) c6933f).f37980I.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a1
                        public /* synthetic */ ViewOnClickListenerC7001a1() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupBoardAdapter.this.m35596O(view);
                        }
                    });
                }
            }
            c6933f.mo35606k(m35598N(i11), i11, this.f37949w);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q */
    public C6933f mo9992C(ViewGroup viewGroup, int i11) {
        Context context = viewGroup.getContext();
        if (i11 != 101) {
            switch (i11) {
                case 104:
                    return new ViewOnClickListenerC6934g(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.group_board_hint_row, viewGroup, false));
                case 105:
                    return new C6931d(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.group_rada_footer, viewGroup, false));
                case 106:
                    return new C6929b(new TopicModuleView(context));
                case 107:
                    return new C6929b(new PinMessageModuleView(context));
                case 108:
                    return new C6935h(LayoutInflater.from(context).inflate(AbstractC7409c0.group_poll_preview_poll_item, viewGroup, false));
                default:
                    return new C6929b(new ModulesView(context));
            }
        }
        return new ViewOnClickListenerC6936i(LayoutInflater.from(context).inflate(AbstractC7409c0.group_board_suggest_row, viewGroup, false));
    }

    /* renamed from: R */
    public void m35601R(String str) {
        this.f37947u = str;
    }

    /* renamed from: S */
    public void m35602S(ArrayList arrayList) {
        this.f37948v = new ArrayList(arrayList);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f37948v.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return m35598N(i11).f147256f;
    }
}
