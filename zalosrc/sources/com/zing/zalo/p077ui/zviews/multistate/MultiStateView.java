package com.zing.zalo.p077ui.zviews.multistate;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC10919t;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.CircleImage;
import le0.AbstractC22459a;
import me0.AbstractC23006a0;
import me0.AbstractC23115k;
import me0.C23278z2;
import p193h0.AbstractC19694b;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;

/* loaded from: classes6.dex */
public class MultiStateView extends FrameLayout {

    /* renamed from: A */
    boolean f81185A;

    /* renamed from: B */
    View f81186B;

    /* renamed from: C */
    TextView f81187C;

    /* renamed from: D */
    public RecyclingImageView f81188D;

    /* renamed from: E */
    Button f81189E;

    /* renamed from: F */
    boolean f81190F;

    /* renamed from: G */
    View f81191G;

    /* renamed from: H */
    TextView f81192H;

    /* renamed from: I */
    Button f81193I;

    /* renamed from: J */
    RecyclingImageView f81194J;

    /* renamed from: K */
    boolean f81195K;

    /* renamed from: L */
    boolean f81196L;

    /* renamed from: M */
    boolean f81197M;

    /* renamed from: N */
    View f81198N;

    /* renamed from: O */
    CircleImage f81199O;

    /* renamed from: P */
    CircleImage f81200P;

    /* renamed from: Q */
    public TextView f81201Q;

    /* renamed from: R */
    Button f81202R;

    /* renamed from: S */
    public TextView f81203S;

    /* renamed from: T */
    View.OnClickListener f81204T;

    /* renamed from: U */
    InterfaceC15916g f81205U;

    /* renamed from: V */
    View.OnClickListener f81206V;

    /* renamed from: W */
    View.OnClickListener f81207W;

    /* renamed from: a0 */
    Handler f81208a0;

    /* renamed from: b0 */
    C23528a f81209b0;

    /* renamed from: c0 */
    View f81210c0;

    /* renamed from: d0 */
    boolean f81211d0;

    /* renamed from: e0 */
    View.OnClickListener f81212e0;

    /* renamed from: f0 */
    private InterfaceC15917h f81213f0;

    /* renamed from: p */
    final MultiStateViewData f81214p;

    /* renamed from: q */
    View f81215q;

    /* renamed from: r */
    View f81216r;

    /* renamed from: s */
    AppCompatImageView f81217s;

    /* renamed from: t */
    TextView f81218t;

    /* renamed from: u */
    Button f81219u;

    /* renamed from: v */
    boolean f81220v;

    /* renamed from: w */
    View f81221w;

    /* renamed from: x */
    ProgressBar f81222x;

    /* renamed from: y */
    TextView f81223y;

    /* renamed from: z */
    RelativeLayout.LayoutParams f81224z;

    /* loaded from: classes6.dex */
    public static class MultiStateViewData implements Parcelable {
        public static final Parcelable.Creator<MultiStateViewData> CREATOR = new C15908a();

        /* renamed from: A */
        public String f81225A;

        /* renamed from: B */
        public String f81226B;

        /* renamed from: C */
        public String f81227C;

        /* renamed from: D */
        public String f81228D;

        /* renamed from: E */
        public int f81229E;

        /* renamed from: F */
        public int f81230F;

        /* renamed from: G */
        public EnumC15914e f81231G;

        /* renamed from: p */
        public int f81232p;

        /* renamed from: q */
        public int f81233q;

        /* renamed from: r */
        public int f81234r;

        /* renamed from: s */
        public int f81235s;

        /* renamed from: t */
        public int f81236t;

        /* renamed from: u */
        public String f81237u;

        /* renamed from: v */
        public String f81238v;

        /* renamed from: w */
        public String f81239w;

        /* renamed from: x */
        public String f81240x;

        /* renamed from: y */
        public String f81241y;

        /* renamed from: z */
        public String f81242z;

        /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$MultiStateViewData$a */
        /* loaded from: classes6.dex */
        class C15908a implements Parcelable.Creator {
            C15908a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public MultiStateViewData createFromParcel(Parcel parcel) {
                return new MultiStateViewData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public MultiStateViewData[] newArray(int i11) {
                return new MultiStateViewData[i11];
            }
        }

