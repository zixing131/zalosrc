package com.zing.zalo.p077ui.chat.widget.attachment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.chat.widget.attachment.ChatAttachmentContainer;
import com.zing.zalo.p077ui.moduleview.csc.ChatAttachmentLinkModulesView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.ReplyThumbImageView;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17978l0;
import dj.C17990p0;
import dj.C17997r1;
import dj.C18009w0;
import dj.C18013y0;
import gw.AbstractC19620d0;
import gw.C19660u0;
import ho0.AbstractC20110a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p471r3.C25630b;
import p560uw.EnumC27374a;
import p588vw.C28644j;
import p698yz.AbstractC31111g;
import p732zy.C32596l;
import ui0.C27280g;
import vg.AbstractC28236y3;
import vg.C28020b3;

/* loaded from: classes5.dex */
public class ChatAttachmentContainer extends LinearLayout {

    /* renamed from: p */
    C23528a f60951p;

    /* renamed from: q */
    LayoutInflater f60952q;

    /* renamed from: r */
    Map f60953r;

    /* renamed from: s */
    InterfaceC11727b f60954s;

    /* renamed from: t */
    boolean f60955t;

    /* renamed from: com.zing.zalo.ui.chat.widget.attachment.ChatAttachmentContainer$a */
    /* loaded from: classes5.dex */
    public class C11726a extends C23999j {
        C11726a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (interfaceC3968a instanceof ImageView) {
                    ((ImageView) interfaceC3968a).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                }
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.attachment.ChatAttachmentContainer$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11727b {
        /* renamed from: e4 */
        void mo60381e4(C11728c c11728c);

        /* renamed from: ti */
        void mo60382ti(C11728c c11728c);

        /* renamed from: um */
        void mo60383um(C11728c c11728c);
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.attachment.ChatAttachmentContainer$d */
    /* loaded from: classes5.dex */
    public class ViewOnClickListenerC11729d implements View.OnClickListener {

        /* renamed from: p */
        C11728c f60965p;

        public ViewOnClickListenerC11729d(C11728c c11728c) {
            this.f60965p = c11728c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            InterfaceC11727b interfaceC11727b = ChatAttachmentContainer.this.f60954s;
            if (interfaceC11727b != null) {
                interfaceC11727b.mo60383um(this.f60965p);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.attachment.ChatAttachmentContainer$e */
    /* loaded from: classes5.dex */
    public class ViewOnClickListenerC11730e implements View.OnClickListener {

        /* renamed from: p */
        C11728c f60967p;

        public ViewOnClickListenerC11730e(C11728c c11728c) {
            this.f60967p = c11728c;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC23647d.m123906p("1000405");
            ChatAttachmentContainer.this.m65320k(this.f60967p);
            AbstractC23647d.m123893c();
        }
    }

    public ChatAttachmentContainer(Context context, boolean z11) {
        super(context);
        this.f60955t = z11;
        m65312g(context);
    }

    /* renamed from: c */
    private View m65311c(C11728c c11728c) {
        Drawable m139658a;
        if (c11728c.m65329g() == null) {
            return null;
        }
        try {
            View inflate = this.f60952q.inflate(AbstractC7409c0.chat_attachment_reply_msg, (ViewGroup) this, false);
            TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.reply_name);
            TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.reply_text);
            ReplyThumbImageView replyThumbImageView = (ReplyThumbImageView) inflate.findViewById(AbstractC6918a0.reply_image);
            View findViewById = inflate.findViewById(AbstractC6918a0.reply_delete_button);
            replyThumbImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            replyThumbImageView.setImageResource(AbstractC16803z.ic_rolled_photo_padding);
            replyThumbImageView.post(new Runnable() { // from class: j60.a
                public /* synthetic */ RunnableC20937a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChatAttachmentContainer.m65313i(ReplyThumbImageView.this);
                }
            });
            C17997r1 m65329g = c11728c.m65329g();
            if (m65329g != null) {
                C19660u0 m102704x = AbstractC19620d0.m102704x(m65329g, null);
                String m103092b = m102704x.m103092b();
                if (TextUtils.isEmpty(m103092b)) {
                    m103092b = "";
                }
                textView.setText(m103092b);
                textView2.setText(m102704x.m103091a());
                if (c11728c.m65331j() && (m139658a = C27280g.m139658a(getContext(), AbstractC23322a.zds_oic_oa_star_check_color_24)) != null) {
                    int i11 = AbstractC23222t7.f112586t;
                    m139658a.setBounds(0, 0, i11, i11);
                    textView.setCompoundDrawablePadding(AbstractC23222t7.f112552c);
                    textView.setCompoundDrawables(null, null, m139658a, null);
                }
                if (TextUtils.isEmpty(m102704x.m103091a())) {
                    textView2.setVisibility(8);
                }
                m65314j(m65329g, replyThumbImageView);
            }
            findViewById.setOnClickListener(new ViewOnClickListenerC11730e(c11728c));
            return inflate;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: g */
    private void m65312g(Context context) {
        this.f60953r = Collections.synchronizedMap(new HashMap());
        this.f60951p = new C23528a(context);
        this.f60952q = LayoutInflater.from(context);
    }

    /* renamed from: i */
    public static /* synthetic */ void m65313i(ReplyThumbImageView replyThumbImageView) {
        replyThumbImageView.getLayoutParams().width = replyThumbImageView.getHeight();
        replyThumbImageView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m65314j(C17997r1 c17997r1, ReplyThumbImageView replyThumbImageView) {
        C17945a0 m2635r;
        C18009w0 c18009w0;
        try {
            C17969i0 m95690g = c17997r1.m95690g();
            int m95687d = c17997r1.m95687d();
            if (m95687d == 44) {
                replyThumbImageView.setImageResource(AbstractC16803z.ic_rolled_video_padding);
            } else {
                replyThumbImageView.setImageResource(AbstractC16803z.ic_rolled_photo_padding);
            }
            Drawable drawable = null;
            if (m95687d != 32 && m95687d != 37 && m95687d != 44 && m95687d != 49 && m95687d != 38) {
                m2635r = null;
                if (m95687d != 1 && m95687d != 41) {
                    if (m95687d == 49) {
                        if (m95687d != 52 && m95687d != 56 && m95687d != 59) {
                            if (m95687d != 31) {
                                String str = "";
                                if (m95687d != 32) {
                                    switch (m95687d) {
                                        case 36:
                                            if (c17997r1.m95694k() != null) {
                                                C25630b m143282P0 = C28644j.m143233Y().m143282P0(c17997r1.m95694k());
                                                if (m143282P0.m132448z()) {
                                                    Bitmap m141206w = C28020b3.f130648a.m141206w(m143282P0);
                                                    if (m141206w != null) {
                                                        replyThumbImageView.setImageBitmap(m141206w);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (C25630b.m132391I(m143282P0)) {
                                                    ((C23528a) this.f60951p.m123612r(replyThumbImageView)).m123579C(m143282P0.m132444v(), C23278z2.m120068F(), new C11726a());
                                                    return;
                                                } else {
                                                    C28020b3.f130648a.m141182F(replyThumbImageView, this.f60951p, m143282P0, null, false, null);
                                                    return;
                                                }
                                            }
                                            return;
                                        case 37:
                                            if (m2635r != null && !TextUtils.isEmpty(m2635r.m94983Q3())) {
                                                str = m2635r.m94983Q3();
                                            } else if (!AbstractC31111g.m151137r(c17997r1)) {
                                                if (m95690g != null && !TextUtils.isEmpty(m95690g.f91014s)) {
                                                    str = m95690g.f91014s;
                                                }
                                            } else {
                                                return;
                                            }
                                            ((C23528a) this.f60951p.m123612r(replyThumbImageView)).m123618x(str, C23278z2.m120122e());
                                            return;
                                        case 38:
                                            if (m95690g != null) {
                                                if (m2635r.m95026V0()) {
                                                    if (!TextUtils.isEmpty(m2635r.m94983Q3())) {
                                                        str = m2635r.m94983Q3();
                                                    } else {
                                                        str = m95690g.f91013r;
                                                    }
                                                }
                                                if (!TextUtils.isEmpty(str)) {
                                                    ((C23528a) this.f60951p.m123612r(replyThumbImageView)).m123618x(str, C23278z2.m120122e());
                                                    return;
                                                } else {
                                                    replyThumbImageView.setVisibility(8);
                                                    return;
                                                }
                                            }
                                            return;
                                        default:
                                            switch (m95687d) {
                                                case 43:
                                                    replyThumbImageView.setImageResource(AbstractC16803z.icon_quote_location);
                                                    return;
                                                case ZVideoUtilMetadata.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                                    if (!AbstractC31111g.m151137r(c17997r1) && m95690g != null && !TextUtils.isEmpty(m95690g.f91013r)) {
                                                        ((C23528a) this.f60951p.m123612r(replyThumbImageView)).m123618x(m95690g.f91013r, C23278z2.m120122e());
                                                        return;
                                                    }
                                                    return;
                                                case 45:
                                                    break;
                                                case 46:
                                                    if (m95690g instanceof C17990p0) {
                                                        C17990p0 c17990p0 = (C17990p0) m95690g;
                                                        if (c17990p0.m95670k()) {
                                                            drawable = AbstractC23136l9.m118665N(replyThumbImageView.getContext(), AbstractC16803z.icn_folder);
                                                        } else {
                                                            drawable = AbstractC28236y3.m142197h(replyThumbImageView.getContext(), c17990p0.f91115D);
                                                        }
                                                    }
                                                    replyThumbImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                                    replyThumbImageView.setImageDrawable(drawable);
                                                    return;
                                                default:
                                                    return;
                                            }
                                    }
                                } else {
                                    if (!TextUtils.isEmpty(m2635r.m94983Q3())) {
                                        str = m2635r.m94983Q3();
                                    } else if (!AbstractC31111g.m151137r(c17997r1)) {
                                        if (m95690g != null) {
                                            if (m95690g instanceof C18009w0) {
                                                c18009w0 = (C18009w0) m95690g;
                                            } else {
                                                c18009w0 = new C18009w0(new JSONObject(c17997r1.m95686c()));
                                            }
                                            str = c18009w0.mo95597e();
                                        }
                                    } else {
                                        return;
                                    }
                                    ((C23528a) this.f60951p.m123612r(replyThumbImageView)).m123618x(str, C23278z2.m120122e());
                                    return;
                                }
                            } else {
                                replyThumbImageView.setImageDrawable(AbstractC23136l9.m118665N(replyThumbImageView.getContext(), AbstractC16803z.icon_quote_voice));
                                return;
                            }
                        }
                    } else {
                        if (m95690g != null && !TextUtils.isEmpty(m95690g.f91013r)) {
                            ((C23528a) this.f60951p.m123612r(replyThumbImageView)).m123618x(m95690g.f91013r, C23278z2.m120122e());
                            return;
                        }
                        return;
                    }
                }
                replyThumbImageView.setVisibility(8);
            }
            m2635r = AbstractC23306f.m120584H0().m2635r(c17997r1.m95689f());
            if (m2635r == null || m2635r.m94959N6()) {
                return;
            }
            if (m95687d != 1) {
                if (m95687d == 49) {
                }
            }
            replyThumbImageView.setVisibility(8);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: b */
    public void m65315b(C11728c c11728c) {
        String str;
        C32596l.c.C33080c m157839b;
        if (c11728c != null) {
            try {
                m65316d();
                View view = null;
                view = null;
                view = null;
                view = null;
                view = null;
                view = null;
                view = null;
                switch (c11728c.m65330h()) {
                    case 1:
                    case 2:
                    case 6:
                        if (!TextUtils.isEmpty(c11728c.m65326d())) {
                            View inflate = this.f60952q.inflate(AbstractC7409c0.chat_attachment_item, (ViewGroup) this, false);
                            RecyclingImageView recyclingImageView = (RecyclingImageView) inflate.findViewById(AbstractC6918a0.chat_attachment_photo);
                            recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            inflate.findViewById(AbstractC6918a0.chat_attachment_delete).setOnClickListener(new ViewOnClickListenerC11730e(c11728c));
                            inflate.setOnClickListener(new ViewOnClickListenerC11729d(c11728c));
                            recyclingImageView.setImageResource(AbstractC16803z.no_image2);
                            ((C23528a) this.f60951p.m123612r(recyclingImageView)).m123618x(c11728c.m65326d(), C23278z2.m120120d0());
                            view = inflate;
                            break;
                        }
                        break;
                    case 3:
                        ChatAttachmentLinkModulesView chatAttachmentLinkModulesView = new ChatAttachmentLinkModulesView(getContext());
                        chatAttachmentLinkModulesView.m69740V(c11728c, new ViewOnClickListenerC11730e(c11728c));
                        chatAttachmentLinkModulesView.setOnClickListener(new ViewOnClickListenerC11729d(c11728c));
                        view = chatAttachmentLinkModulesView;
                        break;
                    case 4:
                        view = m65311c(c11728c);
                        break;
                    case 5:
                        if (c11728c.m65328f() != null && c11728c.m65328f().f91253D != null) {
                            C18013y0 m65328f = c11728c.m65328f();
                            String str2 = m65328f.f91011p;
                            String str3 = m65328f.f91013r;
                            C17978l0 c17978l0 = m65328f.f91253D;
                            if (c17978l0 != null) {
                                str = c17978l0.f91053a;
                            } else {
                                str = "";
                            }
                            String str4 = m65328f.f91017v;
                            View inflate2 = this.f60952q.inflate(AbstractC7409c0.chat_attachment_contact_profile_item, (ViewGroup) this, false);
                            RecyclingImageView recyclingImageView2 = (RecyclingImageView) inflate2.findViewById(AbstractC6918a0.avatar);
                            recyclingImageView2.setImageResource(AbstractC16803z.no_image2);
                            ((C23528a) this.f60951p.m123612r(recyclingImageView2)).m123618x(str3, C23278z2.m120143n());
                            if (!str4.equals(CoreUtility.f89233i)) {
                                str2 = AbstractC21935u.m114539f(AbstractC23056e6.m118285k(str), str4, str2);
                            }
                            ((RobotoTextView) inflate2.findViewById(AbstractC6918a0.profile_name)).setText(str2);
                            ((RobotoTextView) inflate2.findViewById(AbstractC6918a0.phone_number)).setText(str);
                            inflate2.findViewById(AbstractC6918a0.delete).setOnClickListener(new ViewOnClickListenerC11730e(c11728c));
                            inflate2.setOnClickListener(new ViewOnClickListenerC11729d(c11728c));
                            view = inflate2;
                            break;
                        }
                        break;
                    case 7:
                        C32596l.b m65327e = c11728c.m65327e();
                        if (m65327e != null && (m157839b = m65327e.m157839b()) != null) {
                            String m157851f = m157839b.m157851f();
                            if (!TextUtils.isEmpty(m157851f)) {
                                View inflate3 = this.f60952q.inflate(AbstractC7409c0.chat_attachment_item, (ViewGroup) this, false);
                                RecyclingImageView recyclingImageView3 = (RecyclingImageView) inflate3.findViewById(AbstractC6918a0.chat_attachment_photo);
                                recyclingImageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                inflate3.findViewById(AbstractC6918a0.chat_attachment_delete).setOnClickListener(new ViewOnClickListenerC11730e(c11728c));
                                inflate3.setOnClickListener(new ViewOnClickListenerC11729d(c11728c));
                                recyclingImageView3.setImageResource(AbstractC16803z.no_image2);
                                ((C23528a) this.f60951p.m123612r(recyclingImageView3)).m123618x(m157851f, C23278z2.m120120d0());
                                view = inflate3;
                                break;
                            }
                        }
                        break;
                }
                if (view != null) {
                    addView(view);
                    this.f60953r.put(c11728c, view);
                    setVisibility(0);
                    InterfaceC11727b interfaceC11727b = this.f60954s;
                    if (interfaceC11727b != null) {
                        interfaceC11727b.mo60382ti(c11728c);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    public void m65316d() {
        try {
            this.f60953r.clear();
            removeAllViews();
            setVisibility(8);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public boolean m65317e(int i11) {
        Map map = this.f60953r;
        if (map != null && map.size() != 0) {
            try {
                Iterator it = this.f60953r.keySet().iterator();
                while (it.hasNext()) {
                    if (((C11728c) it.next()).m65330h() == i11) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean m65318f() {
        Map map = this.f60953r;
        if (map != null && map.size() != 0) {
            try {
                for (C11728c c11728c : this.f60953r.keySet()) {
                    if (c11728c.m65330h() == 3 && c11728c.m65332k()) {
                        return true;
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    public Set<C11728c> getMediaAttachment() {
        try {
            return this.f60953r.keySet();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public Map<C11728c, View> getMediaAttachmentMap() {
        return this.f60953r;
    }

    /* renamed from: h */
    public boolean m65319h() {
        Map map = this.f60953r;
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void m65320k(C11728c c11728c) {
        try {
            if (this.f60955t) {
                Map map = this.f60953r;
                if (map != null && !map.isEmpty() && c11728c != null) {
                    View view = (View) this.f60953r.remove(c11728c);
                    if (view != null) {
                        removeView(view);
                    }
                    if (getChildCount() == 0) {
                        setVisibility(8);
                    }
                }
                return;
            }
            InterfaceC11727b interfaceC11727b = this.f60954s;
            if (interfaceC11727b != null) {
                interfaceC11727b.mo60381e4(c11728c);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: l */
    public void m65321l(C11728c c11728c) {
        View view = (View) this.f60953r.get(c11728c);
        if (view instanceof ChatAttachmentLinkModulesView) {
            ((ChatAttachmentLinkModulesView) view).m69740V(c11728c, new ViewOnClickListenerC11730e(c11728c));
        }
    }

    public void setAttachmentListener(InterfaceC11727b interfaceC11727b) {
        this.f60954s = interfaceC11727b;
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.attachment.ChatAttachmentContainer$c */
    /* loaded from: classes5.dex */
    public static class C11728c {

        /* renamed from: a */
        private int f60957a;

        /* renamed from: b */
        private String f60958b;

        /* renamed from: c */
        private C18013y0 f60959c;

        /* renamed from: d */
        private C17997r1 f60960d;

        /* renamed from: e */
        private boolean f60961e;

        /* renamed from: f */
        private C32596l.b f60962f;

        /* renamed from: g */
        private EnumC27374a f60963g;

        /* renamed from: h */
        public String f60964h;

        public C11728c(int i11) {
            this.f60963g = EnumC27374a.f128964q;
            this.f60964h = "00:00";
            this.f60957a = i11;
        }

        /* renamed from: a */
        public static int m65322a(C17945a0 c17945a0) {
            if (c17945a0.m95041W4() == 2) {
                return 6;
            }
            if (c17945a0.m95041W4() != 3 || !c17945a0.m94868D3().isEmpty()) {
                return 2;
            }
            return 1;
        }

        /* renamed from: b */
        public static int m65323b(int i11) {
            if (i11 == 1) {
                return 3;
            }
            if (i11 != 2) {
                return i11 != 6 ? 10000 : 2;
            }
            return 4;
        }

        /* renamed from: i */
        public static boolean m65324i(int i11) {
            return i11 == 1 || i11 == 2 || i11 == 6;
        }

        /* renamed from: c */
        public EnumC27374a m65325c() {
            return this.f60963g;
        }

        /* renamed from: d */
        public String m65326d() {
            return this.f60958b;
        }

        /* renamed from: e */
        public C32596l.b m65327e() {
            return this.f60962f;
        }

        /* renamed from: f */
        public C18013y0 m65328f() {
            return this.f60959c;
        }

        /* renamed from: g */
        public C17997r1 m65329g() {
            return this.f60960d;
        }

        /* renamed from: h */
        public int m65330h() {
            return this.f60957a;
        }

        /* renamed from: j */
        public boolean m65331j() {
            return this.f60961e;
        }

        /* renamed from: k */
        public boolean m65332k() {
            if (m65325c() != EnumC27374a.f128968u && m65325c() != EnumC27374a.f128967t) {
                return false;
            }
            return true;
        }

        /* renamed from: l */
        public void m65333l(EnumC27374a enumC27374a) {
            this.f60963g = enumC27374a;
        }

        /* renamed from: m */
        public void m65334m(boolean z11) {
            this.f60961e = z11;
        }

        /* renamed from: n */
        public void m65335n(C17997r1 c17997r1) {
            this.f60960d = c17997r1;
        }

        /* renamed from: o */
        public void m65336o(C18013y0 c18013y0) {
            this.f60959c = c18013y0;
        }

        public C11728c(int i11, String str) {
            this.f60963g = EnumC27374a.f128964q;
            this.f60964h = "00:00";
            this.f60957a = i11;
            this.f60958b = str;
        }

        public C11728c(C18013y0 c18013y0) {
            this.f60963g = EnumC27374a.f128964q;
            this.f60964h = "00:00";
            this.f60958b = "";
            this.f60959c = c18013y0;
            if ("recommened.link".equals(c18013y0.f91016u)) {
                this.f60957a = 3;
            } else if ("recommened.user".equals(this.f60959c.f91016u)) {
                this.f60957a = 5;
            }
        }

        public C11728c(C32596l.b bVar) {
            this.f60963g = EnumC27374a.f128964q;
            this.f60964h = "00:00";
            this.f60957a = 7;
            this.f60962f = bVar;
        }
    }

    public ChatAttachmentContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60955t = true;
        m65312g(context);
    }
}
