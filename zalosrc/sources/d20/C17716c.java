package d20;

import android.graphics.drawable.Drawable;
import b10.AbstractC2487f;
import com.zing.zalo.shortvideo.data.model.C9440a;
import com.zing.zalo.shortvideo.data.model.Comment;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.LiveCommentItemView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.SimpleShadowTextView;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import on0.AbstractC24342w;
import p021an.AbstractC0955d;
import p328ln.InterfaceC22531b;
import q10.C25065x;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;

/* renamed from: d20.c */
/* loaded from: classes5.dex */
public final class C17716c extends AbstractC17714a {

    /* renamed from: J */
    private final C25065x f89800J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C17716c(C25065x c25065x) {
        super(r0);
        AbstractC19074t.m100208f(c25065x, "binding");
        LiveCommentItemView root = c25065x.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        this.f89800J = c25065x;
    }

    /* renamed from: k0 */
    private final void m93791k0(C9440a c9440a, Comment.Identity identity) {
        CharSequence m127168X0;
        C25065x c25065x = this.f89800J;
        String str = null;
        if (identity.m50859i()) {
            AvatarImageView avatarImageView = c25065x.f120403q;
            AbstractC19074t.m100207e(avatarImageView, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView, identity.m50854d(), identity.m50855e(), identity.m50853c(), AbstractC27408c.zch_placeholder_avatar_channel, false, 16, null);
            AvatarImageView avatarImageView2 = c25065x.f120403q;
            AbstractC19074t.m100207e(this.f89800J.getRoot(), "getRoot(...)");
            avatarImageView2.setCornerRadius(AbstractC26112n.m134433y(r5, AbstractC27407b.zch_radius_4dp));
            c25065x.f120403q.setChannelIconVisible(true);
            c25065x.f120406t.setText(identity.m50855e());
            c25065x.f120406t.setVerifiedIcon(identity.m50857g());
            SimpleShadowTextView simpleShadowTextView = c25065x.f120404r;
            AbstractC19074t.m100207e(simpleShadowTextView, "tagAuthor");
            AbstractC26112n.m134431w0(simpleShadowTextView);
        } else {
            AvatarImageView avatarImageView3 = c25065x.f120403q;
            AbstractC19074t.m100207e(avatarImageView3, "aivAvatar");
            AvatarImageView.m55927l(avatarImageView3, identity.m50854d(), identity.m50855e(), identity.m50853c(), AbstractC27408c.zch_placeholder_avatar_user, false, 16, null);
            c25065x.f120403q.setChannelIconVisible(false);
            c25065x.f120403q.setCornerRadius(Float.MAX_VALUE);
            c25065x.f120406t.setMarker((Drawable) null);
            c25065x.f120406t.setText(identity.m50855e());
            SimpleShadowTextView simpleShadowTextView2 = c25065x.f120404r;
            AbstractC19074t.m100207e(simpleShadowTextView2, "tagAuthor");
            AbstractC26112n.m134367H(simpleShadowTextView2);
        }
        if (c9440a.m51402e()) {
            c25065x.f120405s.setTextSize(1, 13.0f);
            c25065x.f120406t.setTextSize(1, 13.0f);
        } else {
            c25065x.f120405s.setTextSize(1, 14.0f);
            c25065x.f120406t.setTextSize(1, 14.0f);
        }
        if (c9440a.m51404g()) {
            c25065x.f120405s.setText(c9440a.m51408k());
            SimpleShadowTextView simpleShadowTextView3 = c25065x.f120405s;
            AbstractC19074t.m100207e(simpleShadowTextView3, "txtContent");
            simpleShadowTextView3.setTextColor(AbstractC26112n.m134426u(simpleShadowTextView3, AbstractC27406a.zch_ripple));
            return;
        }
        SimpleShadowTextView simpleShadowTextView4 = c25065x.f120405s;
        String m51399b = c9440a.m51399b();
        if (m51399b != null) {
            m127168X0 = AbstractC24342w.m127168X0(m51399b);
            str = m127168X0.toString();
        }
        simpleShadowTextView4.setText(m93792l0(str, c25065x.f120405s.getTextSize()));
        SimpleShadowTextView simpleShadowTextView5 = c25065x.f120405s;
        AbstractC19074t.m100207e(simpleShadowTextView5, "txtContent");
        simpleShadowTextView5.setTextColor(AbstractC26112n.m134426u(simpleShadowTextView5, AbstractC27406a.zch_text_primary));
    }

    /* renamed from: l0 */
    private final CharSequence m93792l0(String str, float f11) {
        InterfaceC22531b interfaceC22531b = (InterfaceC22531b) AbstractC0955d.m4496a(this.f7784p.getContext(), AbstractC19061k0.m100169b(InterfaceC22531b.class));
        if (interfaceC22531b != null) {
            if (str == null) {
                str = "";
            }
            return interfaceC22531b.mo4505b(str, f11);
        }
        return null;
    }

    @Override // d20.AbstractC17714a
    /* renamed from: i0 */
    public void mo93789i0(AbstractC2487f abstractC2487f) {
        C9440a c9440a;
        Comment.Identity m51400c;
        AbstractC19074t.m100208f(abstractC2487f, "data");
        if (abstractC2487f instanceof C9440a) {
            c9440a = (C9440a) abstractC2487f;
        } else {
            c9440a = null;
        }
        if (c9440a != null && (m51400c = c9440a.m51400c()) != null) {
            m93791k0(c9440a, m51400c);
        }
    }
}
