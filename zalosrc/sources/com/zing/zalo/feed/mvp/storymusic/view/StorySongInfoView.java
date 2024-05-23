package com.zing.zalo.feed.mvp.storymusic.view;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import bo.EnumC3057x2;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.models.SongInfo;
import com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.SlideShowSound;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16662u0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kr.InterfaceC21910a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mr.InterfaceC23431j;
import p509sp.C26361j;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class StorySongInfoView extends RelativeLayout {

    /* renamed from: p */
    private final InterfaceC24854k f47075p;

    /* renamed from: q */
    private final InterfaceC24854k f47076q;

    /* renamed from: r */
    private final InterfaceC24854k f47077r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorySongInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        m129210a = AbstractC24856m.m129210a(new C8789a(this));
        this.f47075p = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C8790b(this));
        this.f47076q = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(new C8791c(this));
        this.f47077r = m129210a3;
    }

    /* renamed from: d */
    private final void m47000d(InterfaceC21910a interfaceC21910a, InterfaceC23431j interfaceC23431j) {
        getDetailView().setVisibility(0);
        getErrorView().setVisibility(8);
        getLoadingView().setVisibility(8);
        getDetailView().m47008b(interfaceC21910a, interfaceC23431j);
    }

    /* renamed from: e */
    private final void m47001e(final InterfaceC21910a interfaceC21910a, final InterfaceC23431j interfaceC23431j) {
        getErrorView().setVisibility(0);
        getDetailView().setVisibility(8);
        getLoadingView().setVisibility(8);
        getErrorView().setOnClickListener(new View.OnClickListener() { // from class: mr.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StorySongInfoView.m47002f(InterfaceC21910a.this, interfaceC23431j, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m47002f(InterfaceC21910a interfaceC21910a, InterfaceC23431j interfaceC23431j, View view) {
        if (interfaceC21910a != null && interfaceC23431j != null) {
            interfaceC23431j.mo84688Ug(interfaceC21910a.mo46940d(), new SongInfo(interfaceC21910a.mo14159b(), interfaceC21910a.mo14160c().mo14227a(), interfaceC21910a.mo14161e().mo14188a()), interfaceC21910a.mo14160c().getState());
        }
    }

    /* renamed from: g */
    private final void m47003g() {
        getLoadingView().setVisibility(0);
        getErrorView().setVisibility(8);
        getDetailView().setVisibility(8);
    }

    private final DetailView getDetailView() {
        return (DetailView) this.f47075p.getValue();
    }

    private final ErrorView getErrorView() {
        return (ErrorView) this.f47076q.getValue();
    }

    private final LoadingView getLoadingView() {
        return (LoadingView) this.f47077r.getValue();
    }

    /* renamed from: b */
    public final void m47004b(InterfaceC21910a interfaceC21910a, InterfaceC23431j interfaceC23431j) {
        AbstractC19074t.m100208f(interfaceC21910a, "storyMusicData");
        if (interfaceC21910a.mo14160c().isValid()) {
            m47000d(interfaceC21910a, interfaceC23431j);
        } else if (interfaceC21910a.mo14160c().mo14231e()) {
            m47001e(interfaceC21910a, interfaceC23431j);
        } else {
            m47003g();
        }
    }

    /* renamed from: c */
    public final void m47005c() {
        getDetailView().m47009d();
        getErrorView().m47014a();
        getLoadingView().m47019b();
        addView(getDetailView());
        addView(getErrorView());
        addView(getLoadingView());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getLoadingView().getVisibility() == 0) {
            getLoadingView().m47021e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getLoadingView().getVisibility() == 0) {
            getLoadingView().m47022f();
        }
    }

    /* loaded from: classes4.dex */
    public static final class ErrorView extends RelativeLayout {

        /* renamed from: p */
        private final InterfaceC24854k f47087p;

        /* renamed from: q */
        private final InterfaceC24854k f47088q;

        /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView$ErrorView$a */
        /* loaded from: classes4.dex */
        static final class C8784a extends AbstractC19075u implements InterfaceC18494a {
            C8784a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AspectRatioImageView mo12V4() {
                return new AspectRatioImageView(ErrorView.this.getContext());
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView$ErrorView$b */
        /* loaded from: classes4.dex */
        static final class C8785b extends AbstractC19075u implements InterfaceC18494a {
            C8785b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RobotoTextView mo12V4() {
                Context context = ErrorView.this.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new RobotoTextView(context);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorView(Context context) {
            super(context);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            AbstractC19074t.m100208f(context, "context");
            m129210a = AbstractC24856m.m129210a(new C8784a());
            this.f47087p = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new C8785b());
            this.f47088q = m129210a2;
        }

        private final AspectRatioImageView getErrorIcon() {
            return (AspectRatioImageView) this.f47087p.getValue();
        }

        private final RobotoTextView getErrorMessage() {
            return (RobotoTextView) this.f47088q.getValue();
        }

        /* renamed from: a */
        public final void m47014a() {
            AspectRatioImageView errorIcon = getErrorIcon();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(24.0f), -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            errorIcon.setLayoutParams(layoutParams);
            errorIcon.setId(View.generateViewId());
            errorIcon.setImageResource(AbstractC16803z.ic_music_error_v2);
            errorIcon.setScaleOption(0);
            addView(getErrorIcon());
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_an_error_occurred_while_loading_the_song);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            RobotoTextView errorMessage = getErrorMessage();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.leftMargin = AbstractC23136l9.m118742r(8.0f);
            layoutParams2.addRule(1, getErrorIcon().getId());
            layoutParams2.addRule(15);
            errorMessage.setLayoutParams(layoutParams2);
            errorMessage.setId(View.generateViewId());
            errorMessage.setText(m118743r0);
            errorMessage.setTextSize(0, AbstractC23136l9.m118742r(14.0f));
            errorMessage.setTextColor(C23212s8.m119607o(errorMessage.getContext(), AbstractC16781w.TextColor6));
            errorMessage.setSingleLine();
            errorMessage.setEllipsize(TextUtils.TruncateAt.END);
            errorMessage.setSelected(true);
            addView(getErrorMessage());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(attributeSet, "attrs");
            m129210a = AbstractC24856m.m129210a(new C8784a());
            this.f47087p = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new C8785b());
            this.f47088q = m129210a2;
        }
    }

    /* loaded from: classes4.dex */
    public static final class DetailView extends RelativeLayout {

        /* renamed from: p */
        private final InterfaceC24854k f47078p;

        /* renamed from: q */
        private final InterfaceC24854k f47079q;

        /* renamed from: r */
        private final InterfaceC24854k f47080r;

        /* renamed from: s */
        private final ProgressBar f47081s;

        /* renamed from: t */
        private final InterfaceC24854k f47082t;

        /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView$DetailView$a */
        /* loaded from: classes4.dex */
        static final class C8780a extends AbstractC19075u implements InterfaceC18494a {
            C8780a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SlideShowSound mo12V4() {
                return new SlideShowSound(DetailView.this.getContext(), null);
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView$DetailView$b */
        /* loaded from: classes4.dex */
        static final class C8781b extends AbstractC19075u implements InterfaceC18494a {
            C8781b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RelativeLayout mo12V4() {
                return new RelativeLayout(DetailView.this.getContext());
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView$DetailView$c */
        /* loaded from: classes4.dex */
        static final class C8782c extends AbstractC19075u implements InterfaceC18494a {
            C8782c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AspectRatioImageView mo12V4() {
                return new AspectRatioImageView(DetailView.this.getContext());
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView$DetailView$d */
        /* loaded from: classes4.dex */
        static final class C8783d extends AbstractC19075u implements InterfaceC18494a {
            C8783d() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RobotoTextView mo12V4() {
                Context context = DetailView.this.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new RobotoTextView(context);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailView(Context context) {
            super(context);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            InterfaceC24854k m129210a4;
            AbstractC19074t.m100208f(context, "context");
            m129210a = AbstractC24856m.m129210a(new C8781b());
            this.f47078p = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new C8780a());
            this.f47079q = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(new C8782c());
            this.f47080r = m129210a3;
            this.f47081s = new ProgressBar(getContext());
            m129210a4 = AbstractC24856m.m129210a(new C8783d());
            this.f47082t = m129210a4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m47007c(InterfaceC23431j interfaceC23431j, InterfaceC21910a interfaceC21910a, View view) {
            AbstractC19074t.m100208f(interfaceC21910a, "$storyMusicData");
            if (interfaceC23431j != null) {
                interfaceC23431j.mo84702or(interfaceC21910a.mo46940d(), new SongInfo(interfaceC21910a.mo14159b(), interfaceC21910a.mo14160c().mo14227a(), interfaceC21910a.mo14161e().mo14188a()), interfaceC21910a.mo14160c().getState());
            }
        }

        private final SlideShowSound getAnimRhythm() {
            return (SlideShowSound) this.f47079q.getValue();
        }

        private final RelativeLayout getGroupIconThumb() {
            return (RelativeLayout) this.f47078p.getValue();
        }

        private final AspectRatioImageView getSongIconError() {
            return (AspectRatioImageView) this.f47080r.getValue();
        }

        private final RobotoTextView getSongTitle() {
            return (RobotoTextView) this.f47082t.getValue();
        }

        /* renamed from: b */
        public final void m47008b(final InterfaceC21910a interfaceC21910a, final InterfaceC23431j interfaceC23431j) {
            AbstractC19074t.m100208f(interfaceC21910a, "storyMusicData");
            String m135698d = C26361j.f125215a.m135698d(interfaceC21910a.mo14160c().mo14227a(), interfaceC21910a.mo14160c().mo14229c());
            if (!AbstractC19074t.m100204b(getSongTitle().getText(), m135698d)) {
                getSongTitle().setText(m135698d);
            }
            if (!interfaceC21910a.mo14158a().mo14385b()) {
                getSongTitle().setVisibility(0);
                getSongIconError().setVisibility(0);
                getAnimRhythm().setState(1);
                getAnimRhythm().setVisibility(8);
                this.f47081s.setVisibility(8);
            } else if (interfaceC21910a.mo14158a().mo14387d()) {
                getSongTitle().setVisibility(0);
                this.f47081s.setVisibility(0);
                getAnimRhythm().setState(1);
                getAnimRhythm().setVisibility(8);
                getSongIconError().setVisibility(8);
            } else if (interfaceC21910a.mo14158a().isPlaying()) {
                getSongTitle().setVisibility(0);
                getAnimRhythm().setVisibility(0);
                getAnimRhythm().setState(0);
                getSongIconError().setVisibility(8);
                this.f47081s.setVisibility(8);
            } else if (interfaceC21910a.mo14158a().mo14386c() == EnumC3057x2.f12360q) {
                getAnimRhythm().setVisibility(0);
                getAnimRhythm().setState(1);
                getSongIconError().setVisibility(8);
                this.f47081s.setVisibility(8);
            }
            getSongTitle().setOnClickListener(new View.OnClickListener() { // from class: mr.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StorySongInfoView.DetailView.m47007c(InterfaceC23431j.this, interfaceC21910a, view);
                }
            });
        }

        /* renamed from: d */
        public final void m47009d() {
            RelativeLayout groupIconThumb = getGroupIconThumb();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            groupIconThumb.setLayoutParams(layoutParams);
            groupIconThumb.setId(View.generateViewId());
            AspectRatioImageView songIconError = getSongIconError();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
            layoutParams2.addRule(13);
            songIconError.setLayoutParams(layoutParams2);
            songIconError.setImageResource(AbstractC16803z.ic_music_error_v2);
            songIconError.setScaleOption(0);
            songIconError.setVisibility(8);
            getGroupIconThumb().addView(getSongIconError());
            ProgressBar progressBar = this.f47081s;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
            layoutParams3.addRule(15);
            progressBar.setLayoutParams(layoutParams3);
            progressBar.setId(View.generateViewId());
            progressBar.setIndeterminate(true);
            progressBar.setIndeterminateDrawable(AbstractC23136l9.m118665N(progressBar.getContext(), AbstractC16803z.progress_bar_white_transparent));
            progressBar.setVisibility(0);
            getGroupIconThumb().addView(this.f47081s);
            SlideShowSound animRhythm = getAnimRhythm();
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
            layoutParams4.addRule(13);
            animRhythm.setLayoutParams(layoutParams4);
            animRhythm.setAnimX(0);
            animRhythm.setAnimWidth(AbstractC23136l9.m118742r(2.0f));
            animRhythm.m75887a(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
            animRhythm.setShadowPaintColor(637534208);
            animRhythm.setState(1);
            animRhythm.setVisibility(8);
            getGroupIconThumb().addView(getAnimRhythm());
            addView(getGroupIconThumb());
            RobotoTextView songTitle = getSongTitle();
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(124.0f), -2);
            layoutParams5.leftMargin = AbstractC23136l9.m118742r(4.0f);
            layoutParams5.addRule(1, getGroupIconThumb().getId());
            layoutParams5.addRule(15);
            songTitle.setLayoutParams(layoutParams5);
            songTitle.setMaxScaledTextSize(AbstractC23222t7.f112582r);
            songTitle.setTextSize(0, AbstractC23136l9.m118742r(14.0f));
            songTitle.setTextColor(C23212s8.m119607o(songTitle.getContext(), AbstractC16781w.TextColor6));
            songTitle.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            songTitle.setMarqueeRepeatLimit(-1);
            songTitle.setSingleLine();
            songTitle.setSelected(true);
            addView(getSongTitle());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            InterfaceC24854k m129210a4;
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(attributeSet, "attrs");
            m129210a = AbstractC24856m.m129210a(new C8781b());
            this.f47078p = m129210a;
            m129210a2 = AbstractC24856m.m129210a(new C8780a());
            this.f47079q = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(new C8782c());
            this.f47080r = m129210a3;
            this.f47081s = new ProgressBar(getContext());
            m129210a4 = AbstractC24856m.m129210a(new C8783d());
            this.f47082t = m129210a4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class LoadingView extends RelativeLayout {

        /* renamed from: p */
        private final InterfaceC24854k f47091p;

        /* renamed from: q */
        private final InterfaceC24854k f47092q;

        /* renamed from: r */
        private final InterfaceC24854k f47093r;

        /* renamed from: s */
        private final int[] f47094s;

        /* renamed from: t */
        private final RectF f47095t;

        /* renamed from: u */
        private final Matrix f47096u;

        /* renamed from: v */
        private final ProgressBar f47097v;

        /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView$LoadingView$a */
        /* loaded from: classes4.dex */
        static final class C8786a extends AbstractC19075u implements InterfaceC18494a {
            C8786a() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C16662u0 mo12V4() {
                Context context = LoadingView.this.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                return new C16662u0(context);
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView$LoadingView$b */
        /* loaded from: classes4.dex */
        static final class C8787b extends AbstractC19075u implements InterfaceC18494a {
            C8787b() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ModulesView mo12V4() {
                return new ModulesView(LoadingView.this.getContext());
            }
        }

        /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StorySongInfoView$LoadingView$c */
        /* loaded from: classes4.dex */
        static final class C8788c extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            public static final C8788c f47100q = new C8788c();

            C8788c() {
                super(0);
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List mo12V4() {
                return new ArrayList();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingView(Context context) {
            super(context);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            AbstractC19074t.m100208f(context, "context");
            m129210a = AbstractC24856m.m129210a(new C8787b());
            this.f47091p = m129210a;
            m129210a2 = AbstractC24856m.m129210a(C8788c.f47100q);
            this.f47092q = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(new C8786a());
            this.f47093r = m129210a3;
            this.f47094s = new int[2];
            this.f47095t = new RectF();
            this.f47096u = new Matrix();
            this.f47097v = new ProgressBar(getContext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m47018d(LoadingView loadingView, C16658t0 c16658t0, RectF rectF) {
            AbstractC19074t.m100208f(loadingView, "this$0");
            if (loadingView.getRootView() != null) {
                loadingView.getRootView().getLocationOnScreen(loadingView.f47094s);
                loadingView.f47095t.setEmpty();
                loadingView.f47096u.reset();
                Matrix matrix = loadingView.f47096u;
                int[] iArr = loadingView.f47094s;
                matrix.setTranslate(-iArr[0], -iArr[1]);
                loadingView.f47096u.mapRect(loadingView.f47095t, rectF);
                Iterator<C16666v0> it = loadingView.getSkeletonModules().iterator();
                while (it.hasNext()) {
                    it.next().m88810k1(loadingView.f47095t, loadingView.getShimmerHelper().m88776b());
                }
                if (!AbstractC20826v0.m108836t0(loadingView)) {
                    loadingView.m47022f();
                }
            }
        }

        private final C16658t0 getShimmerHelper() {
            return (C16658t0) this.f47093r.getValue();
        }

        private final ModulesView getSkeletonModuleView() {
            return (ModulesView) this.f47091p.getValue();
        }

        private final List<C16666v0> getSkeletonModules() {
            return (List) this.f47092q.getValue();
        }

        /* renamed from: b */
        public final void m47019b() {
            ProgressBar progressBar = this.f47097v;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            progressBar.setLayoutParams(layoutParams);
            progressBar.setId(View.generateViewId());
            progressBar.setIndeterminate(true);
            progressBar.setIndeterminateDrawable(AbstractC23136l9.m118665N(progressBar.getContext(), AbstractC16803z.progress_bar_white_transparent));
            addView(this.f47097v);
            ModulesView skeletonModuleView = getSkeletonModuleView();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(1, this.f47097v.getId());
            layoutParams2.addRule(15);
            layoutParams2.leftMargin = AbstractC23136l9.m118742r(8.0f);
            skeletonModuleView.setLayoutParams(layoutParams2);
            C16666v0 c16666v0 = new C16666v0(getContext());
            c16666v0.m89106L().m89027K(true).m89030N(AbstractC23136l9.m118742r(8.0f)).m89060k0(AbstractC23136l9.m118742r(160.0f)).m89073z(Boolean.TRUE);
            c16666v0.m88811l1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.white_20));
            c16666v0.m88807h1(AbstractC23136l9.m118742r(8.0f));
            getSkeletonModules().add(c16666v0);
            getSkeletonModuleView().mo69682M(getSkeletonModules());
            addView(getSkeletonModuleView());
            m47020c();
        }

        /* renamed from: c */
        public final void m47020c() {
            C16658t0.b bVar = new C16658t0.b() { // from class: mr.m
                @Override // com.zing.zalo.uicontrol.C16658t0.b
                /* renamed from: a */
                public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                    StorySongInfoView.LoadingView.m47018d(StorySongInfoView.LoadingView.this, c16658t0, rectF);
                }
            };
            Rect rect = new Rect();
            int m118722k0 = AbstractC23136l9.m118722k0();
            getShimmerHelper().m88783i(m118722k0);
            rect.set((-m118722k0) / 2, 0, AbstractC23136l9.m118722k0() + (m118722k0 / 2), AbstractC23136l9.m118713h0());
            getShimmerHelper().m88777c((int) (((m118722k0 / AbstractC23136l9.m118722k0()) + 1.0f) * IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING), 200);
            getShimmerHelper().m88778d(rect);
            getShimmerHelper().m88782h(bVar);
            getShimmerHelper().mo88784j();
            getShimmerHelper().m88780f(true);
        }

        /* renamed from: e */
        public final void m47021e() {
            getShimmerHelper().mo88784j();
        }

        /* renamed from: f */
        public final void m47022f() {
            getShimmerHelper().m88785k();
        }

        @Override // android.view.View
        public void setVisibility(int i11) {
            super.setVisibility(i11);
            if (i11 != 0) {
                getShimmerHelper().m88785k();
            } else {
                getShimmerHelper().mo88784j();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            InterfaceC24854k m129210a;
            InterfaceC24854k m129210a2;
            InterfaceC24854k m129210a3;
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(attributeSet, "attrs");
            m129210a = AbstractC24856m.m129210a(new C8787b());
            this.f47091p = m129210a;
            m129210a2 = AbstractC24856m.m129210a(C8788c.f47100q);
            this.f47092q = m129210a2;
            m129210a3 = AbstractC24856m.m129210a(new C8786a());
            this.f47093r = m129210a3;
            this.f47094s = new int[2];
            this.f47095t = new RectF();
            this.f47096u = new Matrix();
            this.f47097v = new ProgressBar(getContext());
        }
    }
}
