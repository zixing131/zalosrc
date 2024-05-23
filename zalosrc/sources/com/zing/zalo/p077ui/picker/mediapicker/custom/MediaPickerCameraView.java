package com.zing.zalo.p077ui.picker.mediapicker.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.mediapicker.model.CameraPhotoItem;
import com.zing.zalo.data.mediapicker.model.CameraVideoItem;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.picker.mediapicker.custom.MediaPickerCameraView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23309i;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class MediaPickerCameraView extends FrameLayout implements View.OnClickListener {

    /* renamed from: A */
    private final InterfaceC24854k f66751A;

    /* renamed from: B */
    private int f66752B;

    /* renamed from: C */
    private InterfaceC12844a f66753C;

    /* renamed from: p */
    private final int f66754p;

    /* renamed from: q */
    private final boolean f66755q;

    /* renamed from: r */
    private final InterfaceC24854k f66756r;

    /* renamed from: s */
    private boolean f66757s;

    /* renamed from: t */
    private final ImageView f66758t;

    /* renamed from: u */
    private final RobotoTextView f66759u;

    /* renamed from: v */
    private final InterfaceC24854k f66760v;

    /* renamed from: w */
    private final InterfaceC24854k f66761w;

    /* renamed from: x */
    private final Drawable[] f66762x;

    /* renamed from: y */
    private Drawable f66763y;

    /* renamed from: z */
    private final InterfaceC24854k f66764z;

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12844a {
        void onClick(View view);
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraView$b */
    /* loaded from: classes6.dex */
    public static final class C12845b extends AnimatorListenerAdapter {
        C12845b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m72471b(MediaPickerCameraView mediaPickerCameraView) {
            AbstractC19074t.m100208f(mediaPickerCameraView, "this$0");
            mediaPickerCameraView.m72467n();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            if (MediaPickerCameraView.this.f66757s) {
                MediaPickerCameraView.this.m72466m();
                return;
            }
            Handler handler = MediaPickerCameraView.this.getHandler();
            if (handler != null) {
                final MediaPickerCameraView mediaPickerCameraView = MediaPickerCameraView.this;
                handler.post(new Runnable() { // from class: n90.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        MediaPickerCameraView.C12845b.m72471b(MediaPickerCameraView.this);
                    }
                });
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraView$c */
    /* loaded from: classes6.dex */
    public static final class C12846c extends AnimatorListenerAdapter {
        C12846c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            boolean z11;
            AbstractC19074t.m100208f(animator, "animation");
            if (MediaPickerCameraView.this.f66762x.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!(!z11)) {
                MediaPickerCameraView.this.m72466m();
                return;
            }
            MediaPickerCameraView mediaPickerCameraView = MediaPickerCameraView.this;
            mediaPickerCameraView.f66752B++;
            mediaPickerCameraView.f66752B %= MediaPickerCameraView.this.f66762x.length;
            MediaPickerCameraView.this.f66758t.setImageDrawable(MediaPickerCameraView.this.f66762x[MediaPickerCameraView.this.f66752B]);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraView$d */
    /* loaded from: classes6.dex */
    static final class C12847d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Context f66768r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12847d(Context context) {
            super(0);
            this.f66768r = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable mo12V4() {
            if (MediaPickerCameraView.this.f66755q) {
                return AbstractC23136l9.m118665N(this.f66768r, AbstractC16803z.im_postfeed_camera_n);
            }
            return AbstractC23136l9.m118665N(this.f66768r, AbstractC16803z.icn_gridmenu_open_camera_photo);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraView$e */
    /* loaded from: classes6.dex */
    static final class C12848e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: r */
        final /* synthetic */ Context f66770r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12848e(Context context) {
            super(0);
            this.f66770r = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable mo12V4() {
            if (MediaPickerCameraView.this.f66755q) {
                return AbstractC23136l9.m118665N(this.f66770r, AbstractC16803z.icn_gallery_video);
            }
            return AbstractC23136l9.m118665N(this.f66770r, AbstractC16803z.icn_gridmenu_open_camera_video);
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraView$f */
    /* loaded from: classes6.dex */
    static final class C12849f extends AbstractC19075u implements InterfaceC18494a {
        C12849f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnimatorSet mo12V4() {
            return MediaPickerCameraView.this.m72464k();
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraView$g */
    /* loaded from: classes6.dex */
    static final class C12850g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12850g f66772q = new C12850g();

        C12850g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gridmenu_camera);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
    }

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.custom.MediaPickerCameraView$h */
    /* loaded from: classes6.dex */
    static final class C12851h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C12851h f66773q = new C12851h();

        C12851h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_gridmenu_video_message);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            return m118743r0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerCameraView(Context context, int i11, boolean z11) {
        super(context);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(context, "context");
        this.f66754p = i11;
        this.f66755q = z11;
        m129210a = AbstractC24856m.m129210a(new C12849f());
        this.f66756r = m129210a;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setColorFilter(C23212s8.m119607o(context, AbstractC16781w.NormalIcon3), PorterDuff.Mode.SRC_ATOP);
        imageView.setVisibility(0);
        this.f66758t = imageView;
        RobotoTextView robotoTextView = new RobotoTextView(context);
        robotoTextView.setTextSize(1, 14.0f);
        robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
        this.f66759u = robotoTextView;
        m129210a2 = AbstractC24856m.m129210a(new C12847d(context));
        this.f66760v = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C12848e(context));
        this.f66761w = m129210a3;
        this.f66762x = new Drawable[]{getDrawablePhoto(), AbstractC23136l9.m118665N(context, AbstractC16803z.icn_header_editphoto_editdocument)};
        m129210a4 = AbstractC24856m.m129210a(C12850g.f66772q);
        this.f66764z = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(C12851h.f66773q);
        this.f66751A = m129210a5;
        m72465l();
    }

    private final Drawable getDrawablePhoto() {
        return (Drawable) this.f66760v.getValue();
    }

    private final Drawable getDrawableVideo() {
        return (Drawable) this.f66761w.getValue();
    }

    private final AnimatorSet getImageAnimatorSet() {
        return (AnimatorSet) this.f66756r.getValue();
    }

    private final String getStrCamera() {
        return (String) this.f66764z.getValue();
    }

    private final String getStrVideo() {
        return (String) this.f66751A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final AnimatorSet m72464k() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f66758t, "scaleX", 1.0f, 0.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f66758t, "scaleY", 1.0f, 0.0f);
        animatorSet.addListener(new C12846c());
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(350L);
        animatorSet.setStartDelay(1000L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f66758t, "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f66758t, "scaleY", 0.0f, 1.0f));
        animatorSet2.setDuration(350L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animatorSet).before(animatorSet2);
        animatorSet3.addListener(new C12845b());
        return animatorSet3;
    }

    /* renamed from: l */
    private final void m72465l() {
        View view = this.f66758t;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f), 17);
        layoutParams.bottomMargin = AbstractC23136l9.m118742r(10.0f);
        C24848g0 c24848g0 = C24848g0.f119245a;
        addView(view, layoutParams);
        View view2 = this.f66759u;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 17);
        layoutParams2.topMargin = AbstractC23136l9.m118742r(15.0f);
        addView(view2, layoutParams2);
        this.f66763y = getDrawablePhoto();
        m72466m();
        setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m72466m() {
        ImageView imageView = this.f66758t;
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        imageView.setVisibility(0);
        imageView.setImageDrawable(this.f66763y);
        this.f66752B = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final void m72467n() {
        AnimatorSet imageAnimatorSet = getImageAnimatorSet();
        if (!imageAnimatorSet.isRunning()) {
            imageAnimatorSet.start();
        }
    }

    /* renamed from: p */
    private final void m72468p() {
        this.f66757s = true;
        AnimatorSet imageAnimatorSet = getImageAnimatorSet();
        imageAnimatorSet.end();
        imageAnimatorSet.removeAllListeners();
        m72466m();
    }

    public final InterfaceC12844a getModuleViewItemListener() {
        return this.f66753C;
    }

    /* renamed from: j */
    public final void m72469j(MediaItem mediaItem) {
        boolean z11;
        AbstractC19074t.m100208f(mediaItem, "mediaItem");
        if (mediaItem instanceof CameraPhotoItem) {
            int i11 = this.f66754p;
            if ((i11 == 3 || i11 == 16) && AbstractC23309i.m121145L1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f66763y = getDrawablePhoto();
            if (z11) {
                m72467n();
            } else {
                m72468p();
            }
            this.f66759u.setText(getStrCamera());
            return;
        }
        if (mediaItem instanceof CameraVideoItem) {
            this.f66763y = getDrawableVideo();
            m72468p();
            this.f66759u.setText(getStrVideo());
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, "view");
        m72468p();
        InterfaceC12844a interfaceC12844a = this.f66753C;
        if (interfaceC12844a != null) {
            interfaceC12844a.onClick(view);
        }
    }

    public final void setModuleViewItemListener(InterfaceC12844a interfaceC12844a) {
        this.f66753C = interfaceC12844a;
    }
}
