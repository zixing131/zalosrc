package com.zing.zalo.feed.formpostfeed.p063ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.feed.formpostfeed.data.Decorations;
import com.zing.zalo.feed.formpostfeed.data.Display;
import com.zing.zalo.feed.formpostfeed.data.Element;
import com.zing.zalo.feed.formpostfeed.data.Size;
import com.zing.zalo.feed.formpostfeed.data.TimelineFpfEntrySetting;
import com.zing.zalo.feed.formpostfeed.p063ui.C8459a;
import com.zing.zalo.feed.formpostfeed.p063ui.C8461c;
import com.zing.zalo.feed.formpostfeed.p063ui.TimelineFpfEntry;
import com.zing.zalo.feed.uicontrols.LottieWithImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p348mi.AbstractC23304d;
import p455qo.C25429q;
import p649xl.C30089vd;
import p651xn.C30169a;

/* loaded from: classes4.dex */
public final class TimelineFpfEntry extends RelativeLayout {

    /* renamed from: p */
    private boolean f45922p;

    /* renamed from: q */
    private final C8461c f45923q;

    /* renamed from: r */
    private InterfaceC8456a f45924r;

    /* renamed from: s */
    private C30089vd f45925s;

    /* renamed from: t */
    private int f45926t;

    /* renamed from: u */
    private final C8458c f45927u;

    /* renamed from: com.zing.zalo.feed.formpostfeed.ui.TimelineFpfEntry$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8456a {
        /* renamed from: t0 */
        void mo45031t0();

        /* renamed from: u0 */
        void mo45032u0(int i11, String str);

        /* renamed from: v0 */
        void mo45033v0(String str);

