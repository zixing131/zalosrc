package com.zing.zalo.p077ui.moduleview.pin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.TypedValue;
import bn.C2852a1;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p062db.C7962g;
import com.zing.zalo.p077ui.moduleview.pin.ConversationPinItemModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p175g0.AbstractC19178a;
import p227i3.C20217u;
import p262jb.AbstractC21196a;
import p716zh.C31931g8;
import p716zh.C31973j5;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class ConversationPinItemModuleView extends ModulesView {

    /* renamed from: K */
    private final C16719g f65068K;

    /* renamed from: L */
    private final C22129e f65069L;

    /* renamed from: M */
    private final C22126c0 f65070M;

    /* renamed from: N */
    private final C22126c0 f65071N;

    /* renamed from: O */
    private final C2852a1.d f65072O;

    public ConversationPinItemModuleView(Context context, C2852a1.d dVar) {
        super(context);
        this.f65072O = dVar;
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-1, -2).m89048d0(AbstractC23222t7.f112576o).m89044a0(AbstractC23222t7.f112576o).m89047c0(AbstractC23222t7.f112514B).m89046b0(AbstractC23222t7.f112514B);
        C22129e c22129e = new C22129e(context, AbstractC23136l9.m118655I(AbstractC16802y.avt_M));
        this.f65069L = c22129e;
        c22129e.m89106L().m89027K(true).m89035S(AbstractC23222t7.f112586t);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f65071N = c22126c0;
        C16718f m89034R = c22126c0.m89106L().m89028L(-2, AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h)).m89017A(Boolean.TRUE).m89027K(true).m89029M(15).m89034R(AbstractC23222t7.f112590v);
        int i11 = AbstractC23222t7.f112576o;
        m89034R.m89042Z(i11, 0, i11, 0);
        c22126c0.m111979u1(true);
        c22126c0.mo111964L1(AbstractC23222t7.f112582r);
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_unpin));
        int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        c22126c0.m111962J1(m119607o);
        c22126c0.mo111965M1(1);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(AbstractC19178a.selectableItemBackground, typedValue, true);
        c22126c0.m89087B0(typedValue.resourceId);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f65070M = c22126c02;
        c22126c02.m89106L().m89028L(-1, -2).m89054h0(c22129e).m89049e0(c22126c0).m89027K(true);
        c22126c02.mo111964L1(AbstractC23222t7.f112586t);
        c22126c02.m111962J1(m119607o);
        c22126c02.m111953A1(1);
        c22126c02.m111980v1(TextUtils.TruncateAt.END);
        c16716d.m89001g1(c22129e);
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c22126c02);
        C16719g c16719g = new C16719g(context);
        this.f65068K = c16719g;
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        c16719g.m89106L().m89028L(-1, 1).m89023G(c16716d).m89054h0(c22129e).m89034R(AbstractC23222t7.f112514B);
        mo69681L(c16716d);
        mo69681L(c16719g);
    }

    /* renamed from: X */
    public /* synthetic */ void m69873X(C31931g8 c31931g8, C16719g c16719g) {
        C2852a1.d dVar = this.f65072O;
        if (dVar != null) {
            dVar.mo13059tA(1, c31931g8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0086 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0003, B:20:0x0073, B:22:0x0086, B:24:0x008c, B:26:0x0044, B:27:0x0052, B:29:0x005b, B:30:0x0060, B:32:0x0069, B:33:0x001b, B:36:0x0028, B:39:0x0032), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0003, B:20:0x0073, B:22:0x0086, B:24:0x008c, B:26:0x0044, B:27:0x0052, B:29:0x005b, B:30:0x0060, B:32:0x0069, B:33:0x001b, B:36:0x0028, B:39:0x0032), top: B:4:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:5:0x0003, B:20:0x0073, B:22:0x0086, B:24:0x008c, B:26:0x0044, B:27:0x0052, B:29:0x005b, B:30:0x0060, B:32:0x0069, B:33:0x001b, B:36:0x0028, B:39:0x0032), top: B:4:0x0003 }] */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m69874W(C31931g8 c31931g8) {
        char c11;
        String m40383Q;
        if (c31931g8 == null) {
            return;
        }
        try {
            String m153434e = c31931g8.m153434e();
            int hashCode = m153434e.hashCode();
            if (hashCode != 103) {
                if (hashCode != 109) {
                    if (hashCode == 117 && m153434e.equals(C20217u.f99970o)) {
                        c11 = 0;
                        if (c11 == 0) {
                            if (c11 != 1) {
                                if (c11 == 2) {
                                    this.f65069L.m115440x1(AbstractC16803z.ava_oa_news);
                                    m40383Q = AbstractC23136l9.m118743r0(AbstractC8020f0.oa_msg_thread_title);
                                    if (m40383Q == null) {
                                    }
                                    this.f65070M.m111959G1(m40383Q);
                                    this.f65071N.mo89109M0(new C16719g.c() { // from class: m80.a

                                        /* renamed from: q */
                                        public final /* synthetic */ C31931g8 f111674q;

                                        public /* synthetic */ C22953a(C31931g8 c31931g82) {
                                            r2 = c31931g82;
                                        }

                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g) {
                                            ConversationPinItemModuleView.this.m69873X(r2, c16719g);
                                        }
                                    });
                                    if (c31931g82.f146709f) {
                                    }
                                } else {
                                    m40383Q = null;
                                    if (m40383Q == null) {
                                        m40383Q = "";
                                    }
                                    this.f65070M.m111959G1(m40383Q);
                                    this.f65071N.mo89109M0(new C16719g.c() { // from class: m80.a

                                        /* renamed from: q */
                                        public final /* synthetic */ C31931g8 f111674q;

                                        public /* synthetic */ C22953a(C31931g8 c31931g82) {
                                            r2 = c31931g82;
                                        }

                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g) {
                                            ConversationPinItemModuleView.this.m69873X(r2, c16719g);
                                        }
                                    });
                                    if (c31931g82.f146709f) {
                                        this.f65068K.mo44614b1(0);
                                        return;
                                    } else {
                                        this.f65068K.mo44614b1(8);
                                        return;
                                    }
                                }
                            } else {
                                C31973j5 c31973j5 = c31931g82.f146708e;
                                this.f65069L.m115437u1(c31973j5);
                                if (c31973j5 != null) {
                                    m40383Q = c31973j5.m153793y();
                                    if (m40383Q == null) {
                                    }
                                    this.f65070M.m111959G1(m40383Q);
                                    this.f65071N.mo89109M0(new C16719g.c() { // from class: m80.a

                                        /* renamed from: q */
                                        public final /* synthetic */ C31931g8 f111674q;

                                        public /* synthetic */ C22953a(C31931g8 c31931g82) {
                                            r2 = c31931g82;
                                        }

                                        @Override // com.zing.zalo.uidrawing.C16719g.c
                                        /* renamed from: y */
                                        public final void mo929y(C16719g c16719g) {
                                            ConversationPinItemModuleView.this.m69873X(r2, c16719g);
                                        }
                                    });
                                    if (c31931g82.f146709f) {
                                    }
                                }
                                m40383Q = null;
                                if (m40383Q == null) {
                                }
                                this.f65070M.m111959G1(m40383Q);
                                this.f65071N.mo89109M0(new C16719g.c() { // from class: m80.a

                                    /* renamed from: q */
                                    public final /* synthetic */ C31931g8 f111674q;

                                    public /* synthetic */ C22953a(C31931g8 c31931g82) {
                                        r2 = c31931g82;
                                    }

                                    @Override // com.zing.zalo.uidrawing.C16719g.c
                                    /* renamed from: y */
                                    public final void mo929y(C16719g c16719g) {
                                        ConversationPinItemModuleView.this.m69873X(r2, c16719g);
                                    }
                                });
                                if (c31931g82.f146709f) {
                                }
                            }
                        } else {
                            ContactProfile contactProfile = c31931g82.f146707d;
                            this.f65069L.m115433q1(contactProfile);
                            if (contactProfile != null) {
                                m40383Q = contactProfile.m40383Q(true, false);
                                if (m40383Q == null) {
                                }
                                this.f65070M.m111959G1(m40383Q);
                                this.f65071N.mo89109M0(new C16719g.c() { // from class: m80.a

                                    /* renamed from: q */
                                    public final /* synthetic */ C31931g8 f111674q;

                                    public /* synthetic */ C22953a(C31931g8 c31931g82) {
                                        r2 = c31931g82;
                                    }

                                    @Override // com.zing.zalo.uidrawing.C16719g.c
                                    /* renamed from: y */
                                    public final void mo929y(C16719g c16719g) {
                                        ConversationPinItemModuleView.this.m69873X(r2, c16719g);
                                    }
                                });
                                if (c31931g82.f146709f) {
                                }
                            }
                            m40383Q = null;
                            if (m40383Q == null) {
                            }
                            this.f65070M.m111959G1(m40383Q);
                            this.f65071N.mo89109M0(new C16719g.c() { // from class: m80.a

                                /* renamed from: q */
                                public final /* synthetic */ C31931g8 f111674q;

                                public /* synthetic */ C22953a(C31931g8 c31931g82) {
                                    r2 = c31931g82;
                                }

                                @Override // com.zing.zalo.uidrawing.C16719g.c
                                /* renamed from: y */
                                public final void mo929y(C16719g c16719g) {
                                    ConversationPinItemModuleView.this.m69873X(r2, c16719g);
                                }
                            });
                            if (c31931g82.f146709f) {
                            }
                        }
                    }
                    c11 = 65535;
                    if (c11 == 0) {
                    }
                } else {
                    if (m153434e.equals("m")) {
                        c11 = 2;
                        if (c11 == 0) {
                        }
                    }
                    c11 = 65535;
                    if (c11 == 0) {
                    }
                }
            } else {
                if (m153434e.equals(C7962g.f43287r)) {
                    c11 = 1;
                    if (c11 == 0) {
                    }
                }
                c11 = 65535;
                if (c11 == 0) {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
