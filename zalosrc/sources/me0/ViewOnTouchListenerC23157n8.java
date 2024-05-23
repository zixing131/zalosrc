package me0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewPropertyAnimator;
import com.zing.zalo.MainApplication;
import mm0.AbstractC23350e;

/* renamed from: me0.n8 */
/* loaded from: classes4.dex */
public class ViewOnTouchListenerC23157n8 implements View.OnTouchListener {

    /* renamed from: p */
    private int f112298p;

    /* renamed from: q */
    private float f112299q;

    /* renamed from: r */
    private float f112300r;

    /* renamed from: s */
    private boolean f112301s;

    /* renamed from: t */
    private float f112302t;

    /* renamed from: u */
    private VelocityTracker f112303u;

    /* renamed from: v */
    private final c f112304v;

    /* renamed from: w */
    private float f112305w;

    /* renamed from: x */
    private boolean f112306x;

    /* renamed from: y */
    private int f112307y;

    /* renamed from: z */
    private static final int f112297z = ViewConfiguration.get(MainApplication.getAppContext()).getScaledTouchSlop();

    /* renamed from: A */
    private static final int f112296A = AbstractC23136l9.m118742r(150.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.n8$a */
    /* loaded from: classes4.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f112308p;

        a(View view) {
            this.f112308p = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ViewOnTouchListenerC23157n8.this.f112304v != null) {
                ViewOnTouchListenerC23157n8.this.f112304v.mo65453b();
            }
            this.f112308p.setTranslationX(0.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.n8$b */
    /* loaded from: classes4.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f112310p;

        b(View view) {
            this.f112310p = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (ViewOnTouchListenerC23157n8.this.f112304v != null) {
                ViewOnTouchListenerC23157n8.this.f112304v.mo65453b();
            }
            this.f112310p.setTranslationY(0.0f);
        }
    }

    /* renamed from: me0.n8$c */
    /* loaded from: classes4.dex */
    public static abstract class c {
        /* renamed from: a */
        public void mo65452a() {
        }

        /* renamed from: b */
        public abstract void mo65453b();

        /* renamed from: c */
        public void mo71518c() {
        }

        /* renamed from: d */
        public void mo65454d(float f11, boolean z11) {
        }
    }

    public ViewOnTouchListenerC23157n8(c cVar) {
        this.f112302t = 1.0f;
        this.f112305w = 1.5f;
        this.f112306x = true;
        this.f112307y = 1;
        this.f112304v = cVar;
    }

    /* renamed from: b */
    private void m119170b(View view) {
        if (view != null) {
            c cVar = this.f112304v;
            if (cVar != null) {
                cVar.mo65452a();
            }
            int i11 = this.f112307y;
            if (i11 == 1) {
                view.animate().translationX(0.0f).alpha(1.0f).setDuration(200L).setListener(null);
            } else if (i11 == 2 || i11 == 3 || i11 == 4) {
                view.animate().translationY(0.0f).alpha(1.0f).setDuration(200L).setListener(null);
            }
        }
    }

    /* renamed from: c */
    private void m119171c(View view) {
        if (view != null) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.f112303u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f112303u = null;
        }
        this.f112300r = 0.0f;
        this.f112299q = 0.0f;
        this.f112301s = false;
    }

    /* renamed from: d */
    private void m119172d(View view) {
        int i11;
        int i12;
        if (view != null) {
            long j11 = this.f112302t * 200.0f;
            int i13 = this.f112307y;
            if (i13 == 1) {
                ViewPropertyAnimator animate = view.animate();
                if (view.getTranslationX() > 0.0f) {
                    i12 = this.f112298p;
                } else {
                    i12 = -this.f112298p;
                }
                ViewPropertyAnimator alpha = animate.translationX(i12).alpha(0.0f);
                if (j11 < 0) {
                    j11 = 0;
                }
                alpha.setDuration(j11).setListener(new a(view));
                return;
            }
            if (i13 == 2 || i13 == 3 || i13 == 4) {
                ViewPropertyAnimator animate2 = view.animate();
                if (view.getTranslationY() > 0.0f) {
                    i11 = this.f112298p;
                } else {
                    i11 = -this.f112298p;
                }
                ViewPropertyAnimator alpha2 = animate2.translationY(i11).alpha(0.0f);
                if (j11 < 0) {
                    j11 = 0;
                }
                alpha2.setDuration(j11).setListener(new b(view));
            }
        }
    }

