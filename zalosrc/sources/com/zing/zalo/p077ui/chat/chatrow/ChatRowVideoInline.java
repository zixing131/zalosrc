package com.zing.zalo.p077ui.chat.chatrow;

import ag0.C0807c;
import ag0.C0809c1;
import am.AbstractC0939u;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import b40.C2526d;
import b40.C2535j;
import b40.C2549x;
import bi0.AbstractC2808b;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13697o;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import com.zing.zalo.uicontrol.C16660t2;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.VideoController;
import com.zing.zalo.zmedia.view.ZVideoView;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17961f1;
import dj.C17985n1;
import gg0.AbstractC19444a;
import gw.AbstractC19646n0;
import hf0.C20040b;
import ho0.AbstractC20110a;
import java.util.Locale;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p361nb.C23669z;
import p363nh.C23744a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p420pb.C24709a;
import p559uv.C27373c;
import vg.AbstractC28236y3;
import vg.C28075g8;
import vg.C28227x3;
import w50.C28769a;
import xd0.C29604t;

/* loaded from: classes5.dex */
public class ChatRowVideoInline extends ChatRowHasCaption implements C20040b.c {

    /* renamed from: g8 */
    private static final int f58822g8 = AbstractC23136l9.m118742r(0.5f);

    /* renamed from: h8 */
    static final int f58823h8 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: i8 */
    static final int f58824i8 = AbstractC23136l9.m118742r(8.0f);

    /* renamed from: j8 */
    static final int f58825j8 = AbstractC23136l9.m118742r(4.0f);

    /* renamed from: k8 */
    static final int f58826k8 = AbstractC23136l9.m118742r(36.0f);

    /* renamed from: B7 */
    private C17961f1 f58827B7;

    /* renamed from: C7 */
    protected ZVideoView f58828C7;

    /* renamed from: D7 */
    private RecyclingImageView f58829D7;

    /* renamed from: E7 */
    private VideoController f58830E7;

    /* renamed from: F7 */
    protected C16660t2 f58831F7;

    /* renamed from: G7 */
    protected C13697o f58832G7;

    /* renamed from: H7 */
    private float f58833H7;

    /* renamed from: I7 */
    private int f58834I7;

    /* renamed from: J7 */
    private int f58835J7;

    /* renamed from: K7 */
    private int f58836K7;

    /* renamed from: L7 */
    private int f58837L7;

    /* renamed from: M7 */
    private int f58838M7;

    /* renamed from: N7 */
    private int f58839N7;

    /* renamed from: O7 */
    private C27373c f58840O7;

    /* renamed from: P7 */
    private C17391z f58841P7;

    /* renamed from: Q7 */
    private String f58842Q7;

    /* renamed from: R7 */
    private boolean f58843R7;

    /* renamed from: S7 */
    private boolean f58844S7;

    /* renamed from: T7 */
    private boolean f58845T7;

    /* renamed from: U7 */
    private long f58846U7;

    /* renamed from: V7 */
    private boolean f58847V7;

    /* renamed from: W7 */
    int f58848W7;

    /* renamed from: X7 */
    private RectF f58849X7;

    /* renamed from: Y7 */
    private C13704p1 f58850Y7;

    /* renamed from: Z7 */
    private Paint f58851Z7;

    /* renamed from: a8 */
    private String f58852a8;

    /* renamed from: b8 */
    private int f58853b8;

    /* renamed from: c8 */
    private int f58854c8;

    /* renamed from: d8 */
    int f58855d8;

    /* renamed from: e8 */
    int f58856e8;