        /* synthetic */ MultiStateViewData(Parcel parcel, AbstractC15919b abstractC15919b) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return super.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f81232p);
            parcel.writeInt(this.f81233q);
            parcel.writeInt(this.f81234r);
            parcel.writeInt(this.f81235s);
            parcel.writeInt(this.f81236t);
            parcel.writeString(this.f81237u);
            parcel.writeString(this.f81238v);
            parcel.writeString(this.f81239w);
            parcel.writeString(this.f81240x);
            parcel.writeString(this.f81241y);
            parcel.writeString(this.f81242z);
            parcel.writeString(this.f81225A);
            parcel.writeString(this.f81226B);
            parcel.writeString(this.f81227C);
            parcel.writeString(this.f81228D);
            parcel.writeInt(this.f81229E);
            parcel.writeInt(this.f81230F);
            parcel.writeString(this.f81231G.name());
        }

        public MultiStateViewData(EnumC15914e enumC15914e) {
            this.f81231G = enumC15914e;
        }

        private MultiStateViewData(Parcel parcel) {
            this.f81232p = parcel.readInt();
            this.f81233q = parcel.readInt();
            this.f81234r = parcel.readInt();
            this.f81235s = parcel.readInt();
            this.f81236t = parcel.readInt();
            this.f81237u = parcel.readString();
            this.f81238v = parcel.readString();
            this.f81239w = parcel.readString();
            this.f81240x = parcel.readString();
            this.f81241y = parcel.readString();
            this.f81242z = parcel.readString();
            this.f81225A = parcel.readString();
            this.f81226B = parcel.readString();
            this.f81227C = parcel.readString();
            this.f81228D = parcel.readString();
            this.f81229E = parcel.readInt();
            this.f81230F = parcel.readInt();
            this.f81231G = EnumC15914e.valueOf(parcel.readString());
        }
    }

    /* loaded from: classes6.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15909a();

        /* renamed from: p */
        MultiStateViewData f81243p;

        /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$SavedState$a */
        /* loaded from: classes6.dex */
        class C15909a implements Parcelable.Creator {
            C15909a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, AbstractC15920c abstractC15920c) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeParcelable(this.f81243p, i11);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f81243p = (MultiStateViewData) parcel.readParcelable(MultiStateViewData.class.getClassLoader());
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$a */
    /* loaded from: classes6.dex */
    public class ViewOnClickListenerC15910a implements View.OnClickListener {
        ViewOnClickListenerC15910a() {
        }

        /* renamed from: b */
        public /* synthetic */ void m87372b() {
            InterfaceC15916g interfaceC15916g = MultiStateView.this.f81205U;
            if (interfaceC15916g != null) {
                interfaceC15916g.mo12138a();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                MultiStateView multiStateView = MultiStateView.this;
                if (multiStateView.f81205U != null) {
                    multiStateView.setVisibility(0);
                    MultiStateView.this.setState(EnumC15914e.LOADING);
                    MultiStateView multiStateView2 = MultiStateView.this;
                    if (multiStateView2.f81208a0 == null) {
                        multiStateView2.f81208a0 = new Handler(Looper.getMainLooper());
                    }
                    MultiStateView.this.f81208a0.postDelayed(new Runnable() { // from class: com.zing.zalo.ui.zviews.multistate.a
                        public /* synthetic */ RunnableC15918a() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            MultiStateView.ViewOnClickListenerC15910a.this.m87372b();
                        }
                    }, 300L);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$b */
    /* loaded from: classes6.dex */
    class C15911b extends C23999j {
        C15911b() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            try {
                if (c3979l != null) {
                    MultiStateView.this.f81194J.setImageInfo(c3979l);
                    MultiStateView.this.f81194J.setVisibility(0);
                } else {
                    MultiStateView.this.f81194J.setVisibility(8);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$c */
    /* loaded from: classes6.dex */
    public class C15912c extends C23999j {
        C15912c() {
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    MultiStateView.this.f81188D.setImageInfo(c3979l);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$d */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C15913d {

        /* renamed from: a */
        static final /* synthetic */ int[] f81247a;

        /* renamed from: b */
        static final /* synthetic */ int[] f81248b;

        static {
            int[] iArr = new int[EnumC15915f.values().length];
            f81248b = iArr;
            try {
                iArr[EnumC15915f.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81248b[EnumC15915f.SERVER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81248b[EnumC15915f.DELETED_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81248b[EnumC15915f.UNKNOWN_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81248b[EnumC15915f.NEARBY_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81248b[EnumC15915f.USER_PREVIEW_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[EnumC15914e.values().length];
            f81247a = iArr2;
            try {
                iArr2[EnumC15914e.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f81247a[EnumC15914e.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f81247a[EnumC15914e.CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f81247a[EnumC15914e.EMPTY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f81247a[EnumC15914e.FULL_EMPTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f81247a[EnumC15914e.MUTUAL_EMPTY.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$e */
    /* loaded from: classes6.dex */
    public enum EnumC15914e {
        CONTENT(0),
        LOADING(1),
        ERROR(2),
        EMPTY(3),
        FULL_EMPTY(4),
        MUTUAL_EMPTY(5);


        /* renamed from: w */
        private static final SparseArray f81255w = new SparseArray();

        /* renamed from: p */
        public final int f81257p;

        static {
            for (EnumC15914e enumC15914e : values()) {
                f81255w.put(enumC15914e.f81257p, enumC15914e);
            }
        }

        EnumC15914e(int i11) {
            this.f81257p = i11;
        }

        /* renamed from: c */
        public static EnumC15914e m87374c(int i11) {
            if (i11 >= 0) {
                return (EnumC15914e) f81255w.get(i11);
            }
            return null;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$f */
    /* loaded from: classes6.dex */
    public enum EnumC15915f {
        NETWORK_ERROR(101),
        SERVER_ERROR(102),
        UNKNOWN_ERROR(104),
        NON_ERROR(105),
        DELETED_ERROR(106),
        NEARBY_ERROR(107),
        USER_PREVIEW_ERROR(108);


        /* renamed from: x */
        private static final SparseArray f81265x = new SparseArray();

        /* renamed from: p */
        public final int f81267p;

        static {
            for (EnumC15915f enumC15915f : values()) {
                f81265x.put(enumC15915f.f81267p, enumC15915f);
            }
        }

        EnumC15915f(int i11) {
            this.f81267p = i11;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$g */
    /* loaded from: classes6.dex */
    public interface InterfaceC15916g {
        /* renamed from: a */
        void mo12138a();
    }

    /* renamed from: com.zing.zalo.ui.zviews.multistate.MultiStateView$h */
    /* loaded from: classes6.dex */
    public interface InterfaceC15917h {
        /* renamed from: a */
        void mo87280a(int i11);
    }

    public MultiStateView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m87359a(View view) {
        View view2 = this.f81215q;
        if (view2 != null && view2 != view) {
            throw new IllegalStateException("Can't add more than one view to MultiStateView");
        }
        setContentView(view);
    }

    /* renamed from: b */
    private static int m87360b(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }

    /* renamed from: c */
    private static int m87361c(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: e */
    private static boolean m87362e(Context context) {
        int m87360b = m87360b(context);
        if (m87360b != 120 && m87360b != 160 && m87361c(context) > 480) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private boolean m87363f(View view) {
        return view == this.f81221w || view == this.f81216r || view == this.f81186B || view == this.f81191G || view == this.f81198N;
    }

    private int getEmptyImageResourceId() {
        return this.f81214p.f81230F;
    }

    private int getFullEmptyResourceId() {
        return this.f81214p.f81229E;
    }

    private void setState(int i11) {
        setState(EnumC15914e.m87374c(i11));
    }

    private void setViewState(MultiStateViewData multiStateViewData) {
        setTapToRetryString(multiStateViewData.f81241y);
        setErrorTitleString(multiStateViewData.f81240x);
        setLoadingString(multiStateViewData.f81242z);
        setEmptyViewString(multiStateViewData.f81225A);
        setFullEmptyRecommendString(multiStateViewData.f81227C);
        setBtnFullEmptyString(multiStateViewData.f81228D);
        setFullEmptyImageResourceId(multiStateViewData.f81229E);
        setEmptyImageResourceId(multiStateViewData.f81230F);
        setErrorLayoutResourceId(multiStateViewData.f81233q);
        setLoadingLayoutResourceId(multiStateViewData.f81232p);
        setEmptyLayoutResourceId(multiStateViewData.f81234r);
        setFullEmptyLayoutResourceId(multiStateViewData.f81235s);
        setMutualEmptyLayoutResourceId(multiStateViewData.f81236t);
        setStatusMutualEmpty(multiStateViewData.f81237u);
        setBtnShareMutualEmpty(multiStateViewData.f81238v);
        setNoticeMutualEmpty(multiStateViewData.f81239w);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (!m87363f(view)) {
            m87359a(view);
        }
        super.addView(view);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i11) {
        View view;
        if (!super.canScrollVertically(i11) && (getState() != EnumC15914e.CONTENT || (view = this.f81215q) == null || !view.canScrollVertically(i11))) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public View m87364d(EnumC15914e enumC15914e) {
        if (enumC15914e == null) {
            return null;
        }
        switch (C15913d.f81247a[enumC15914e.ordinal()]) {
            case 1:
                return getErrorView();
            case 2:
                return getLoadingView();
            case 3:
                return getContentView();
            case 4:
                return getEmptyView();
            case 5:
                return getFullEmptyView();
            case 6:
                return getMutualEmptyView();
            default:
                return null;
        }
    }

    /* renamed from: g */
    void m87365g(Context context, AttributeSet attributeSet) {
        this.f81208a0 = new Handler(Looper.getMainLooper());
        this.f81209b0 = new C23528a(context);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC8923h0.MultiStateView, 0, 0);
        try {
            setLoadingLayoutResourceId(obtainStyledAttributes.getResourceId(AbstractC8923h0.MultiStateView_msvLoadingLayout, AbstractC7409c0.layout_loading));
            setErrorLayoutResourceId(obtainStyledAttributes.getResourceId(AbstractC8923h0.MultiStateView_msvErrorLayout, AbstractC7409c0.layout_error));
            setEmptyLayoutResourceId(obtainStyledAttributes.getResourceId(AbstractC8923h0.MultiStateView_msvEmptyLayout, AbstractC7409c0.layout_empty));
            setFullEmptyLayoutResourceId(obtainStyledAttributes.getResourceId(AbstractC8923h0.MultiStateView_msvFullEmptyLayout, AbstractC7409c0.layout_fullscreen_empty));
            setMutualEmptyLayoutResourceId(obtainStyledAttributes.getResourceId(AbstractC8923h0.MultiStateView_msvMutualEmptyLayout, AbstractC7409c0.layout_mutual_feed_empty));
            String string = obtainStyledAttributes.getString(AbstractC8923h0.MultiStateView_msvErrorTitleStringId);
            if (string == null) {
                string = context.getString(AbstractC8020f0.unknown_error);
            }
            setErrorTitleString(string);
            String string2 = obtainStyledAttributes.getString(AbstractC8923h0.MultiStateView_msvLoadingStringId);
            if (string2 == null) {
                string2 = context.getString(AbstractC8020f0.loading);
            }
            setLoadingString(string2);
            String string3 = obtainStyledAttributes.getString(AbstractC8923h0.MultiStateView_msvEmptyStringId);
            if (string3 == null) {
                string3 = context.getString(AbstractC8020f0.str_empty);
            }
            setEmptyViewString(string3);
            setFullEmptyRecommendString(context.getString(AbstractC8020f0.str_intro_des_lib));
            setBtnFullEmptyString(context.getString(AbstractC8020f0.str_start_lib));
            String string4 = obtainStyledAttributes.getString(AbstractC8923h0.MultiStateView_msvErrorTapToRetryStringId);
            if (string4 == null) {
                string4 = context.getString(AbstractC8020f0.tap_to_retry);
            }
            setTapToRetryString(string4);
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    String getBtnEmptyString() {
        return this.f81214p.f81226B;
    }

    String getBtnFullEmptyString() {
        return this.f81214p.f81228D;
    }

    String getBtnShareMutualString() {
        return this.f81214p.f81238v;
    }

    public Button getButtonRetry() {
        return this.f81219u;
    }

    public View getContentView() {
        return this.f81215q;
    }

    int getEmptyLayoutResourceId() {
        return this.f81214p.f81234r;
    }

    public View getEmptyView() {
        try {
            if (this.f81186B == null) {
                View inflate = View.inflate(getContext(), this.f81214p.f81234r, null);
                this.f81186B = inflate;
                if (this.f81187C == null) {
                    TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tvEmpty);
                    this.f81187C = textView;
                    textView.setText(getEmptyViewString());
                }
                int i11 = 8;
                if (this.f81188D == null) {
                    this.f81188D = (RecyclingImageView) this.f81186B.findViewById(AbstractC6918a0.imvEmpty);
                    if (m87362e(getContext())) {
                        this.f81188D.setVisibility(8);
                    }
                    if (getEmptyImageResourceId() != 0) {
                        this.f81188D.setImageDrawable(AbstractC19694b.m103336d(getContext(), getEmptyImageResourceId()));
                    }
                }
                if (this.f81189E == null) {
                    Button button = (Button) this.f81186B.findViewById(AbstractC6918a0.btnEmpty);
                    this.f81189E = button;
                    if (this.f81190F) {
                        i11 = 0;
                    }
                    button.setVisibility(i11);
                    this.f81189E.setText(getBtnEmptyString());
                    this.f81189E.setOnClickListener(this.f81206V);
                }
                addView(this.f81186B);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f81186B;
    }

    String getEmptyViewString() {
        return this.f81214p.f81225A;
    }

    int getErrorLayoutResourceId() {
        return this.f81214p.f81233q;
    }

    String getErrorTitleString() {
        return this.f81214p.f81240x;
    }

    public View getErrorView() {
        int i11;
        try {
            if (this.f81216r == null) {
                View inflate = View.inflate(getContext(), this.f81214p.f81233q, null);
                this.f81216r = inflate;
                if (this.f81217s == null) {
                    AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(AbstractC6918a0.image_error);
                    this.f81217s = appCompatImageView;
                    if (this.f81220v) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    appCompatImageView.setVisibility(i11);
                }
                if (this.f81218t == null) {
                    TextView textView = (TextView) this.f81216r.findViewById(AbstractC6918a0.error_title);
                    this.f81218t = textView;
                    textView.setText(getErrorTitleString());
                }
                if (this.f81219u == null) {
                    Button button = (Button) this.f81216r.findViewById(AbstractC6918a0.btn_refresh);
                    this.f81219u = button;
                    button.setText(getTapToRetryString());
                    this.f81219u.setOnClickListener(this.f81212e0);
                }
                addView(this.f81216r);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f81216r;
    }

    int getFullEmptyLayoutResourceId() {
        return this.f81214p.f81235s;
    }

    String getFullEmptyRecommendString() {
        return this.f81214p.f81227C;
    }

    public View getFullEmptyView() {
        int i11;
        int i12;
        try {
            if (this.f81191G == null) {
                View inflate = View.inflate(getContext(), this.f81214p.f81235s, null);
                this.f81191G = inflate;
                int i13 = 8;
                if (this.f81192H == null) {
                    TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_recommend);
                    this.f81192H = textView;
                    textView.setText(getFullEmptyRecommendString());
                    TextView textView2 = this.f81192H;
                    if (this.f81195K) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    textView2.setVisibility(i12);
                }
                if (this.f81193I == null) {
                    Button button = (Button) this.f81191G.findViewById(AbstractC6918a0.btnFullEmpty);
                    this.f81193I = button;
                    button.setText(getBtnFullEmptyString());
                    Button button2 = this.f81193I;
                    if (this.f81196L) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    button2.setVisibility(i11);
                }
                if (this.f81194J == null) {
                    RecyclingImageView recyclingImageView = (RecyclingImageView) this.f81191G.findViewById(AbstractC6918a0.imv_fullscreen_empty);
                    this.f81194J = recyclingImageView;
                    if (this.f81197M) {
                        i13 = 0;
                    }
                    recyclingImageView.setVisibility(i13);
                }
                this.f81193I.setOnClickListener(this.f81204T);
                addView(this.f81191G);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f81191G;
    }

    public CircleImage getImvFriendAvatar() {
        return this.f81200P;
    }

    public View getLastItemSuggestView() {
        View view = this.f81186B;
        if (view != null && this.f81210c0 == null) {
            this.f81210c0 = view.findViewById(AbstractC6918a0.last_suggest_item);
        }
        return this.f81210c0;
    }

    public int getLoadingLayoutResourceId() {
        return this.f81214p.f81232p;
    }

    String getLoadingString() {
        return this.f81214p.f81242z;
    }

    public View getLoadingView() {
        int i11;
        try {
            if (this.f81221w == null) {
                View inflate = View.inflate(getContext(), this.f81214p.f81232p, null);
                this.f81221w = inflate;
                if (this.f81223y == null) {
                    this.f81223y = (TextView) inflate.findViewById(AbstractC6918a0.progress_text);
                }
                TextView textView = this.f81223y;
                if (textView != null) {
                    textView.setText(getLoadingString());
                    TextView textView2 = this.f81223y;
                    if (this.f81185A) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    textView2.setVisibility(i11);
                }
                if (this.f81222x == null) {
                    ProgressBar progressBar = (ProgressBar) this.f81221w.findViewById(AbstractC6918a0.holoCircularProgressBar);
                    this.f81222x = progressBar;
                    RelativeLayout.LayoutParams layoutParams = this.f81224z;
                    if (layoutParams != null) {
                        progressBar.setLayoutParams(layoutParams);
                    }
                }
                addView(this.f81221w);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f81221w;
    }

    int getMutualEmptyLayoutResourceId() {
        return this.f81214p.f81236t;
    }

    public View getMutualEmptyView() {
        try {
            if (this.f81198N == null) {
                View inflate = View.inflate(getContext(), this.f81214p.f81236t, null);
                this.f81198N = inflate;
                if (this.f81199O == null) {
                    CircleImage circleImage = (CircleImage) inflate.findViewById(AbstractC6918a0.avt_mine);
                    this.f81199O = circleImage;
                    circleImage.setEnableRoundPadding(true);
                    this.f81199O.m87723j(AbstractC22459a.m116119a(getContext(), AbstractC16781w.stroke_shared_timeline_avatar_color), 255);
                }
                if (this.f81200P == null) {
                    CircleImage circleImage2 = (CircleImage) this.f81198N.findViewById(AbstractC6918a0.avt_friend);
                    this.f81200P = circleImage2;
                    circleImage2.setEnableRoundPadding(true);
                    this.f81200P.m87723j(AbstractC22459a.m116119a(getContext(), AbstractC16781w.stroke_shared_timeline_avatar_color), 255);
                }
                if (this.f81201Q == null) {
                    TextView textView = (TextView) this.f81198N.findViewById(AbstractC6918a0.tv_status_mutual_empty);
                    this.f81201Q = textView;
                    textView.setText(getStatusMutualString());
                }
                if (this.f81202R == null) {
                    Button button = (Button) this.f81198N.findViewById(AbstractC6918a0.btn_share_mutual_empty);
                    this.f81202R = button;
                    button.setText(getBtnShareMutualString());
                    this.f81202R.setOnClickListener(this.f81207W);
                }
                if (this.f81203S == null) {
                    TextView textView2 = (TextView) this.f81198N.findViewById(AbstractC6918a0.tv_notice_mutual_empty);
                    this.f81203S = textView2;
                    textView2.setText(getNoticeMutualString());
                }
                addView(this.f81198N);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f81198N;
    }

    String getNoticeMutualString() {
        return this.f81214p.f81239w;
    }

    public EnumC15914e getState() {
        EnumC15914e enumC15914e = this.f81214p.f81231G;
        if (enumC15914e == null) {
            return EnumC15914e.CONTENT;
        }
        return enumC15914e;
    }

    String getStatusMutualString() {
        return this.f81214p.f81237u;
    }

    public String getTapToRetryString() {
        return this.f81214p.f81241y;
    }

    public TextView getTvError() {
        return this.f81218t;
    }

    /* renamed from: h */
    public void m87366h(int i11, int i12, int i13, int i14) {
        try {
            Button button = this.f81189E;
            if (button != null) {
                button.setPadding(i11, i12, i13, i14);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            parcelable = ((SavedState) parcelable).getSuperState();
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f81243p = this.f81214p;
        return savedState;
    }

    public void setBtnEmptyString(String str) {
        try {
            this.f81214p.f81226B = str;
            Button button = this.f81189E;
            if (button != null) {
                button.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setBtnFullEmptyString(String str) {
        try {
            this.f81214p.f81228D = str;
            Button button = this.f81193I;
            if (button != null) {
                button.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setBtnShareMutualEmpty(String str) {
        try {
            this.f81214p.f81238v = str;
            Button button = this.f81202R;
            if (button != null) {
                button.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setCallbackVisibilityChange(InterfaceC15917h interfaceC15917h) {
        this.f81213f0 = interfaceC15917h;
    }

    public void setContentView(View view) {
        this.f81215q = view;
        setState(this.f81214p.f81231G);
    }

    public void setEmptyImageResourceId(int i11) {
        try {
            this.f81214p.f81230F = i11;
            RecyclingImageView recyclingImageView = this.f81188D;
            if (recyclingImageView != null) {
                recyclingImageView.setImageResource(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setEmptyImageUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                C15912c c15912c = new C15912c();
                c15912c.m125762H1(AbstractC23006a0.f111912c);
                ((C23528a) this.f81209b0.m123612r(this.f81188D)).m123583G(str, C23278z2.m120086O().f116275p, C23278z2.m120086O().f116276q, 0, 0, AbstractC19694b.m103336d(getContext(), AbstractC16803z.im_empty_list), c15912c, C23278z2.m120086O().f116266g);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setEmptyLayoutResourceId(int i11) {
        this.f81214p.f81234r = i11;
    }

    public void setEmptyOnClickListener(View.OnClickListener onClickListener) {
        this.f81206V = onClickListener;
        Button button = this.f81189E;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public void setEmptyViewString(String str) {
        try {
            this.f81214p.f81225A = str;
            TextView textView = this.f81187C;
            if (textView != null) {
                textView.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setEnableBtnEmpty(boolean z11) {
        this.f81190F = z11;
    }

    public void setEnableBtnFullEmpty(boolean z11) {
        this.f81196L = z11;
    }

    public void setEnableImageErrorView(boolean z11) {
        this.f81220v = z11;
    }

    public void setEnableImageFullEmpty(boolean z11) {
        this.f81197M = z11;
    }

    public void setEnableLoadingText(boolean z11) {
        this.f81185A = z11;
    }

    public void setEnableRecommend(boolean z11) {
        this.f81195K = z11;
    }

    public void setEnableSwapStateAnim(boolean z11) {
        this.f81211d0 = z11;
    }

    public void setErrorImageResource(int i11) {
        AppCompatImageView appCompatImageView = this.f81217s;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i11);
        }
    }

    public void setErrorLayoutResourceId(int i11) {
        this.f81214p.f81233q = i11;
    }

    public void setErrorTitleColor(int i11) {
        try {
            TextView textView = this.f81218t;
            if (textView != null) {
                textView.setTextColor(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setErrorTitleSize(int i11) {
        try {
            TextView textView = this.f81218t;
            if (textView != null) {
                textView.setTextSize(0, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setErrorTitleString(String str) {
        try {
            this.f81214p.f81240x = str;
            TextView textView = this.f81218t;
            if (textView != null) {
                textView.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setErrorType(EnumC15915f enumC15915f) {
        boolean z11;
        int i11;
        try {
            if (this.f81216r == null) {
                getErrorView();
            }
            if (this.f81217s == null) {
                this.f81217s = (AppCompatImageView) this.f81216r.findViewById(AbstractC6918a0.image_error);
            }
            if (this.f81218t == null) {
                TextView textView = (TextView) this.f81216r.findViewById(AbstractC6918a0.error_title);
                this.f81218t = textView;
                textView.setText(getErrorTitleString());
            }
            int i12 = 0;
            if (enumC15915f == EnumC15915f.DELETED_ERROR) {
                z11 = true;
            } else {
                z11 = false;
            }
            Button button = this.f81219u;
            if (button != null) {
                if (z11) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                button.setVisibility(i11);
            }
            AppCompatImageView appCompatImageView = this.f81217s;
            if (appCompatImageView != null) {
                if (!this.f81220v) {
                    i12 = 8;
                }
                appCompatImageView.setVisibility(i12);
            }
            if (m87362e(getContext())) {
                this.f81217s.setVisibility(8);
            }
            switch (C15913d.f81248b[enumC15915f.ordinal()]) {
                case 1:
                    this.f81217s.setImageDrawable(AbstractC19694b.m103336d(getContext(), AbstractC16803z.im_connect));
                    return;
                case 2:
                case 3:
                case 4:
                    this.f81217s.setImageResource(AbstractC16803z.im_servererror);
                    return;
                case 5:
                case 6:
                    this.f81217s.setImageResource(AbstractC16803z.im_nearby_error);
                    return;
                default:
                    return;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setFriendAvatarImageUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                ((C23528a) this.f81209b0.m123612r(this.f81200P)).m123618x(str, C23278z2.m120145o());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setFullEmptyBtnOnClickListener(View.OnClickListener onClickListener) {
        this.f81204T = onClickListener;
        Button button = this.f81193I;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    public void setFullEmptyImageResourceId(int i11) {
        try {
            this.f81214p.f81229E = i11;
            RecyclingImageView recyclingImageView = this.f81194J;
            if (recyclingImageView != null) {
                recyclingImageView.setImageResource(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setFullEmptyImageUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                ((C23528a) this.f81209b0.m123612r(this.f81194J)).m123579C(str, C23278z2.m120117c0(), new C15911b().m125762H1(AbstractC23006a0.f111912c));
            } else {
                this.f81194J.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    void setFullEmptyLayoutResourceId(int i11) {
        this.f81214p.f81235s = i11;
    }

    public void setFullEmptyRecommendString(String str) {
        try {
            this.f81214p.f81227C = str;
            TextView textView = this.f81192H;
            if (textView != null) {
                textView.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setLayoutParamsPbLoading(RelativeLayout.LayoutParams layoutParams) {
        this.f81224z = layoutParams;
        ProgressBar progressBar = this.f81222x;
        if (progressBar != null) {
            progressBar.setLayoutParams(layoutParams);
        }
    }

    public void setLoadingLayoutResourceId(int i11) {
        this.f81214p.f81232p = i11;
    }

    public void setLoadingString(String str) {
        try {
            this.f81214p.f81242z = str;
            TextView textView = this.f81223y;
            if (textView != null) {
                textView.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setMineAvatarImageUrl(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                ((C23528a) this.f81209b0.m123612r(this.f81199O)).m123618x(str, C23278z2.m120145o());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setMutualEmptyBtnClickListener(View.OnClickListener onClickListener) {
        this.f81207W = onClickListener;
        Button button = this.f81202R;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
    }

    void setMutualEmptyLayoutResourceId(int i11) {
        this.f81214p.f81236t = i11;
    }

    public void setNoticeMutualEmpty(String str) {
        try {
            this.f81214p.f81239w = str;
            TextView textView = this.f81203S;
            if (textView != null) {
                textView.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setOnTapToRetryListener(InterfaceC15916g interfaceC15916g) {
        this.f81205U = interfaceC15916g;
    }

    public void setStatusMutualEmpty(String str) {
        try {
            this.f81214p.f81237u = str;
            TextView textView = this.f81201Q;
            if (textView != null) {
                textView.setText(str);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setTapToRetryString(String str) {
        this.f81214p.f81241y = str;
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        InterfaceC15917h interfaceC15917h = this.f81213f0;
        if (interfaceC15917h != null) {
            interfaceC15917h.mo87280a(i11);
        }
    }

    public void setVisibilityLoadingText(int i11) {
        TextView textView = this.f81223y;
        if (textView != null) {
            textView.setVisibility(i11);
        }
    }

    public void setVisibleBtnFullEmpty(int i11) {
        Button button = this.f81193I;
        if (button != null) {
            button.setVisibility(i11);
        }
    }

    public void setVisibleErrorImage(int i11) {
        AppCompatImageView appCompatImageView = this.f81217s;
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(i11);
        }
    }

    public MultiStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setState(EnumC15914e enumC15914e) {
        try {
            EnumC15914e enumC15914e2 = this.f81214p.f81231G;
            if (enumC15914e == enumC15914e2) {
                return;
            }
            View m87364d = m87364d(enumC15914e2);
            if (m87364d != null) {
                if (this.f81211d0) {
                    if (m87364d.getVisibility() == 0) {
                        AbstractC23115k.m118570a(m87364d, AbstractC10919t.fadeout);
                    }
                } else {
                    m87364d.setVisibility(8);
                }
            }
            View m87364d2 = m87364d(enumC15914e);
            if (m87364d2 != null) {
                if (this.f81211d0) {
                    AbstractC23115k.m118571b(m87364d2, AbstractC10919t.fadein);
                } else {
                    m87364d2.setVisibility(0);
                }
            }
            this.f81214p.f81231G = enumC15914e;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public MultiStateView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f81214p = new MultiStateViewData(EnumC15914e.CONTENT);
        this.f81220v = true;
        this.f81185A = false;
        this.f81190F = false;
        this.f81195K = false;
        this.f81196L = false;
        this.f81197M = false;
        this.f81211d0 = true;
        this.f81212e0 = new ViewOnClickListenerC15910a();
        m87365g(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11) {
        if (!m87363f(view)) {
            m87359a(view);
        }
        super.addView(view, i11);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (!m87363f(view)) {
            m87359a(view);
        }
        super.addView(view, i11, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, int i12) {
        if (!m87363f(view)) {
            m87359a(view);
        }
        super.addView(view, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (!m87363f(view)) {
            m87359a(view);
        }
        super.addView(view, layoutParams);
    }
}