    /* renamed from: e */
    public boolean m119173e() {
        return this.f112301s;
    }

    /* renamed from: f */
    public void m119174f(boolean z11) {
        this.f112306x = z11;
    }

    /* renamed from: g */
    public void m119175g(float f11) {
        this.f112305w = f11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b9, code lost:            if (r1 > 0.0f) goto L46;     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean z12 = this.f112301s;
        try {
            int i11 = this.f112307y;
            if (i11 == 1) {
                this.f112298p = (int) (view.getWidth() * this.f112305w);
            } else if (i11 == 2 || i11 == 3 || i11 == 4) {
                this.f112298p = (int) (view.getHeight() * this.f112305w);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                float f11 = 0.0f;
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3 && this.f112303u != null) {
                            m119170b(view);
                            m119171c(view);
                            return z12;
                        }
                        return z12;
                    }
                    VelocityTracker velocityTracker = this.f112303u;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float x11 = motionEvent.getX() - this.f112299q;
                        float y11 = motionEvent.getY() - this.f112300r;
                        float abs = Math.abs(x11);
                        int i12 = f112297z;
                        if ((abs > i12 || Math.abs(y11) > i12) && !this.f112301s) {
                            c cVar = this.f112304v;
                            if (cVar != null) {
                                cVar.mo71518c();
                            }
                            this.f112301s = true;
                        }
                        if (this.f112301s) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                            int i13 = this.f112307y;
                            if (i13 == 1) {
                                view.setTranslationX(view.getTranslationX() + x11);
                                this.f112302t = 1.0f - (Math.abs(view.getTranslationX()) / this.f112298p);
                            } else if (i13 == 2 || i13 == 3 || i13 == 4) {
                                float translationY = view.getTranslationY() + y11;
                                int i14 = this.f112307y;
                                if (i14 != 4) {
                                    if (i14 == 3) {
                                        if (translationY < 0.0f) {
                                            f11 = translationY;
                                        }
                                        translationY = f11;
                                    }
                                }
                                view.setTranslationY(translationY);
                                this.f112302t = 1.0f - (Math.abs(view.getTranslationY()) / this.f112298p);
                            }
                            if (this.f112306x) {
                                view.setAlpha(this.f112302t);
                            }
                            c cVar2 = this.f112304v;
                            if (cVar2 != null) {
                                float f12 = this.f112302t;
                                if (Math.abs(view.getTranslationX()) >= this.f112298p / 2.0f) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                cVar2.mo65454d(f12, z11);
                            }
                            return true;
                        }
                        return z12;
                    }
                    return z12;
                }
                VelocityTracker velocityTracker2 = this.f112303u;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                    this.f112303u.computeCurrentVelocity(1000);
                    float xVelocity = this.f112303u.getXVelocity();
                    float abs2 = Math.abs(xVelocity);
                    float yVelocity = this.f112303u.getYVelocity();
                    float abs3 = Math.abs(yVelocity);
                    if (this.f112301s) {
                        if ((r10 = this.f112307y) == 1) {
                            m119170b(view);
                        } else {
                            m119170b(view);
                        }
                    }
                    m119171c(view);
                    return z12;
                }
                return z12;
            }
            this.f112299q = motionEvent.getX();
            this.f112300r = motionEvent.getY();
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f112303u = obtain;
            obtain.addMovement(motionEvent);
            this.f112302t = 1.0f;
            return z12;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return z12;
        }
    }

    public ViewOnTouchListenerC23157n8(c cVar, int i11) {
        this.f112302t = 1.0f;
        this.f112305w = 1.5f;
        this.f112306x = true;
        this.f112304v = cVar;
        this.f112307y = i11;
    }
}