        /* renamed from: w0 */
        void mo45034w0();
    }

    /* renamed from: com.zing.zalo.feed.formpostfeed.ui.TimelineFpfEntry$b */
    /* loaded from: classes4.dex */
    public static final class C8457b implements C8459a.b {
        C8457b() {
        }

        @Override // com.zing.zalo.feed.formpostfeed.p063ui.C8459a.b
        /* renamed from: a */
        public void mo45035a(int i11, String str) {
            AbstractC19074t.m100208f(str, "sourceTracking");
            InterfaceC8456a listener = TimelineFpfEntry.this.getListener();
            if (listener != null) {
                listener.mo45032u0(i11, str);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.formpostfeed.ui.TimelineFpfEntry$c */
    /* loaded from: classes4.dex */
    public static final class C8458c implements C8461c.a {
        C8458c() {
        }

        /* renamed from: c */
        public static final void m45037c(TimelineFpfEntry timelineFpfEntry) {
            String str;
            AbstractC19074t.m100208f(timelineFpfEntry, "this$0");
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            C30089vd c30089vd = null;
            if (contactProfile != null) {
                str = contactProfile.f42446v;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str2 = str;
            if (str2.length() > 0) {
                C30089vd c30089vd2 = timelineFpfEntry.f45925s;
                if (c30089vd2 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30089vd2 = null;
                }
                c30089vd2.f139710q.setImageMode(LottieWithImageView.EnumC8868a.f47378q);
                C8461c c8461c = timelineFpfEntry.f45923q;
                C30089vd c30089vd3 = timelineFpfEntry.f45925s;
                if (c30089vd3 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30089vd = c30089vd3;
                }
                C8461c.m45071k(c8461c, c30089vd.f139710q.getNormalView(), str2, C23278z2.m120143n(), 0, null, 24, null);
            }
        }

        @Override // com.zing.zalo.feed.formpostfeed.p063ui.C8461c.a
        /* renamed from: b */
        public void mo45038b() {
            AbstractC19444a.m101695c(new Runnable() { // from class: yn.k
                public /* synthetic */ RunnableC31033k() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    TimelineFpfEntry.C8458c.m45037c(TimelineFpfEntry.this);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFpfEntry(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f45923q = new C8461c(context2);
        this.f45927u = new C8458c();
        m45015h(context);
    }

    /* renamed from: h */
    private final void m45015h(Context context) {
        C30089vd m148629c = C30089vd.m148629c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148629c, "inflate(...)");
        this.f45925s = m148629c;
        if (m148629c == null) {
            AbstractC19074t.m100223u("binding");
            m148629c = null;
        }
        m148629c.getRoot().setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
        m45016i();
    }

    /* renamed from: i */
    private final void m45016i() {
        C30089vd c30089vd = this.f45925s;
        C30089vd c30089vd2 = null;
        if (c30089vd == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd = null;
        }
        c30089vd.f139710q.setOnClickListener(new View.OnClickListener() { // from class: yn.h
            public /* synthetic */ ViewOnClickListenerC31030h() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimelineFpfEntry.m45017j(TimelineFpfEntry.this, view);
            }
        });
        C30089vd c30089vd3 = this.f45925s;
        if (c30089vd3 == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd3 = null;
        }
        c30089vd3.f139716w.setOnClickListener(new View.OnClickListener() { // from class: yn.i
            public /* synthetic */ ViewOnClickListenerC31031i() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TimelineFpfEntry.m45018k(TimelineFpfEntry.this, view);
            }
        });
        C30089vd c30089vd4 = this.f45925s;
        if (c30089vd4 == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd4 = null;
        }
        c30089vd4.f139717x.setOnPromoteItemClickListener(new C8457b());
        if (AbstractC19074t.m100204b(new C25429q().m101506a(), Boolean.TRUE)) {
            C30089vd c30089vd5 = this.f45925s;
            if (c30089vd5 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30089vd2 = c30089vd5;
            }
            c30089vd2.f139716w.setOnLongClickListener(new View.OnLongClickListener() { // from class: yn.j
                public /* synthetic */ ViewOnLongClickListenerC31032j() {
                }

                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m45019l;
                    m45019l = TimelineFpfEntry.m45019l(TimelineFpfEntry.this, view);
                    return m45019l;
                }
            });
        }
    }

    /* renamed from: j */
    public static final void m45017j(TimelineFpfEntry timelineFpfEntry, View view) {
        AbstractC19074t.m100208f(timelineFpfEntry, "this$0");
        InterfaceC8456a interfaceC8456a = timelineFpfEntry.f45924r;
        if (interfaceC8456a != null) {
            interfaceC8456a.mo45031t0();
        }
    }

    /* renamed from: k */
    public static final void m45018k(TimelineFpfEntry timelineFpfEntry, View view) {
        AbstractC19074t.m100208f(timelineFpfEntry, "this$0");
        InterfaceC8456a interfaceC8456a = timelineFpfEntry.f45924r;
        if (interfaceC8456a != null) {
            interfaceC8456a.mo45034w0();
        }
    }

    /* renamed from: l */
    public static final boolean m45019l(TimelineFpfEntry timelineFpfEntry, View view) {
        AbstractC19074t.m100208f(timelineFpfEntry, "this$0");
        String jsonString = C30169a.f140177a.m148801a().m44994b().toJsonString();
        InterfaceC8456a interfaceC8456a = timelineFpfEntry.f45924r;
        if (interfaceC8456a != null) {
            interfaceC8456a.mo45033v0(jsonString);
            return true;
        }
        return true;
    }

    /* renamed from: m */
    private final void m45020m() {
        if (this.f45926t == 0) {
            C30089vd c30089vd = this.f45925s;
            C30089vd c30089vd2 = null;
            if (c30089vd == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd = null;
            }
            c30089vd.f139715v.setVisibility(8);
            C30089vd c30089vd3 = this.f45925s;
            if (c30089vd3 == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd3 = null;
            }
            c30089vd3.f139718y.setVisibility(8);
            C30089vd c30089vd4 = this.f45925s;
            if (c30089vd4 == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd4 = null;
            }
            c30089vd4.getRoot().measure(0, 0);
            C30089vd c30089vd5 = this.f45925s;
            if (c30089vd5 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30089vd2 = c30089vd5;
            }
            this.f45926t = c30089vd2.getRoot().getMeasuredHeight();
        }
    }

    /* renamed from: n */
    private final void m45021n() {
        try {
            TimelineFpfEntrySetting m44994b = C30169a.f140177a.m148801a().m44994b();
            if (m44994b.isShow()) {
                m45026u(m44994b);
                m45022p(m44994b.getAvatar());
                m45025s(m44994b.getDecorations(), m44994b.getBackground().getSize());
                m45023q(m44994b.getBackground());
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: p */
    private final void m45022p(Display display) {
        C30089vd c30089vd = null;
        if (display.isUsable()) {
            int type = display.getType();
            if (type != 0 && type != 1) {
                if (type != 2) {
                    if (type == 3) {
                        C30089vd c30089vd2 = this.f45925s;
                        if (c30089vd2 == null) {
                            AbstractC19074t.m100223u("binding");
                            c30089vd2 = null;
                        }
                        c30089vd2.f139710q.setImageMode(LottieWithImageView.EnumC8868a.f47377p);
                        C8461c c8461c = this.f45923q;
                        C30089vd c30089vd3 = this.f45925s;
                        if (c30089vd3 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c30089vd = c30089vd3;
                        }
                        c8461c.m45075l(c30089vd.f139710q.getLottieView(), display.getLottie(), 0, this.f45927u);
                        return;
                    }
                    return;
                }
                C30089vd c30089vd4 = this.f45925s;
                if (c30089vd4 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30089vd4 = null;
                }
                c30089vd4.f139710q.setImageMode(LottieWithImageView.EnumC8868a.f47378q);
                C8461c c8461c2 = this.f45923q;
                C30089vd c30089vd5 = this.f45925s;
                if (c30089vd5 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30089vd = c30089vd5;
                }
                c8461c2.m45074j(c30089vd.f139710q.getNormalView(), display.getImgUrl().getValue(), C23278z2.m120143n(), 0, this.f45927u);
                return;
            }
            this.f45927u.mo45038b();
            return;
        }
        if (AbstractC23304d.f113368c0 != null) {
            C30089vd c30089vd6 = this.f45925s;
            if (c30089vd6 == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd6 = null;
            }
            c30089vd6.f139710q.setImageMode(LottieWithImageView.EnumC8868a.f47378q);
            C8461c c8461c3 = this.f45923q;
            C30089vd c30089vd7 = this.f45925s;
            if (c30089vd7 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30089vd = c30089vd7;
            }
            RecyclingImageView normalView = c30089vd.f139710q.getNormalView();
            String str = AbstractC23304d.f113368c0.f42446v;
            AbstractC19074t.m100207e(str, "avt");
            C8461c.m45071k(c8461c3, normalView, str, C23278z2.m120143n(), 0, null, 24, null);
        }
    }

    /* renamed from: q */
    private final void m45023q(Element element) {
        C30089vd c30089vd = null;
        if (element.getDisplay().isUsable()) {
            int type = element.getDisplay().getType();
            if (type != 0) {
                if (type != 1) {
                    if (type != 2) {
                        if (type == 3) {
                            C30089vd c30089vd2 = this.f45925s;
                            if (c30089vd2 == null) {
                                AbstractC19074t.m100223u("binding");
                            } else {
                                c30089vd = c30089vd2;
                            }
                            c30089vd.getRoot().setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
                            return;
                        }
                        return;
                    }
                    C30089vd c30089vd3 = this.f45925s;
                    if (c30089vd3 == null) {
                        AbstractC19074t.m100223u("binding");
                        c30089vd3 = null;
                    }
                    c30089vd3.getRoot().setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
                    C30089vd c30089vd4 = this.f45925s;
                    if (c30089vd4 == null) {
                        AbstractC19074t.m100223u("binding");
                        c30089vd4 = null;
                    }
                    c30089vd4.f139711r.setVisibility(0);
                    C8461c c8461c = this.f45923q;
                    C30089vd c30089vd5 = this.f45925s;
                    if (c30089vd5 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c30089vd = c30089vd5;
                    }
                    RecyclingImageView recyclingImageView = c30089vd.f139711r;
                    AbstractC19074t.m100207e(recyclingImageView, "backgroundImage");
                    C8461c.m45071k(c8461c, recyclingImageView, element.getDisplay().getImgUrl().getValue(), C23278z2.m120121d1(), 0, null, 24, null);
                    return;
                }
                C30089vd c30089vd6 = this.f45925s;
                if (c30089vd6 == null) {
                    AbstractC19074t.m100223u("binding");
                    c30089vd6 = null;
                }
                c30089vd6.f139711r.setVisibility(8);
                C8461c c8461c2 = this.f45923q;
                C30089vd c30089vd7 = this.f45925s;
                if (c30089vd7 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30089vd = c30089vd7;
                }
                RelativeLayout root = c30089vd.getRoot();
                AbstractC19074t.m100207e(root, "getRoot(...)");
                c8461c2.m45073i(root, element.getDisplay().getGradient());
                return;
            }
            C30089vd c30089vd8 = this.f45925s;
            if (c30089vd8 == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd8 = null;
            }
            c30089vd8.f139711r.setVisibility(8);
            C30089vd c30089vd9 = this.f45925s;
            if (c30089vd9 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30089vd = c30089vd9;
            }
            c30089vd.getRoot().setBackgroundColor(element.getDisplay().getSolidColor().getValue());
            return;
        }
        C30089vd c30089vd10 = this.f45925s;
        if (c30089vd10 == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd10 = null;
        }
        c30089vd10.f139711r.setVisibility(8);
        C30089vd c30089vd11 = this.f45925s;
        if (c30089vd11 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30089vd = c30089vd11;
        }
        c30089vd.getRoot().setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC16781w.PrimaryBackgroundColor));
    }

    /* renamed from: r */
    private final void m45024r(LottieWithImageView lottieWithImageView, Element element, Size size) {
        lottieWithImageView.setVisibility(0);
        if (lottieWithImageView.getLayoutParams() != null) {
            float m118722k0 = AbstractC23136l9.m118722k0() / size.getWidth();
            lottieWithImageView.getLayoutParams().width = (int) (element.getSize().getWidth() * m118722k0);
            ViewGroup.LayoutParams layoutParams = lottieWithImageView.getLayoutParams();
            int height = (int) (element.getSize().getHeight() * m118722k0);
            int i11 = this.f45926t;
            if (i11 <= 0 || height >= i11) {
                height = i11;
            }
            layoutParams.height = height;
        }
        int type = element.getDisplay().getType();
        if (type != 0 && type != 1) {
            if (type != 2) {
                if (type == 3) {
                    lottieWithImageView.setImageMode(LottieWithImageView.EnumC8868a.f47377p);
                    C8461c.m45072m(this.f45923q, lottieWithImageView.getLottieView(), element.getDisplay().getLottie(), 0, null, 12, null);
                    return;
                }
                return;
            }
            lottieWithImageView.setImageMode(LottieWithImageView.EnumC8868a.f47378q);
            C8461c.m45071k(this.f45923q, lottieWithImageView.getNormalView(), element.getDisplay().getImgUrl().getValue(), C23278z2.m120162x(), 0, null, 24, null);
            return;
        }
        lottieWithImageView.setVisibility(8);
    }

    /* renamed from: s */
    private final void m45025s(Decorations decorations, Size size) {
        m45020m();
        C30089vd c30089vd = null;
        if (decorations.getUseLeft()) {
            C30089vd c30089vd2 = this.f45925s;
            if (c30089vd2 == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd2 = null;
            }
            LottieWithImageView lottieWithImageView = c30089vd2.f139715v;
            AbstractC19074t.m100207e(lottieWithImageView, "leftDecor");
            m45024r(lottieWithImageView, decorations.getLeft(), size);
        } else {
            C30089vd c30089vd3 = this.f45925s;
            if (c30089vd3 == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd3 = null;
            }
            c30089vd3.f139715v.setVisibility(8);
        }
        if (decorations.getUseRight()) {
            C30089vd c30089vd4 = this.f45925s;
            if (c30089vd4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30089vd = c30089vd4;
            }
            LottieWithImageView lottieWithImageView2 = c30089vd.f139718y;
            AbstractC19074t.m100207e(lottieWithImageView2, "rightDecor");
            m45024r(lottieWithImageView2, decorations.getRight(), size);
            return;
        }
        C30089vd c30089vd5 = this.f45925s;
        if (c30089vd5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30089vd = c30089vd5;
        }
        c30089vd.f139718y.setVisibility(8);
    }

    /* renamed from: u */
    private final void m45026u(TimelineFpfEntrySetting timelineFpfEntrySetting) {
        int i11;
        C30089vd c30089vd = this.f45925s;
        C30089vd c30089vd2 = null;
        if (c30089vd == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd = null;
        }
        RobotoTextView robotoTextView = c30089vd.f139713t;
        if (timelineFpfEntrySetting.getGreetMsg().getText().m44977b().length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
        C30089vd c30089vd3 = this.f45925s;
        if (c30089vd3 == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd3 = null;
        }
        c30089vd3.f139713t.setText(timelineFpfEntrySetting.getGreetMsg().getText().m44977b());
        if (timelineFpfEntrySetting.getGreetMsg().getColor().isValid()) {
            C30089vd c30089vd4 = this.f45925s;
            if (c30089vd4 == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd4 = null;
            }
            c30089vd4.f139713t.setTextColor(timelineFpfEntrySetting.getGreetMsg().getColor().getValue());
        }
        m45027v();
        C30089vd c30089vd5 = this.f45925s;
        if (c30089vd5 == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd5 = null;
        }
        c30089vd5.f139714u.setText(timelineFpfEntrySetting.getHint().getText().m44977b());
        if (timelineFpfEntrySetting.getHint().getColor().isValid()) {
            C30089vd c30089vd6 = this.f45925s;
            if (c30089vd6 == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd6 = null;
            }
            c30089vd6.f139714u.setTextColor(timelineFpfEntrySetting.getHint().getColor().getValue());
        }
        C30089vd c30089vd7 = this.f45925s;
        if (c30089vd7 == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd7 = null;
        }
        CharSequence text = c30089vd7.f139713t.getText();
        AbstractC19074t.m100207e(text, "getText(...)");
        if (text.length() == 0) {
            C30089vd c30089vd8 = this.f45925s;
            if (c30089vd8 == null) {
                AbstractC19074t.m100223u("binding");
                c30089vd8 = null;
            }
            CharSequence text2 = c30089vd8.f139714u.getText();
            AbstractC19074t.m100207e(text2, "getText(...)");
            if (text2.length() == 0) {
                C30089vd c30089vd9 = this.f45925s;
                if (c30089vd9 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c30089vd2 = c30089vd9;
                }
                c30089vd2.f139714u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_timeline_header_hint_msg));
            }
        }
    }

    /* renamed from: v */
    private final void m45027v() {
        int m118736p = AbstractC23136l9.m118736p(AbstractC16802y.feed_remind_hint_text_normal);
        C30089vd c30089vd = this.f45925s;
        C30089vd c30089vd2 = null;
        if (c30089vd == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd = null;
        }
        RobotoTextView robotoTextView = c30089vd.f139713t;
        AbstractC19074t.m100207e(robotoTextView, "greetText");
        if (robotoTextView.getVisibility() == 0) {
            m118736p = AbstractC23136l9.m118736p(AbstractC16802y.feed_remind_hint_text_small);
        }
        C30089vd c30089vd3 = this.f45925s;
        if (c30089vd3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30089vd2 = c30089vd3;
        }
        c30089vd2.f139714u.setTextSize(0, m118736p);
    }

    /* renamed from: f */
    public final View m45028f(String str) {
        AbstractC19074t.m100208f(str, "tipCat");
        C30089vd c30089vd = this.f45925s;
        if (c30089vd == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd = null;
        }
        return c30089vd.f139717x.m45005b(str);
    }

    /* renamed from: g */
    public final boolean m45029g(String str) {
        AbstractC19074t.m100208f(str, "tipCat");
        C30089vd c30089vd = this.f45925s;
        if (c30089vd == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd = null;
        }
        return c30089vd.f139717x.m45006d(str);
    }

    public final InterfaceC8456a getListener() {
        return this.f45924r;
    }

    public final void setListener(InterfaceC8456a interfaceC8456a) {
        this.f45924r = interfaceC8456a;
    }

    public final void setScrolling(boolean z11) {
        this.f45922p = z11;
    }

    public final void setTimelineFpfEntryListener(InterfaceC8456a interfaceC8456a) {
        AbstractC19074t.m100208f(interfaceC8456a, "l");
        this.f45924r = interfaceC8456a;
    }

    /* renamed from: w */
    public final void m45030w() {
        C30089vd c30089vd = this.f45925s;
        if (c30089vd == null) {
            AbstractC19074t.m100223u("binding");
            c30089vd = null;
        }
        c30089vd.f139717x.m45008g();
        m45021n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineFpfEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        this.f45923q = new C8461c(context2);
        this.f45927u = new C8458c();
        m45015h(context);
    }
}