    /* renamed from: f8 */
    private VideoController.AbstractC17311d f58857f8;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline$a */
    /* loaded from: classes5.dex */
    public class C11424a extends VideoController.AbstractC17311d {
        C11424a() {
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: a */
        public void mo61749a(boolean z11) {
            if (ChatRowVideoInline.this.f58830E7 == null) {
                return;
            }
            if (z11) {
                ChatRowVideoInline.this.f58830E7.m92295S(false);
                return;
            }
            ZVideoView zVideoView = ChatRowVideoInline.this.f58828C7;
            if (zVideoView != null) {
                int currentState = zVideoView.getCurrentState();
                if (currentState == 0 || currentState >= 4) {
                    ChatRowVideoInline.this.f58830E7.m92295S(true);
                }
            }
        }

        @Override // com.zing.zalo.zmedia.view.VideoController.AbstractC17311d
        /* renamed from: d */
        public void mo61750d(ZVideoView zVideoView, long j11, long j12) {
            AbstractC23306f.m120652d().m109871X(CoreUtility.f89233i, ChatRowVideoInline.this.f57263B, j11, j12, true);
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline$b */
    /* loaded from: classes5.dex */
    public class C11425b extends C23999j {
        C11425b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (TextUtils.equals(ChatRowVideoInline.this.f58842Q7, str)) {
                    if (c3979l != null) {
                        ChatRowVideoInline.this.f58843R7 = true;
                        ChatRowVideoInline.this.f58829D7.setImageInfo(c3979l);
                    } else {
                        C17945a0 c17945a0 = ChatRowVideoInline.this.f57263B;
                        if (c17945a0 != null && !c17945a0.m94913I3()) {
                            ChatRowVideoInline.this.f57263B.m94909Ha(true);
                            String m95266u2 = ChatRowVideoInline.this.f57263B.m95266u2();
                            if (!TextUtils.equals(ChatRowVideoInline.this.f58842Q7, m95266u2)) {
                                ChatRowVideoInline.this.f58842Q7 = m95266u2;
                                ChatRowVideoInline.this.m61739c5();
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline$c */
    /* loaded from: classes5.dex */
    public class C11426c extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C17945a0 f58860a;

        /* renamed from: b */
        final /* synthetic */ String f58861b;

        /* renamed from: c */
        final /* synthetic */ float f58862c;

        /* renamed from: d */
        final /* synthetic */ C17391z f58863d;

        C11426c(C17945a0 c17945a0, String str, float f11, C17391z c17391z) {
            this.f58860a = c17945a0;
            this.f58861b = str;
            this.f58862c = f11;
            this.f58863d = c17391z;
        }

        /* renamed from: d */
        public /* synthetic */ void m61752d(C17945a0 c17945a0, boolean z11, C27373c c27373c, C17391z c17391z, boolean z12) {
            try {
                ChatRowVideoInline chatRowVideoInline = ChatRowVideoInline.this;
                if (c17945a0 == chatRowVideoInline.f57263B) {
                    chatRowVideoInline.f58847V7 = false;
                    if (z11) {
                        ChatRowVideoInline.this.f58840O7 = c27373c;
                        ChatRowVideoInline.this.f58841P7 = c17391z;
                    }
                    if (ChatRowVideoInline.this.isAttachedToWindow()) {
                        ChatRowVideoInline chatRowVideoInline2 = ChatRowVideoInline.this;
                        chatRowVideoInline2.f58828C7.setZVideo(chatRowVideoInline2.f58841P7);
                        if (z12) {
                            C23744a.m124114c().m124116d(54, c17945a0.mo95039W2());
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: com.zing.zalo.ui.chat.chatrow.d1.<init>(com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline$c, dj.a0, boolean, uv.c, com.zing.zalo.zmedia.view.z, boolean):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            /*
                r37 = this;
                r8 = r37
                dj.a0 r0 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                if (r0 == 0) goto Ld9
                dj.i0 r0 = r0.m94929K2()     // Catch: java.lang.Exception -> L4e
                if (r0 == 0) goto Ld9
                dj.a0 r0 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                uv.c r5 = gw.AbstractC19646n0.m102936U0(r0)     // Catch: java.lang.Exception -> L4e
                if (r5 != 0) goto L51
                com.zing.zalo.zmedia.view.z r0 = new com.zing.zalo.zmedia.view.z     // Catch: java.lang.Exception -> L4e
                dj.a0 r1 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                com.zing.zalo.data.entity.chat.message.MessageId r1 = r1.m95029V3()     // Catch: java.lang.Exception -> L4e
                java.lang.String r10 = r1.m41044h()     // Catch: java.lang.Exception -> L4e
                java.lang.String r11 = ""
                java.lang.String r12 = ""
                java.lang.String r13 = ""
                java.lang.String r14 = r8.f58861b     // Catch: java.lang.Exception -> L4e
                int r15 = me0.AbstractC23006a0.m117875E()     // Catch: java.lang.Exception -> L4e
                r16 = 0
                r17 = 9
                float r1 = r8.f58862c     // Catch: java.lang.Exception -> L4e
                dj.a0 r2 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                int r19 = r2.m95186l5()     // Catch: java.lang.Exception -> L4e
                r20 = 0
                dj.a0 r2 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                java.lang.String r21 = r2.mo95039W2()     // Catch: java.lang.Exception -> L4e
                com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline r2 = com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.this     // Catch: java.lang.Exception -> L4e
                int r22 = r2.getPosition()     // Catch: java.lang.Exception -> L4e
                r9 = r0
                r18 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Exception -> L4e
            L4c:
                r6 = r0
                goto L9d
            L4e:
                r0 = move-exception
                goto Ld6
            L51:
                com.zing.zalo.zmedia.view.z r0 = new com.zing.zalo.zmedia.view.z     // Catch: java.lang.Exception -> L4e
                dj.a0 r1 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                com.zing.zalo.data.entity.chat.message.MessageId r1 = r1.m95029V3()     // Catch: java.lang.Exception -> L4e
                java.lang.String r24 = r1.m41044h()     // Catch: java.lang.Exception -> L4e
                java.lang.String r1 = r5.m140253g()     // Catch: java.lang.Exception -> L4e
                if (r1 == 0) goto L6a
                java.lang.String r1 = r5.m140253g()     // Catch: java.lang.Exception -> L4e
            L67:
                r25 = r1
                goto L6d
            L6a:
                java.lang.String r1 = ""
                goto L67
            L6d:
                java.lang.String r26 = r5.m140220E()     // Catch: java.lang.Exception -> L4e
                java.lang.String r27 = ""
                java.lang.String r28 = r5.m140268v()     // Catch: java.lang.Exception -> L4e
                int r29 = me0.AbstractC23006a0.m117875E()     // Catch: java.lang.Exception -> L4e
                r30 = 0
                r31 = 9
                float r1 = r8.f58862c     // Catch: java.lang.Exception -> L4e
                dj.a0 r2 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                int r33 = r2.m95186l5()     // Catch: java.lang.Exception -> L4e
                r34 = 0
                dj.a0 r2 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                java.lang.String r35 = r2.mo95039W2()     // Catch: java.lang.Exception -> L4e
                com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline r2 = com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.this     // Catch: java.lang.Exception -> L4e
                int r36 = r2.getPosition()     // Catch: java.lang.Exception -> L4e
                r23 = r0
                r32 = r1
                r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch: java.lang.Exception -> L4e
                goto L4c
            L9d:
                com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline r0 = com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.this     // Catch: java.lang.Exception -> L4e
                dj.a0 r1 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                com.zing.zalo.zmedia.view.z r2 = r8.f58863d     // Catch: java.lang.Exception -> L4e
                boolean r4 = com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.m61727P4(r0, r1, r6, r2)     // Catch: java.lang.Exception -> L4e
                if (r4 != 0) goto Lbb
                com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline r0 = com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.this     // Catch: java.lang.Exception -> L4e
                boolean r0 = com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.m61716E4(r0)     // Catch: java.lang.Exception -> L4e
                com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline r1 = com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.this     // Catch: java.lang.Exception -> L4e
                boolean r1 = r1.mo44060f()     // Catch: java.lang.Exception -> L4e
                if (r0 == r1) goto Lb8
                goto Lbb
            Lb8:
                r0 = 0
                r7 = 0
                goto Lbd
            Lbb:
                r0 = 1
                r7 = 1
            Lbd:
                com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline r0 = com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.this     // Catch: java.lang.Exception -> L4e
                boolean r1 = r0.mo44060f()     // Catch: java.lang.Exception -> L4e
                com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.m61721J4(r0, r1)     // Catch: java.lang.Exception -> L4e
                com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline r0 = com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.this     // Catch: java.lang.Exception -> L4e
                dj.a0 r3 = r8.f58860a     // Catch: java.lang.Exception -> L4e
                com.zing.zalo.ui.chat.chatrow.d1 r9 = new com.zing.zalo.ui.chat.chatrow.d1     // Catch: java.lang.Exception -> L4e
                r1 = r9
                r2 = r37
                r1.<init>()     // Catch: java.lang.Exception -> L4e
                r0.post(r9)     // Catch: java.lang.Exception -> L4e
                goto Ld9
            Ld6:
                r0.printStackTrace()
            Ld9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.p077ui.chat.chatrow.ChatRowVideoInline.C11426c.mo928a():void");
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.chatrow.ChatRowVideoInline$d */
    /* loaded from: classes5.dex */
    class C11427d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ C23669z f58865a;

        C11427d(C23669z c23669z) {
            this.f58865a = c23669z;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C24709a.m128299t(MainApplication.getAppContext()).m128305K(this.f58865a);
        }
    }

    public ChatRowVideoInline(Context context, AttributeSet attributeSet) {
        super(context);
        this.f58848W7 = 10;
        this.f58855d8 = 0;
        this.f58856e8 = 0;
        this.f58832G7 = new C13697o(this);
        C16660t2 c16660t2 = new C16660t2(context, new C16660t2.b() { // from class: com.zing.zalo.ui.chat.chatrow.x0
            public /* synthetic */ C11537x0() {
            }

            @Override // com.zing.zalo.uicontrol.C16660t2.b
            /* renamed from: a */
            public final void mo61771a() {
                ChatRowVideoInline.this.m61733W4();
            }
        });
        this.f58831F7 = c16660t2;
        c16660t2.m88793f(new C16660t2.a() { // from class: com.zing.zalo.ui.chat.chatrow.y0
            public /* synthetic */ C11540y0() {
            }

            @Override // com.zing.zalo.uicontrol.C16660t2.a
            /* renamed from: a */
            public final void mo61907a() {
                ChatRowVideoInline.this.m61734X4();
            }
        });
    }

    /* renamed from: S4 */
    public boolean m61729S4(C17945a0 c17945a0, C17391z c17391z, C17391z c17391z2) {
        String str;
        if (c17391z2 == null || !TextUtils.equals(c17391z2.f88618a, c17391z.f88618a)) {
            return true;
        }
        if (c17391z2.f88620c.isEmpty()) {
            return !c17391z.f88620c.isEmpty();
        }
        String m102945X0 = AbstractC19646n0.m102945X0(c17945a0);
        if (c17945a0.m94929K2() != null) {
            str = c17945a0.m94929K2().f91014s;
        } else {
            str = "";
        }
        if (!TextUtils.equals(str, m102945X0) && TextUtils.equals(c17391z2.f88620c, str) && TextUtils.equals(c17391z.f88620c, m102945X0)) {
            if (ZMediaPlayer.cacheValidate(ZMediaPlayerSettings.getCacheDir(c17945a0.m95186l5()), str) <= 0) {
                return true;
            }
            return false;
        }
        return !TextUtils.equals(c17391z2.f88620c, c17391z.f88620c);
    }

    /* renamed from: T4 */
    private void m61730T4(Canvas canvas) {
        int m76473l = (this.f58836K7 + this.f58832G7.m76473l()) - this.f58853b8;
        int i11 = f58824i8;
        this.f58855d8 = m76473l - i11;
        int m76472k = ((this.f58837L7 + this.f58832G7.m76472k()) - this.f58854c8) - i11;
        this.f58856e8 = m76472k;
        this.f58849X7.set(this.f58855d8, m76472k, r3 + this.f58853b8, r2 + m76472k);
        RectF rectF = this.f58849X7;
        int i12 = f58825j8;
        canvas.drawRoundRect(rectF, i12, i12, this.f58851Z7);
        String str = this.f58852a8;
        RectF rectF2 = this.f58849X7;
        float f11 = rectF2.left;
        int i13 = f58823h8;
        canvas.drawText(str, f11 + i13, rectF2.bottom - i13, this.f58850Y7);
    }

    /* renamed from: U4 */
    private String m61731U4(int i11) {
        long j11 = this.f58846U7;
        return String.format(Locale.getDefault(), "%.1f / %.1f MB", Float.valueOf(((i11 / 100.0f) * ((float) j11)) / 1048576.0f), Float.valueOf(((float) j11) / 1048576.0f));
    }

    /* renamed from: V4 */
    private void m61732V4() {
        if (this.f58849X7 == null) {
            this.f58849X7 = new RectF();
        }
        if (this.f58850Y7 == null) {
            C13704p1 c13704p1 = new C13704p1(1);
            this.f58850Y7 = c13704p1;
            c13704p1.setColor(AbstractC23136l9.m118639A(AbstractC2808b.wht_a100));
            this.f58850Y7.setTextSize(AbstractC23136l9.m118742r(11.0f));
        }
        if (this.f58851Z7 == null) {
            Paint paint = new Paint(1);
            this.f58851Z7 = paint;
            paint.setColor(AbstractC23136l9.m118639A(AbstractC2808b.blk_a50));
        }
    }

    /* renamed from: W4 */
    public /* synthetic */ void m61733W4() {
        if (AbstractC19444a.m101693a()) {
            invalidate();
        } else {
            postInvalidate();
        }
    }

    /* renamed from: X4 */
    public /* synthetic */ void m61734X4() {
        try {
            C17945a0 c17945a0 = this.f57263B;
            if (c17945a0 != null) {
                if (this.f58840O7 == null) {
                    this.f58840O7 = AbstractC19646n0.m102936U0(c17945a0);
                }
                getDelegate().mo62088i4(this, this.f58840O7);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y4 */
    public /* synthetic */ void m61735Y4(float f11) {
        C28769a c28769a = this.f57269C;
        if (c28769a != null) {
            c28769a.f133324t = 0;
        }
    }

    /* renamed from: Z4 */
    public /* synthetic */ void m61736Z4() {
        m61119v3(false);
    }

    /* renamed from: a5 */
    public /* synthetic */ void m61737a5() {
        m61119v3(false);
    }

    /* renamed from: b5 */
    public /* synthetic */ boolean m61738b5(IMediaPlayer iMediaPlayer, int i11, int i12) {
        try {
            C17391z c17391z = this.f58841P7;
            if (c17391z != null && c17391z.equals(this.f58828C7.getVideo())) {
                if (this.f58828C7.m92407N(iMediaPlayer, i11, i12) && !AbstractC19646n0.m103038v1(1, this.f57263B.m94974P4())) {
                    C2535j.f10308a.m12772o(this.f57263B.m95029V3(), 0);
                    AbstractC23306f.m120618S1().m101508a(new C29604t.a(CoreUtility.f89233i, this.f57263B.mo95039W2(), this.f57263B.m95029V3(), this.f57263B.m94862C4(), "csc"));
                    ChatRowBase.f57636z.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.b1
                        public /* synthetic */ RunnableC11456b1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatRowVideoInline.this.m61736Z4();
                        }
                    });
                } else if (this.f58828C7.m92408O(iMediaPlayer, i11, i12)) {
                    C2535j.f10308a.m12772o(this.f57263B.m95029V3(), 1);
                    C2549x.f10397a.m12853g("csc", this.f57263B);
                    ChatRowBase.f57636z.post(new Runnable() { // from class: com.zing.zalo.ui.chat.chatrow.c1
                        public /* synthetic */ RunnableC11460c1() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ChatRowVideoInline.this.m61737a5();
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return false;
    }

    /* renamed from: c5 */
    public void m61739c5() {
        if (this.f58829D7 == null) {
            return;
        }
        C24003n m120068F = C23278z2.m120068F();
        this.f58829D7.setImageDrawable(m120068F.f116261b);
        if (this.f57263B.m94959N6()) {
            if (!this.f58828C7.getVideoController().m92318w()) {
                this.f58828C7.getVideoController().m92299W(true, true);
            }
        } else {
            if (TextUtils.isEmpty(this.f58842Q7)) {
                return;
            }
            if (m60988L3() || C23999j.m125696L2(this.f58842Q7, m120068F)) {
                ((C23528a) this.f57275D.m123612r(this.f58829D7)).m123579C(this.f58842Q7, m120068F, new C11425b());
            }
        }
    }

    /* renamed from: d5 */
    private void m61740d5() {
        boolean z11;
        if (this.f57263B.m94954N0() && (!mo60951C1() || this.f57415a5.m95644n())) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f57271C1 = z11;
    }

    /* renamed from: g5 */
    private void m61741g5() {
        boolean z11;
        boolean mo60951C1 = mo60951C1();
        ZVideoView zVideoView = this.f58828C7;
        if (!mo60951C1 && mo61711l5()) {
            z11 = false;
        } else {
            z11 = true;
        }
        zVideoView.setForceHideController(z11);
        if (mo60951C1) {
            this.f58828C7.getVideoController().m92313q(false);
        } else if (!this.f57382U4) {
            mo61709R4();
        }
    }

    private String getUploadStatus() {
        int i11;
        C17985n1 c17985n1 = this.f57415a5;
        if (c17985n1 != null) {
            i11 = c17985n1.m95635b();
        } else {
            i11 = 0;
        }
        if (!this.f57263B.m95073Z5()) {
            return m61731U4(i11);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: A3 */
    public void mo60947A3() {
        super.mo60947A3();
        this.f58845T7 = false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C0 */
    public void mo60950C0(Canvas canvas) {
        super.mo60950C0(canvas);
        if (mo61710k5()) {
            m61744e5();
            if (!TextUtils.isEmpty(this.f58852a8)) {
                m61730T4(canvas);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C1 */
    public boolean mo60951C1() {
        if (super.mo60951C1() && !this.f57382U4) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C2 */
    protected C28227x3 mo60952C2(int i11, int i12, C28227x3 c28227x3) {
        int i13;
        c28227x3.f131648a = this.f58832G7.m76473l() + (f58822g8 * 2);
        int m76472k = this.f58832G7.m76472k();
        if (mo61163l4()) {
            i13 = getTextHeight() + (ChatRow.f57201L5 * 2);
        } else {
            i13 = 0;
        }
        c28227x3.f131649b = m76472k + i13;
        return c28227x3;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: C3 */
    public void mo60953C3(C17945a0 c17945a0, C28769a c28769a, boolean z11) {
        boolean z12;
        long j11;
        super.mo60953C3(c17945a0, c28769a, z11);
        if (z11) {
            this.f58831F7.m88792e();
        }
        this.f57382U4 = c17945a0.m95022U7();
        if (c17945a0.m94929K2() instanceof C17961f1) {
            this.f58827B7 = (C17961f1) c17945a0.m94929K2();
            z12 = c17945a0.m94870D6();
        } else {
            z12 = false;
        }
        String str = this.f58842Q7;
        if (!this.f57382U4) {
            this.f58842Q7 = c17945a0.m95266u2();
        } else {
            this.f58842Q7 = null;
        }
        if (!z11 && !TextUtils.equals(str, this.f58842Q7)) {
            C23999j.m125719b2(str, this.f58842Q7, C23278z2.m120068F());
        }
        C17961f1 c17961f1 = this.f58827B7;
        if (c17961f1 != null) {
            j11 = c17961f1.m95508w();
            if (this.f58827B7.m95456J() > 0 && this.f58827B7.m95514z() > 0) {
                if (this.f58827B7.m95452F() != 90 && this.f58827B7.m95452F() != 270) {
                    this.f58834I7 = this.f58827B7.m95456J();
                    this.f58835J7 = this.f58827B7.m95514z();
                } else {
                    this.f58834I7 = this.f58827B7.m95514z();
                    this.f58835J7 = this.f58827B7.m95456J();
                }
                this.f58833H7 = this.f58834I7 / this.f58835J7;
            }
            this.f58846U7 = this.f58827B7.m95453G();
        } else {
            j11 = -1;
        }
        this.f58831F7.m88794g(c17945a0.mo95039W2());
        this.f58831F7.m88795h(j11);
        this.f58831F7.m88797j(z12);
        m61746h5(!this.f57382U4);
        if (this.f57382U4) {
            m61747i5();
        }
        if (c17945a0.m95032V6()) {
            m61748j5(c17945a0, c28769a);
        }
        C2535j.f10308a.m12775s("csc", c17945a0, this.f57382U4);
        m61740d5();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: I3 */
    public void mo60975I3(C17945a0 c17945a0, C28769a c28769a, int i11) {
        int i12;
        this.f58832G7.m76462J(0, i11 - (f58822g8 * 2));
        int i13 = this.f58834I7;
        if (i13 > 0 && (i12 = this.f58835J7) > 0) {
            this.f58832G7.m76481v(i13, i12);
        } else {
            this.f58832G7.m76478s();
        }
        float m118742r = AbstractC23136l9.m118742r(10.0f);
        this.f58832G7.m76461I(new float[]{m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r, m118742r});
        this.f58831F7.m88800n(this.f58832G7.m76473l(), this.f58832G7.m76472k(), this.f58832G7.m76470i());
        super.mo60975I3(c17945a0, c28769a, i11);
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: K3 */
    public boolean mo60983K3() {
        if (!super.mo60983K3() && !this.f58845T7) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: L2 */
    public boolean mo60987L2() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: M1 */
    public boolean mo60991M1() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O */
    public boolean mo60997O() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: O3 */
    protected boolean mo61001O3() {
        return false;
    }

    /* renamed from: R4 */
    protected void mo61709R4() {
        if (!this.f58828C7.isPlaying()) {
            this.f58828C7.getVideoController().m92306h(true);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y0 */
    public void mo61035Y0() {
        super.mo61035Y0();
        if (mo61710k5()) {
            m61732V4();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: Y2 */
    public void mo61036Y2(C17945a0 c17945a0, C28769a c28769a) {
        super.mo61036Y2(c17945a0, c28769a);
        try {
            m61741g5();
            if (!this.f57382U4) {
                if (!this.f58843R7) {
                    m61739c5();
                }
                if (getDelegate().mo62077c()) {
                    m61745f5();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: b4 */
    protected boolean mo61424b4() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, dj.C17985n1.c
    /* renamed from: c */
    public void mo61045c() {
        super.mo61045c();
        m61740d5();
        m61741g5();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: c0 */
    public boolean mo61046c0(C17945a0 c17945a0, C28769a c28769a) {
        if (super.mo61046c0(c17945a0, c28769a) || this.f57382U4 != c17945a0.m95022U7()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo44058d(int i11, int i12) {
        if (i11 > 0) {
            C2526d.f10270a.m12725r0(getDelegate().mo62064S2(), this.f57263B.m94870D6(), Math.round(i11 / 1000.0f), Math.round(i12 / 1000.0f), TextUtils.equals(this.f57263B.m94862C4(), CoreUtility.f89233i), true, false);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: e0 */
    protected boolean mo61053e0() {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.m95022U7()) {
            return true;
        }
        return false;
    }

    /* renamed from: e5 */
    public void m61744e5() {
        String uploadStatus = getUploadStatus();
        this.f58852a8 = uploadStatus;
        int m118764y0 = AbstractC23136l9.m118764y0(this.f58850Y7, uploadStatus);
        int i11 = f58823h8;
        this.f58853b8 = m118764y0 + (i11 * 2);
        this.f58854c8 = AbstractC23136l9.m118761x0(this.f58850Y7, this.f58852a8) + (i11 * 2);
    }

    @Override // hf0.C20040b.c
    /* renamed from: f */
    public boolean mo44060f() {
        if (getDelegate().mo62077c() && !this.f57263B.m95073Z5() && !this.f57263B.m94959N6()) {
            return true;
        }
        return false;
    }

    /* renamed from: f5 */
    void m61745f5() {
        this.f58847V7 = true;
        C0807c.m2042b(new C11426c(this.f57263B, this.f58842Q7, this.f58833H7, this.f58841P7));
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g0 */
    protected Point mo61061g0() {
        int i11 = this.f58836K7;
        int m76473l = this.f58832G7.m76473l();
        int i12 = f58826k8;
        return new Point(i11 + ((m76473l - i12) / 2), this.f58837L7 + ((this.f58832G7.m76472k() - i12) / 2));
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: g2 */
    protected void mo61063g2(int i11, int i12, int i13, int i14, boolean z11) {
        this.f58836K7 = f58822g8 + i11;
        this.f58837L7 = i12;
        if (mo61163l4()) {
            this.f58838M7 = i11 + ChatRow.f57203M5;
            this.f58839N7 = this.f58837L7 + this.f58832G7.m76472k() + ChatRow.f57201L5;
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getBubbleMaxWidth() {
        return Math.max(getWidthMeasurement() - ChatRow.f57198J6, AbstractC11531v0.m62231a3());
    }

    @Override // hf0.C20040b.c
    public int getDataPosition() {
        return getPosition();
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getDefaultBubblePaddingTop() {
        return f58822g8;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    public int getMarginBorder() {
        return f58822g8;
    }

    @Override // hf0.C20040b.c
    public ZVideoView getNewVideoView() {
        return this.f58828C7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public Rect getPhotoCoords() {
        if (this.f58828C7 != null && this.f57263B != null) {
            Rect rect = new Rect();
            int[] iArr = new int[2];
            this.f57560z4.getLocationOnScreen(iArr);
            int i11 = iArr[0] + this.f58836K7;
            rect.left = i11;
            rect.top = iArr[1] + this.f58837L7;
            rect.right = i11 + this.f58832G7.m76473l();
            rect.bottom = rect.top + this.f58832G7.m76472k();
            return rect;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionX() {
        return this.f58838M7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    protected int getTextPositionY() {
        return this.f58839N7;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.InterfaceC11475g0
    public C3979l getThumbImageInfo() {
        if (!TextUtils.isEmpty(this.f58842Q7)) {
            C24003n m120068F = C23278z2.m120068F();
            return this.f57275D.m123606l(this.f58842Q7, m120068F.f116260a, m120068F.f116263d, m120068F.f116266g);
        }
        return null;
    }

    public C17391z getVideo() {
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && !c17945a0.m95032V6()) {
            return this.f58841P7;
        }
        return null;
    }

    /* renamed from: h5 */
    protected void m61746h5(boolean z11) {
        this.f58831F7.m88798k(z11, false);
    }

    /* renamed from: i5 */
    protected void m61747i5() {
        this.f58829D7.setImageInfo(null);
        this.f58831F7.m88799m(true);
        this.f58828C7.setForceHideController(true);
        this.f58828C7.getVideoController().m92312p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: j4 */
    public int mo61198j4(int i11) {
        return this.f58832G7.m76473l() - (ChatRow.f57203M5 * 2);
    }

    /* renamed from: j5 */
    void m61748j5(C17945a0 c17945a0, C28769a c28769a) {
        try {
            if (c17945a0.m95306y8()) {
                int m95089b4 = c17945a0.m95089b4();
                if (m95089b4 != 0) {
                    if (m95089b4 != 1) {
                        if ((m95089b4 == 2 || m95089b4 == 3 || m95089b4 == 4) && c28769a.f133324t == 1) {
                            c28769a.f133324t = 2;
                        }
                    } else {
                        c28769a.f133324t = 0;
                        this.f58828C7.getVideoController().m92312p();
                    }
                } else {
                    c28769a.f133324t = 1;
                    this.f58828C7.setDimAlpha(1.0f);
                }
                if (c28769a.f133324t == 2) {
                    this.f58828C7.m92427r0(1.0f);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption
    /* renamed from: k4 */
    protected String mo61162k4(C17945a0 c17945a0) {
        if (c17945a0.m94929K2() != null) {
            return c17945a0.m94929K2().f91011p;
        }
        return "";
    }

    /* renamed from: k5 */
    boolean mo61710k5() {
        return true;
    }

    /* renamed from: l5 */
    boolean mo61711l5() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        boolean z11;
        try {
            super.onAttachedToWindow();
            ZVideoView zVideoView = this.f58828C7;
            if (zVideoView != null) {
                boolean z12 = false;
                if (!this.f58847V7 && zVideoView.getVideo() == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!this.f57382U4 && getDelegate().mo62077c()) {
                    z12 = true;
                }
                if (z11 && z12) {
                    m61745f5();
                }
                VideoController videoController = this.f58830E7;
                if (videoController != null) {
                    videoController.m92307i(this.f58857f8);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            ZVideoView zVideoView = this.f58828C7;
            if (zVideoView != null) {
                C23669z m92432u0 = zVideoView.m92432u0(0);
                if (m92432u0 != null) {
                    C0809c1.m2050b(new C11427d(m92432u0));
                }
                this.f58828C7.m92429s0();
                this.f58828C7.m92412f0(true);
                this.f58843R7 = false;
                VideoController videoController = this.f58830E7;
                if (videoController != null) {
                    videoController.m92289M(this.f58857f8);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ZVideoView zVideoView = (ZVideoView) findViewById(AbstractC6918a0.video_view);
        this.f58828C7 = zVideoView;
        zVideoView.setClickable(false);
        this.f58828C7.setForceHideController(!mo61711l5());
        this.f58828C7.setRoundCorner(AbstractC23136l9.m118742r(10.0f));
        this.f58828C7.setUseVideoRatio(false);
        this.f58828C7.setVideoPlayerMode(1);
        this.f58828C7.setPlayConfig(ZMediaPlayerSettings.getPlayConfig(1));
        this.f58828C7.setAudioFocusControl(C28075g8.m141538e());
        this.f58828C7.setOnDimAlphaChangedListener(new ZVideoView.InterfaceC17343o() { // from class: com.zing.zalo.ui.chat.chatrow.z0
            public /* synthetic */ C11543z0() {
            }

            @Override // com.zing.zalo.zmedia.view.ZVideoView.InterfaceC17343o
            /* renamed from: a */
            public final void mo61908a(float f11) {
                ChatRowVideoInline.this.m61735Y4(f11);
            }
        });
        this.f58828C7.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: com.zing.zalo.ui.chat.chatrow.a1
            public /* synthetic */ C11452a1() {
            }

            @Override // com.zing.zalo.zmedia.player.IMediaPlayer.OnErrorListener
            public final boolean onError(IMediaPlayer iMediaPlayer, int i11, int i12) {
                boolean m61738b5;
                m61738b5 = ChatRowVideoInline.this.m61738b5(iMediaPlayer, i11, i12);
                return m61738b5;
            }
        });
        this.f58830E7 = this.f58828C7.getVideoController();
        RecyclingImageView loadingView = this.f58828C7.getLoadingView();
        this.f58829D7 = loadingView;
        if (loadingView != null) {
            loadingView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            RecyclingImageView recyclingImageView = this.f58829D7;
            if (recyclingImageView instanceof RoundedImageView) {
                ((RoundedImageView) recyclingImageView).m76289j(10.0f, 10.0f, 10.0f, 10.0f);
            }
        }
        if (this.f58830E7 != null) {
            this.f58857f8 = new C11424a();
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, com.zing.zalo.p077ui.chat.chatrow.ChatRowBase, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        ZVideoView zVideoView = this.f58828C7;
        if (zVideoView != null) {
            int i15 = this.f58836K7;
            zVideoView.layout(i15, this.f58837L7, zVideoView.getMeasuredWidth() + i15, this.f58837L7 + this.f58828C7.getMeasuredHeight());
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        ZVideoView zVideoView = this.f58828C7;
        if (zVideoView != null) {
            zVideoView.measure(View.MeasureSpec.makeMeasureSpec(this.f58832G7.m76473l(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f58832G7.m76472k(), 1073741824));
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: p3 */
    public boolean mo61101p3(MotionEvent motionEvent, float f11, float f12, int i11) {
        if (!super.mo61101p3(motionEvent, f11, f12, i11)) {
            boolean m88791d = this.f58831F7.m88791d(motionEvent, i11, f11 - this.f58836K7, f12 - this.f58837L7);
            this.f58845T7 = m88791d;
            if (!m88791d) {
                return false;
            }
        }
        return true;
    }

    @Override // hf0.C20040b.c
    public void setCurrentVideoView(boolean z11) {
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: t0 */
    protected void mo61111t0(Canvas canvas) {
        float f11 = this.f58836K7;
        float f12 = this.f58837L7;
        canvas.translate(f11, f12);
        this.f58831F7.m88789a(canvas);
        canvas.translate(-f11, -f12);
        C17945a0 c17945a0 = this.f57263B;
        if (c17945a0 != null && c17945a0.m94849A8() && AbstractC11531v0.m62147H2() != null && AbstractC11531v0.m62137F2() != null) {
            int i11 = this.f58836K7;
            int measuredHeight = this.f58837L7 + this.f58828C7.getMeasuredHeight();
            int dimensionPixelSize = i11 + getContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            int intrinsicHeight = (measuredHeight - AbstractC11531v0.m62137F2().getIntrinsicHeight()) - getContext().getResources().getDimensionPixelSize(AbstractC16802y.label_margin_left_top);
            AbstractC28236y3.m142204o(AbstractC11531v0.m62137F2(), dimensionPixelSize, intrinsicHeight);
            AbstractC11531v0.m62137F2().draw(canvas);
            int m118742r = AbstractC23136l9.m118742r(2.0f);
            int m118742r2 = AbstractC23136l9.m118742r(2.0f);
            int m118742r3 = AbstractC23136l9.m118742r(16.0f);
            int i12 = dimensionPixelSize + m118742r;
            int i13 = intrinsicHeight + m118742r2;
            AbstractC11531v0.m62147H2().setBounds(i12, i13, i12 + m118742r3, m118742r3 + i13);
            AbstractC11531v0.m62147H2().draw(canvas);
        }
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: u1 */
    protected boolean mo61115u1() {
        return true;
    }

    @Override // com.zing.zalo.p077ui.chat.chatrow.ChatRowHasCaption, com.zing.zalo.p077ui.chat.chatrow.ChatRow
    /* renamed from: w3 */
    public void mo61122w3() {
        super.mo61122w3();
        this.f58827B7 = null;
        this.f58833H7 = 1.0f;
        this.f58834I7 = 0;
        this.f58835J7 = 0;
        this.f58843R7 = false;
        this.f58828C7.m92416j0();
        this.f58829D7.setImageInfo(null);
        this.f58828C7.setForceHideController(!mo61711l5());
        this.f58847V7 = false;
        this.f58848W7 = 0;
    }
}
