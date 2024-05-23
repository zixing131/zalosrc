package db0;

import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: db0.a */
/* loaded from: classes6.dex */
public abstract class AbstractC17865a implements AbsListView.OnScrollListener {

    /* renamed from: p */
    private float f90305p = 0.0f;

    /* renamed from: q */
    private float f90306q = 0.0f;

    /* renamed from: r */
    private boolean f90307r = false;

    /* renamed from: s */
    private boolean f90308s = false;

    /* renamed from: t */
    private final int f90309t = 3;

    /* renamed from: u */
    private int f90310u;

    /* renamed from: a */
    public int m94387a() {
        return this.f90310u;
    }

    /* renamed from: b */
    public boolean m94388b(ListView listView, MotionEvent motionEvent) {
        try {
            motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                        }
                    } else if (listView.getAdapter() != null) {
                        float y11 = motionEvent.getY();
                        if (this.f90306q == 0.0f) {
                            this.f90306q = y11;
                        }
                        if (this.f90305p == 0.0f) {
                            this.f90305p = y11;
                        }
                        if (!this.f90307r && !this.f90308s) {
                            float f11 = this.f90306q;
                            if (y11 > f11) {
                                this.f90308s = false;
                                this.f90307r = true;
                            } else if (y11 < f11) {
                                this.f90308s = true;
                                this.f90307r = false;
                            }
                        }
                        float f12 = this.f90306q;
                        if (y11 > f12) {
                            if (this.f90308s && !this.f90307r) {
                                this.f90305p = y11;
                                this.f90308s = false;
                                this.f90307r = true;
                            }
                        } else if (y11 < f12 && this.f90307r && !this.f90308s) {
                            this.f90305p = y11;
                            this.f90308s = true;
                            this.f90307r = false;
                        }
                        float f13 = y11 - this.f90305p;
                        if (f13 > 3.0f) {
                            mo80863d(1, f13);
                            this.f90305p = y11;
                            this.f90308s = false;
                            this.f90307r = false;
                        } else if (f13 < -3.0f) {
                            mo80863d(2, f13);
                            this.f90305p = y11;
                            this.f90308s = false;
                            this.f90307r = false;
                        }
                        this.f90306q = y11;
                    }
                }
                this.f90305p = 0.0f;
                this.f90306q = 0.0f;
                this.f90307r = false;
                this.f90308s = false;
                m94391f();
            } else {
                this.f90305p = 0.0f;
                this.f90306q = 0.0f;
                this.f90307r = false;
                this.f90308s = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: c */
    public boolean m94389c(RecyclerView recyclerView, MotionEvent motionEvent) {
        try {
            motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action != 3) {
                        }
                    } else if (recyclerView.getAdapter() != null) {
                        float y11 = motionEvent.getY();
                        if (this.f90306q == 0.0f) {
                            this.f90306q = y11;
                        }
                        if (this.f90305p == 0.0f) {
                            this.f90305p = y11;
                        }
                        if (!this.f90307r && !this.f90308s) {
                            float f11 = this.f90306q;
                            if (y11 > f11) {
                                this.f90308s = false;
                                this.f90307r = true;
                            } else if (y11 < f11) {
                                this.f90308s = true;
                                this.f90307r = false;
                            }
                        }
                        float f12 = this.f90306q;
                        if (y11 > f12) {
                            if (this.f90308s && !this.f90307r) {
                                this.f90305p = y11;
                                this.f90308s = false;
                                this.f90307r = true;
                            }
                        } else if (y11 < f12 && this.f90307r && !this.f90308s) {
                            this.f90305p = y11;
                            this.f90308s = true;
                            this.f90307r = false;
                        }
                        float f13 = y11 - this.f90305p;
                        if (f13 > 3.0f) {
                            mo80863d(1, f13);
                            this.f90305p = y11;
                            this.f90308s = false;
                            this.f90307r = false;
                        } else if (f13 < -3.0f) {
                            mo80863d(2, f13);
                            this.f90305p = y11;
                            this.f90308s = false;
                            this.f90307r = false;
                        }
                        this.f90306q = y11;
                    }
                }
                this.f90305p = 0.0f;
                this.f90306q = 0.0f;
                this.f90307r = false;
                this.f90308s = false;
            } else {
                this.f90305p = 0.0f;
                this.f90306q = 0.0f;
                this.f90307r = false;
                this.f90308s = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return false;
    }

    /* renamed from: d */
    protected abstract void mo80863d(int i11, float f11);

    /* renamed from: e */
    public void m94390e(RecyclerView recyclerView, int i11) {
        this.f90310u = i11;
    }

    /* renamed from: f */
    protected void m94391f() {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i11, int i12, int i13) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i11) {
        this.f90310u = i11;
    }
}
