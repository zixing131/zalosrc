package com.google.android.flexbox;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements InterfaceC4003a, RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: x */
    private static final Rect f15839x = new Rect();

    /* renamed from: p */
    private int f15840p;

    /* renamed from: q */
    private int f15841q;

    /* renamed from: r */
    private int f15842r;

    /* renamed from: s */
    private List f15843s;

    /* renamed from: t */
    private RecyclerView.Recycler f15844t;

    /* renamed from: u */
    private RecyclerView.State f15845u;

    /* renamed from: v */
    private SparseArray f15846v;

    /* renamed from: w */
    private View f15847w;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C4000a();

        /* renamed from: p */
        private float f15848p;

        /* renamed from: q */
        private float f15849q;

        /* renamed from: r */
        private int f15850r;

        /* renamed from: s */
        private float f15851s;

        /* renamed from: t */
        private int f15852t;

        /* renamed from: u */
        private int f15853u;

        /* renamed from: v */
        private int f15854v;

        /* renamed from: w */
        private int f15855w;

        /* renamed from: x */
        private boolean f15856x;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$LayoutParams$a */
        /* loaded from: classes2.dex */
        static class C4000a implements Parcelable.Creator {
            C4000a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i11) {
                return new LayoutParams[i11];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f15848p = 0.0f;
            this.f15849q = 1.0f;
            this.f15850r = -1;
            this.f15851s = -1.0f;
            this.f15854v = 16777215;
            this.f15855w = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: A */
        public int mo18910A() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: E */
        public float mo18911E() {
            return this.f15848p;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: G */
        public float mo18912G() {
            return this.f15851s;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: L */
        public boolean mo18913L() {
            return this.f15856x;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: P */
        public int mo18914P() {
            return this.f15854v;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: c0 */
        public int mo18915c0() {
            return this.bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: d0 */
        public int mo18916d0() {
            return this.leftMargin;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: r */
        public int mo18917r() {
            return this.f15850r;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: s */
        public float mo18918s() {
            return this.f15849q;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: s0 */
        public int mo18919s0() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: v */
        public int mo18920v() {
            return this.f15852t;
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: w0 */
        public int mo18921w0() {
            return this.f15853u;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeFloat(this.f15848p);
            parcel.writeFloat(this.f15849q);
            parcel.writeInt(this.f15850r);
            parcel.writeFloat(this.f15851s);
            parcel.writeInt(this.f15852t);
            parcel.writeInt(this.f15853u);
            parcel.writeInt(this.f15854v);
            parcel.writeInt(this.f15855w);
            parcel.writeByte(this.f15856x ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        @Override // com.google.android.flexbox.FlexItem
        /* renamed from: y0 */
        public int mo18922y0() {
            return this.f15855w;
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.f15848p = 0.0f;
            this.f15849q = 1.0f;
            this.f15850r = -1;
            this.f15851s = -1.0f;
            this.f15854v = 16777215;
            this.f15855w = 16777215;
            this.f15848p = parcel.readFloat();
            this.f15849q = parcel.readFloat();
            this.f15850r = parcel.readInt();
            this.f15851s = parcel.readFloat();
            this.f15852t = parcel.readInt();
            this.f15853u = parcel.readInt();
            this.f15854v = parcel.readInt();
            this.f15855w = parcel.readInt();
            this.f15856x = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4001a();

        /* renamed from: p */
        private int f15857p;

        /* renamed from: q */
        private int f15858q;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$SavedState$a */
        /* loaded from: classes2.dex */
        static class C4001a implements Parcelable.Creator {
            C4001a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f15857p + ", mAnchorOffset=" + this.f15858q + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f15857p);
            parcel.writeInt(this.f15858q);
        }

        private SavedState(Parcel parcel) {
            this.f15857p = parcel.readInt();
            this.f15858q = parcel.readInt();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: a */
    public void mo18938a(View view, int i11, int i12, C4004b c4004b) {
        calculateItemDecorationsForChild(view, f15839x);
        if (mo18947j()) {
            int leftDecorationWidth = getLeftDecorationWidth(view) + getRightDecorationWidth(view);
            c4004b.f15863e += leftDecorationWidth;
            c4004b.f15864f += leftDecorationWidth;
        } else {
            int topDecorationHeight = getTopDecorationHeight(view) + getBottomDecorationHeight(view);
            c4004b.f15863e += topDecorationHeight;
            c4004b.f15864f += topDecorationHeight;
        }
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: b */
    public int mo18939b(int i11, int i12, int i13) {
        return getChildMeasureSpec(getWidth(), getWidthMode(), i12, i13, m18952k());
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: c */
    public View mo18940c(int i11) {
        View view = (View) this.f15846v.get(i11);
        if (view != null) {
            return view;
        }
        return this.f15844t.getViewForPosition(i11);
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: d */
    public int mo18941d(int i11, int i12, int i13) {
        return getChildMeasureSpec(getHeight(), getHeightMode(), i12, i13, m18953l());
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: e */
    public int mo18942e(View view) {
        int leftDecorationWidth;
        int rightDecorationWidth;
        if (mo18947j()) {
            leftDecorationWidth = getTopDecorationHeight(view);
            rightDecorationWidth = getBottomDecorationHeight(view);
        } else {
            leftDecorationWidth = getLeftDecorationWidth(view);
            rightDecorationWidth = getRightDecorationWidth(view);
        }
        return leftDecorationWidth + rightDecorationWidth;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: f */
    public void mo18943f(C4004b c4004b) {
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: g */
    public View mo18944g(int i11) {
        return mo18940c(i11);
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getAlignItems() {
        return this.f15842r;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getFlexDirection() {
        return this.f15840p;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getFlexItemCount() {
        return this.f15845u.getItemCount();
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public List getFlexLinesInternal() {
        return this.f15843s;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getFlexWrap() {
        return this.f15841q;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getLargestMainSize() {
        if (this.f15843s.size() == 0) {
            return 0;
        }
        int size = this.f15843s.size();
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = Math.max(i11, ((C4004b) this.f15843s.get(i12)).f15863e);
        }
        return i11;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public int getSumOfCrossSize() {
        int size = this.f15843s.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += ((C4004b) this.f15843s.get(i12)).f15865g;
        }
        return i11;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: h */
    public void mo18945h(int i11, View view) {
        this.f15846v.put(i11, view);
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: i */
    public int mo18946i(View view, int i11, int i12) {
        int topDecorationHeight;
        int bottomDecorationHeight;
        if (mo18947j()) {
            topDecorationHeight = getLeftDecorationWidth(view);
            bottomDecorationHeight = getRightDecorationWidth(view);
        } else {
            topDecorationHeight = getTopDecorationHeight(view);
            bottomDecorationHeight = getBottomDecorationHeight(view);
        }
        return topDecorationHeight + bottomDecorationHeight;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    /* renamed from: j */
    public boolean mo18947j() {
        int i11 = this.f15840p;
        return i11 == 0 || i11 == 1;
    }

    /* renamed from: k */
    public boolean m18952k() {
        if (mo18947j() && getWidth() <= this.f15847w.getWidth()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean m18953l() {
        if (!mo18947j() && getHeight() <= this.f15847w.getHeight()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.flexbox.InterfaceC4003a
    public void setFlexLines(List list) {
        this.f15843s = list;
    }
}
