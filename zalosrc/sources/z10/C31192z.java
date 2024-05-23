package z10;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LoadMoreInfo;
import com.zing.zalo.shortvideo.data.model.Notification;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.List;
import mj0.AbstractC23322a;
import on0.AbstractC24341v;
import p021an.AbstractC0955d;
import p227i3.C20218v;
import p328ln.InterfaceC22531b;
import pm0.C24848g0;
import q10.C25071z;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import s20.AbstractC26105g;
import s20.AbstractC26112n;
import ui0.C27280g;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;
import v00.AbstractC27409d;
import v00.AbstractC27410e;
import v00.AbstractC27413h;

/* renamed from: z10.z */
/* loaded from: classes5.dex */
public class C31192z extends AbstractC31153a0 {
    public static final b Companion = new b(null);

    /* renamed from: u */
    private final String f144001u;

    /* renamed from: v */
    private Section f144002v;

    /* renamed from: w */
    private a f144003w;

    /* renamed from: x */
    private int f144004x;

    /* renamed from: y */
    private ArrayList f144005y;

    /* renamed from: z */
    private ArrayList f144006z;

    /* renamed from: z10.z$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        void mo54623a(LoadMoreInfo loadMoreInfo);

        /* renamed from: m */
        void mo54628m(View view);
    }

    /* renamed from: z10.z$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: z10.z$c */
    /* loaded from: classes5.dex */
    public static final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final C25071z f144007I;

        /* renamed from: J */
        private final String f144008J;

        /* renamed from: K */
        private final String f144009K;

        /* renamed from: L */
        private final String f144010L;

        /* renamed from: M */
        private final String f144011M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            C25071z m129981a = C25071z.m129981a(view);
            AbstractC19074t.m100207e(m129981a, "bind(...)");
            this.f144007I = m129981a;
            String string = this.f7784p.getContext().getString(AbstractC27413h.zch_page_notification_group_today);
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f144008J = string;
            String string2 = this.f7784p.getContext().getString(AbstractC27413h.zch_page_notification_group_this_week);
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f144009K = string2;
            String string3 = this.f7784p.getContext().getString(AbstractC27413h.zch_page_notification_group_this_month);
            AbstractC19074t.m100207e(string3, "getString(...)");
            this.f144010L = string3;
            String string4 = this.f7784p.getContext().getString(AbstractC27413h.zch_page_notification_group_this_older);
            AbstractC19074t.m100207e(string4, "getString(...)");
            this.f144011M = string4;
        }

        /* renamed from: i0 */
        public final void m151967i0(int i11) {
            String str;
            SimpleShadowTextView simpleShadowTextView = this.f144007I.f120437q;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        str = this.f144011M;
                    } else {
                        str = this.f144010L;
                    }
                } else {
                    str = this.f144009K;
                }
            } else {
                str = this.f144008J;
            }
            simpleShadowTextView.setText(str);
        }
    }

    /* renamed from: z10.z$d */
    /* loaded from: classes5.dex */
    public static final class d extends f {

        /* renamed from: N */
        private final String f144012N;

        /* renamed from: O */
        private final View f144013O;

        /* renamed from: P */
        private final FrameLayout f144014P;

        /* renamed from: Q */
        private final AppCompatImageView f144015Q;

        /* renamed from: R */
        private final RobotoButton f144016R;

        /* renamed from: S */
        private final RobotoButton f144017S;

        /* renamed from: T */
        private final AvatarImageView f144018T;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, String str) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f144012N = str;
            this.f144013O = this.f7784p.findViewById(AbstractC27409d.llInteract);
            this.f144014P = (FrameLayout) this.f7784p.findViewById(AbstractC27409d.flLike);
            this.f144015Q = (AppCompatImageView) this.f7784p.findViewById(AbstractC27409d.btnLike);
            this.f144016R = (RobotoButton) this.f7784p.findViewById(AbstractC27409d.btnFollow);
            this.f144017S = (RobotoButton) this.f7784p.findViewById(AbstractC27409d.btnReply);
            this.f144018T = (AvatarImageView) this.f7784p.findViewById(AbstractC27409d.ivRight);
        }

        @Override // z10.C31192z.f
        /* renamed from: i0 */
        public void mo151968i0(Notification notification) {
            AbstractC19074t.m100208f(notification, "item");
            super.mo151968i0(notification);
            AvatarImageView avatarImageView = this.f144018T;
            AbstractC19074t.m100207e(avatarImageView, "ivRight");
            AvatarImageView.m55926k(avatarImageView, notification.m51051c().m51086d(), AbstractC27408c.zch_placeholder_avatar_channel, false, 4, null);
            this.f144013O.setTag(notification);
            m151971l0(notification.m51061m(), notification.m51057i());
            m151970k0(notification.m51060l(), notification.m51057i());
            m151969j0(notification.m51059k(), notification.m51058j());
        }

        /* renamed from: j0 */
        public final void m151969j0(Boolean bool, boolean z11) {
            if (AbstractC19074t.m100204b(this.f144012N, "30")) {
                if (AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
                    RobotoButton robotoButton = this.f144016R;
                    AbstractC19074t.m100207e(robotoButton, "btnFollow");
                    AbstractC26112n.m134367H(robotoButton);
                    return;
                } else {
                    if (AbstractC19074t.m100204b(bool, Boolean.FALSE)) {
                        RobotoButton robotoButton2 = this.f144016R;
                        AbstractC19074t.m100207e(robotoButton2, "btnFollow");
                        if (z11) {
                            AbstractC26112n.m134367H(robotoButton2);
                            return;
                        } else {
                            AbstractC26112n.m134431w0(robotoButton2);
                            return;
                        }
                    }
                    RobotoButton robotoButton3 = this.f144016R;
                    AbstractC19074t.m100207e(robotoButton3, "btnFollow");
                    AbstractC26112n.m134367H(robotoButton3);
                    return;
                }
            }
            RobotoButton robotoButton4 = this.f144016R;
            AbstractC19074t.m100207e(robotoButton4, "btnFollow");
            AbstractC26112n.m134367H(robotoButton4);
        }

        /* renamed from: k0 */
        public final void m151970k0(Boolean bool, boolean z11) {
            if (z11) {
                FrameLayout frameLayout = this.f144014P;
                AbstractC19074t.m100207e(frameLayout, "flLike");
                AbstractC26112n.m134367H(frameLayout);
                return;
            }
            FrameLayout frameLayout2 = this.f144014P;
            AbstractC19074t.m100207e(frameLayout2, "flLike");
            AbstractC26112n.m134431w0(frameLayout2);
            if (AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
                this.f144015Q.setImageResource(AbstractC23322a.zch_ic_heart_solid_16);
            } else {
                this.f144015Q.setImageResource(AbstractC23322a.zch_ic_heart_line_16);
            }
        }

        /* renamed from: l0 */
        public final void m151971l0(boolean z11, boolean z12) {
            int i11;
            if (z12) {
                RobotoButton robotoButton = this.f144017S;
                AbstractC19074t.m100207e(robotoButton, "btnReply");
                AbstractC26112n.m134367H(robotoButton);
                return;
            }
            RobotoButton robotoButton2 = this.f144017S;
            AbstractC19074t.m100207e(robotoButton2, "btnReply");
            AbstractC26112n.m134431w0(robotoButton2);
            Context context = this.f144017S.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            if (z11) {
                i11 = AbstractC23322a.zch_ic_replied_notification_line_16;
            } else {
                i11 = AbstractC23322a.zch_ic_reply_notification_line_16;
            }
            Drawable m139658a = C27280g.m139658a(context, i11);
            if (m139658a != null) {
                m139658a.setBounds(0, 0, AbstractC26105g.m134347n(16), AbstractC26105g.m134347n(16));
                this.f144017S.setCompoundDrawables(m139658a, null, null, null);
            }
        }
    }

    /* renamed from: z10.z$e */
    /* loaded from: classes5.dex */
    public static final class e extends f {

        /* renamed from: N */
        private final AvatarImageView f144019N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f144019N = (AvatarImageView) this.f7784p.findViewById(AbstractC27409d.ivRight);
        }

        @Override // z10.C31192z.f
        /* renamed from: i0 */
        public void mo151968i0(Notification notification) {
            AbstractC19074t.m100208f(notification, "item");
            super.mo151968i0(notification);
            AvatarImageView avatarImageView = this.f144019N;
            AbstractC19074t.m100207e(avatarImageView, "ivRight");
            AvatarImageView.m55926k(avatarImageView, notification.m51051c().m51086d(), AbstractC27408c.zch_placeholder_avatar_channel, false, 4, null);
        }
    }

    /* renamed from: z10.z$f */
    /* loaded from: classes5.dex */
    public static class f extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private final AvatarImageView f144020I;

        /* renamed from: J */
        private final TextView f144021J;

        /* renamed from: K */
        private final TextView f144022K;

        /* renamed from: L */
        private final TextView f144023L;

        /* renamed from: M */
        private final float f144024M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(view);
            AbstractC19074t.m100208f(view, C20218v.f100059b);
            this.f144020I = (AvatarImageView) this.f7784p.findViewById(AbstractC27409d.ivLeft);
            this.f144021J = (TextView) this.f7784p.findViewById(AbstractC27409d.tvTittle);
            this.f144022K = (TextView) this.f7784p.findViewById(AbstractC27409d.tvSubTittle);
            this.f144023L = (TextView) this.f7784p.findViewById(AbstractC27409d.tvTimestamp);
            AbstractC19074t.m100207e(this.f7784p, "itemView");
            this.f144024M = AbstractC26112n.m134433y(r2, AbstractC27407b.zch_radius_4dp);
        }

        /* renamed from: i0 */
        public void mo151968i0(Notification notification) {
            Integer num;
            boolean m127128x;
            CharSequence charSequence;
            boolean m131390w;
            AbstractC19074t.m100208f(notification, "item");
            this.f7784p.setTag(notification);
            Notification.Payload m51085c = notification.m51052d().m51085c();
            C24848g0 c24848g0 = null;
            if (m51085c != null) {
                num = Integer.valueOf(m51085c.m51077b());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                Parcelable m51076a = notification.m51052d().m51085c().m51076a();
                if (!(m51076a instanceof User)) {
                    m51076a = null;
                }
                User user = (User) m51076a;
                if (user != null) {
                    this.f144020I.setCornerRadius(Float.MAX_VALUE);
                    this.f144020I.setAvatar(user);
                }
            } else if (num != null && num.intValue() == 2) {
                Parcelable m51076a2 = notification.m51052d().m51085c().m51076a();
                if (!(m51076a2 instanceof Channel)) {
                    m51076a2 = null;
                }
                Channel channel = (Channel) m51076a2;
                if (channel != null) {
                    this.f144020I.setAvatar(channel);
                    this.f144020I.setCornerRadius(this.f144024M);
                }
            } else {
                AvatarImageView avatarImageView = this.f144020I;
                AbstractC19074t.m100207e(avatarImageView, "ivLeft");
                AvatarImageView.m55926k(avatarImageView, notification.m51052d().m51086d(), AbstractC27408c.zch_placeholder_avatar_channel, false, 4, null);
                this.f144020I.setCornerRadius(this.f144024M);
            }
            TextView textView = this.f144021J;
            AbstractC19074t.m100207e(textView, "tvTittle");
            AbstractC26112n.m134395e0(textView, notification.m51049a());
            String m51056h = notification.m51056h();
            m127128x = AbstractC24341v.m127128x(m51056h);
            if (!(!m127128x)) {
                m51056h = null;
            }
            if (m51056h != null) {
                InterfaceC22531b interfaceC22531b = (InterfaceC22531b) AbstractC0955d.m4496a(this.f7784p.getContext(), AbstractC19061k0.m100169b(InterfaceC22531b.class));
                if (interfaceC22531b != null) {
                    m131390w = AbstractC25358n.m131390w(new Integer[]{3, 5, 6, 7}, Integer.valueOf(notification.m51055g()));
                    if (m131390w) {
                        m51056h = "| " + m51056h;
                    }
                    charSequence = interfaceC22531b.mo4505b(m51056h, this.f144022K.getTextSize());
                } else {
                    charSequence = null;
                }
                if (charSequence != null) {
                    this.f144022K.setText(charSequence);
                    TextView textView2 = this.f144022K;
                    AbstractC19074t.m100207e(textView2, "tvSubTitle");
                    AbstractC26112n.m134431w0(textView2);
                    c24848g0 = C24848g0.f119245a;
                }
            }
            if (c24848g0 == null) {
                TextView textView3 = this.f144022K;
                AbstractC19074t.m100207e(textView3, "tvSubTitle");
                AbstractC26112n.m134367H(textView3);
            }
            this.f144023L.setText(AbstractC26105g.m134342i(notification.m51050b() * 1000, this.f7784p.getContext()));
            switch (notification.m51055g()) {
                case 2:
                    TextView textView4 = this.f144023L;
                    AbstractC19074t.m100207e(textView4, "tvTimestamp");
                    Context context = this.f7784p.getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    AbstractC26112n.m134401h0(textView4, C27280g.m139659b(context, AbstractC23322a.zch_ic_logo_channel_solid_16, AbstractC27406a.zch_icon_accent_blue));
                    return;
                case 3:
                    TextView textView5 = this.f144023L;
                    AbstractC19074t.m100207e(textView5, "tvTimestamp");
                    AbstractC26112n.m134399g0(textView5, AbstractC23322a.zch_ic_notification_comment_solid_16);
                    return;
                case 4:
                case 5:
                    TextView textView6 = this.f144023L;
                    AbstractC19074t.m100207e(textView6, "tvTimestamp");
                    AbstractC26112n.m134399g0(textView6, AbstractC23322a.zch_ic_notification_like_solid_16);
                    return;
                case 6:
                    TextView textView7 = this.f144023L;
                    AbstractC19074t.m100207e(textView7, "tvTimestamp");
                    AbstractC26112n.m134399g0(textView7, AbstractC23322a.zch_ic_notification_reply_solid_16);
                    return;
                case 7:
                    TextView textView8 = this.f144023L;
                    AbstractC19074t.m100207e(textView8, "tvTimestamp");
                    AbstractC26112n.m134399g0(textView8, AbstractC23322a.zch_ic_notification_mention_solid_16);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.z$g */
    /* loaded from: classes5.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final g f144025q = new g();

        g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo205i9(Notification notification) {
            AbstractC19074t.m100208f(notification, "entry");
            return notification.m51054f();
        }
    }

    /* renamed from: z10.z$h */
    /* loaded from: classes5.dex */
    static final class h extends AbstractC19075u implements InterfaceC18505l {
        h() {
            super(1);
        }

        /* renamed from: a */
        public final void m151973a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151961U = C31192z.this.m151961U();
            if (m151961U != null) {
                m151961U.mo54628m(view);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151973a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.z$i */
    /* loaded from: classes5.dex */
    static final class i extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ View f144028r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(View view) {
            super(1);
            this.f144028r = view;
        }

        /* renamed from: a */
        public final void m151974a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151961U = C31192z.this.m151961U();
            if (m151961U != null) {
                m151961U.mo54628m(this.f144028r);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151974a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.z$j */
    /* loaded from: classes5.dex */
    static final class j extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ View f144030r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(View view) {
            super(1);
            this.f144030r = view;
        }

        /* renamed from: a */
        public final void m151975a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151961U = C31192z.this.m151961U();
            if (m151961U != null) {
                m151961U.mo54628m(this.f144030r);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151975a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.z$k */
    /* loaded from: classes5.dex */
    static final class k extends AbstractC19075u implements InterfaceC18505l {
        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m151976a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151961U = C31192z.this.m151961U();
            if (m151961U != null) {
                m151961U.mo54628m(view);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151976a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.z$l */
    /* loaded from: classes5.dex */
    static final class l extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ View f144033r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(View view) {
            super(1);
            this.f144033r = view;
        }

        /* renamed from: a */
        public final void m151977a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151961U = C31192z.this.m151961U();
            if (m151961U != null) {
                m151961U.mo54628m(this.f144033r);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151977a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.z$m */
    /* loaded from: classes5.dex */
    static final class m extends AbstractC19075u implements InterfaceC18505l {
        m() {
            super(1);
        }

        /* renamed from: a */
        public final void m151978a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151961U = C31192z.this.m151961U();
            if (m151961U != null) {
                m151961U.mo54628m(view);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151978a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: z10.z$n */
    /* loaded from: classes5.dex */
    static final class n extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ View f144036r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(View view) {
            super(1);
            this.f144036r = view;
        }

        /* renamed from: a */
        public final void m151979a(View view) {
            AbstractC19074t.m100208f(view, "it");
            a m151961U = C31192z.this.m151961U();
            if (m151961U != null) {
                m151961U.mo54628m(this.f144036r);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m151979a((View) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.z$o */
    /* loaded from: classes5.dex */
    public static final class o extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f144037q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(1);
            this.f144037q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(Notification notification) {
            AbstractC19074t.m100208f(notification, "it");
            Notification.Payload m51085c = notification.m51051c().m51085c();
            String str = null;
            if (m51085c != null) {
                Parcelable m51076a = m51085c.m51076a();
                if (!(m51076a instanceof Notification.CommentPayload)) {
                    m51076a = null;
                }
                Notification.CommentPayload commentPayload = (Notification.CommentPayload) m51076a;
                if (commentPayload != null) {
                    str = commentPayload.m51065a();
                }
            }
            return Boolean.valueOf(AbstractC19074t.m100204b(str, this.f144037q));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z10.z$p */
    /* loaded from: classes5.dex */
    public static final class p extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f144038q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str) {
            super(1);
            this.f144038q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(Notification notification) {
            AbstractC19074t.m100208f(notification, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(notification.m51054f(), this.f144038q));
        }
    }

    public C31192z(String str) {
        super(10);
        this.f144001u = str;
        this.f144002v = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        this.f144004x = -1;
        this.f144005y = new ArrayList();
        this.f144006z = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final void m151957W(C31192z c31192z, View view, View view2) {
        AbstractC19074t.m100208f(c31192z, "this$0");
        AbstractC19074t.m100208f(view, "$v");
        a aVar = c31192z.f144003w;
        if (aVar != null) {
            aVar.mo54628m(view);
        }
    }

    /* renamed from: X */
    private final int m151958X(InterfaceC18505l interfaceC18505l) {
        Object m131207g0;
        Object m131207g02;
        int i11 = 0;
        for (Object obj : this.f144005y) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            int intValue = ((Number) obj).intValue();
            m131207g0 = AbstractC25332a0.m131207g0(this.f144006z, i11);
            Integer num = (Integer) m131207g0;
            if (num != null) {
                m131207g02 = AbstractC25332a0.m131207g0(this.f144002v.m51168m(), num.intValue());
                Notification notification = (Notification) m131207g02;
                if (notification != null && intValue != 3 && ((Boolean) interfaceC18505l.mo205i9(notification)).booleanValue()) {
                    return i11;
                }
            }
            i11 = i12;
        }
        return -1;
    }

    @Override // z10.AbstractC31153a0, androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        super.mo9990A(abstractC1876c0, i11);
        m151962V(abstractC1876c0, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: B */
    public void mo9991B(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11, List list) {
        Object m131207g0;
        Object m131207g02;
        Object m131206f0;
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        AbstractC19074t.m100208f(list, "payloads");
        super.mo9991B(abstractC1876c0, i11, list);
        if (abstractC1876c0 instanceof d) {
            m131207g0 = AbstractC25332a0.m131207g0(this.f144006z, i11);
            Integer num = (Integer) m131207g0;
            if (num != null) {
                m131207g02 = AbstractC25332a0.m131207g0(this.f144002v.m51168m(), num.intValue());
                Notification notification = (Notification) m131207g02;
                if (notification != null) {
                    m131206f0 = AbstractC25332a0.m131206f0(list);
                    if (AbstractC19074t.m100204b(m131206f0, "LIKE")) {
                        ((d) abstractC1876c0).m151970k0(notification.m51060l(), notification.m51057i());
                    } else if (AbstractC19074t.m100204b(m131206f0, "ACTION_FOLLOWED")) {
                        ((d) abstractC1876c0).m151969j0(notification.m51059k(), notification.m51058j());
                    } else if (AbstractC19074t.m100204b(m131206f0, "ACTION_REPLY")) {
                        ((d) abstractC1876c0).m151971l0(notification.m51061m(), notification.m51057i());
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 != 1) {
            if (i11 != 2) {
                return new c(AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_noti_group, false, 2, null));
            }
            if (!AbstractC19074t.m100204b(this.f144001u, "22") && !AbstractC19074t.m100204b(this.f144001u, "30")) {
                e eVar = new e(AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_noti_with_thumb, false, 2, null));
                View view = eVar.f7784p;
                AbstractC19074t.m100207e(view, "itemView");
                AbstractC26112n.m134407k0(view, new k());
                View findViewById = eVar.f7784p.findViewById(AbstractC27409d.ivLeft);
                if (findViewById != null) {
                    AbstractC19074t.m100205c(findViewById);
                    AbstractC26112n.m134407k0(findViewById, new l(findViewById));
                    return eVar;
                }
                return eVar;
            }
            d dVar = new d(AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_noti_reactive, false, 2, null), this.f144001u);
            View view2 = dVar.f7784p;
            AbstractC19074t.m100207e(view2, "itemView");
            AbstractC26112n.m134407k0(view2, new h());
            final View findViewById2 = dVar.f7784p.findViewById(AbstractC27409d.flLike);
            if (findViewById2 != null) {
                AbstractC19074t.m100205c(findViewById2);
                findViewById2.setOnClickListener(new View.OnClickListener() { // from class: z10.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        C31192z.m151957W(C31192z.this, findViewById2, view3);
                    }
                });
            }
            View findViewById3 = dVar.f7784p.findViewById(AbstractC27409d.btnReply);
            if (findViewById3 != null) {
                AbstractC19074t.m100205c(findViewById3);
                AbstractC26112n.m134407k0(findViewById3, new i(findViewById3));
            }
            View findViewById4 = dVar.f7784p.findViewById(AbstractC27409d.btnFollow);
            if (findViewById4 != null) {
                AbstractC19074t.m100205c(findViewById4);
                AbstractC26112n.m134407k0(findViewById4, new j(findViewById4));
                return dVar;
            }
            return dVar;
        }
        f fVar = new f(AbstractC26112n.m134372M(viewGroup, AbstractC27410e.zch_item_noti, false, 2, null));
        View view3 = fVar.f7784p;
        AbstractC19074t.m100207e(view3, "itemView");
        AbstractC26112n.m134407k0(view3, new m());
        View findViewById5 = fVar.f7784p.findViewById(AbstractC27409d.ivLeft);
        if (findViewById5 != null) {
            AbstractC19074t.m100205c(findViewById5);
            AbstractC26112n.m134407k0(findViewById5, new n(findViewById5));
            return fVar;
        }
        return fVar;
    }

    @Override // z10.AbstractC31153a0
    /* renamed from: P */
    public void mo151429P() {
        LoadMoreInfo m51171p;
        a aVar = this.f144003w;
        if (aVar == null || (m51171p = this.f144002v.m51171p()) == null) {
            return;
        }
        aVar.mo54623a(m51171p);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[LOOP:0: B:10:0x002f->B:20:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[SYNTHETIC] */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m151959S(Section section) {
        int i11;
        int i12;
        boolean m127128x;
        AbstractC19074t.m100208f(section, "newData");
        if (this.f144002v.m51175w() > 0) {
            i11 = this.f144002v.m51175w() - 1;
        } else {
            i11 = -1;
        }
        this.f144002v.m51163e(section, g.f144025q);
        int size = this.f144002v.m51168m().size() - 1;
        if (i11 >= size || (i12 = i11 + 1) > size) {
            return;
        }
        while (true) {
            Notification notification = (Notification) this.f144002v.m51168m().get(i12);
            if (this.f144004x != notification.m51053e()) {
                this.f144005y.add(3);
                this.f144006z.add(Integer.valueOf(notification.m51053e()));
                this.f144004x = notification.m51053e();
            }
            String m51086d = notification.m51051c().m51086d();
            if (m51086d != null) {
                m127128x = AbstractC24341v.m127128x(m51086d);
                if (!m127128x) {
                    this.f144005y.add(2);
                    this.f144006z.add(Integer.valueOf(i12));
                    if (i12 == size) {
                        i12++;
                    } else {
                        return;
                    }
                }
            }
            this.f144005y.add(1);
            this.f144006z.add(Integer.valueOf(i12));
            if (i12 == size) {
            }
        }
    }

    /* renamed from: T */
    public final void m151960T() {
        this.f144002v = new Section((List) null, 0L, (LoadMoreInfo) null, 7, (AbstractC19060k) null);
        this.f144005y.clear();
        this.f144006z.clear();
        this.f144004x = -1;
    }

    /* renamed from: U */
    public final a m151961U() {
        return this.f144003w;
    }

    /* renamed from: V */
    protected void m151962V(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        AbstractC19074t.m100208f(abstractC1876c0, "holder");
        if (abstractC1876c0 instanceof e) {
            List m51168m = this.f144002v.m51168m();
            Object obj = this.f144006z.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            ((e) abstractC1876c0).mo151968i0((Notification) m51168m.get(((Number) obj).intValue()));
            return;
        }
        if (abstractC1876c0 instanceof f) {
            Object obj2 = this.f144006z.get(i11);
            AbstractC19074t.m100207e(obj2, "get(...)");
            ((f) abstractC1876c0).mo151968i0((Notification) this.f144002v.m51168m().get(((Number) obj2).intValue()));
            return;
        }
        if (abstractC1876c0 instanceof c) {
            Object obj3 = this.f144006z.get(i11);
            AbstractC19074t.m100207e(obj3, "get(...)");
            ((c) abstractC1876c0).m151967i0(((Number) obj3).intValue());
        }
    }

    /* renamed from: Y */
    public final void m151963Y(a aVar) {
        this.f144003w = aVar;
    }

    /* renamed from: Z */
    public final void m151964Z(String str, boolean z11) {
        Object m131207g0;
        Object m131207g02;
        Notification.Payload m51085c;
        AbstractC19074t.m100208f(str, "channelId");
        int i11 = 0;
        for (Object obj : this.f144005y) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC25368s.m131509q();
            }
            int intValue = ((Number) obj).intValue();
            m131207g0 = AbstractC25332a0.m131207g0(this.f144006z, i11);
            Integer num = (Integer) m131207g0;
            if (num != null) {
                m131207g02 = AbstractC25332a0.m131207g0(this.f144002v.m51168m(), num.intValue());
                Notification notification = (Notification) m131207g02;
                if (notification != null && (m51085c = notification.m51052d().m51085c()) != null) {
                    Parcelable m51076a = m51085c.m51076a();
                    if (!(m51076a instanceof Channel)) {
                        m51076a = null;
                    }
                    Channel channel = (Channel) m51076a;
                    if (channel != null && intValue != 3 && AbstractC19074t.m100204b(channel.m50769l(), str)) {
                        channel.m50770l0(z11);
                        m10010r(i11, "ACTION_FOLLOWED");
                    }
                }
            }
            i11 = i12;
        }
    }

    /* renamed from: a0 */
    public final void m151965a0(String str, boolean z11) {
        Object m131207g0;
        Object m131207g02;
        AbstractC19074t.m100208f(str, "commentId");
        int m151958X = m151958X(new o(str));
        if (m151958X >= 0) {
            m131207g0 = AbstractC25332a0.m131207g0(this.f144006z, m151958X);
            Integer num = (Integer) m131207g0;
            if (num != null) {
                m131207g02 = AbstractC25332a0.m131207g0(this.f144002v.m51168m(), num.intValue());
                Notification notification = (Notification) m131207g02;
                if (notification != null) {
                    notification.m51064p(z11);
                }
            }
            m10010r(m151958X, "LIKE");
        }
    }

    /* renamed from: b0 */
    public final void m151966b0(String str) {
        Object m131207g0;
        Object m131207g02;
        int m151958X = m151958X(new p(str));
        if (m151958X >= 0) {
            m131207g0 = AbstractC25332a0.m131207g0(this.f144006z, m151958X);
            Integer num = (Integer) m131207g0;
            if (num != null) {
                m131207g02 = AbstractC25332a0.m131207g0(this.f144002v.m51168m(), num.intValue());
                Notification notification = (Notification) m131207g02;
                if (notification != null) {
                    notification.m51063o();
                }
            }
            m10010r(m151958X, "ACTION_REPLY");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f144005y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        Object obj = this.f144005y.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        return ((Number) obj).intValue();
    }
}
