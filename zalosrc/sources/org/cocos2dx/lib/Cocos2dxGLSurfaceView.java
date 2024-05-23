package org.cocos2dx.lib;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;

@TargetApi(8)
/* loaded from: classes7.dex */
public class Cocos2dxGLSurfaceView extends GLSurfaceView {
    private static final int HANDLER_CLOSE_IME_KEYBOARD = 3;
    private static final int HANDLER_OPEN_IME_KEYBOARD = 2;
    private static final String TAG = "Cocos2dxGLSurfaceView";
    Cocos2dxRenderer mCocos2dxRenderer;
    private boolean mSoftKeyboardShown;

    public Cocos2dxGLSurfaceView(Context context) {
        super(context);
        this.mSoftKeyboardShown = false;
        initView();
    }

    private static void dumpMotionEvent(MotionEvent motionEvent) {
        StringBuilder sb2 = new StringBuilder();
        int action = motionEvent.getAction();
        int i11 = action & 255;
        sb2.append("event ACTION_");
        sb2.append(new String[]{"DOWN", "UP", "MOVE", "CANCEL", "OUTSIDE", "POINTER_DOWN", "POINTER_UP", "7?", "8?", "9?"}[i11]);
        if (i11 == 5 || i11 == 6) {
            sb2.append("(pid ");
            sb2.append(action >> 8);
            sb2.append(")");
        }
        sb2.append("[");
        int i12 = 0;
        while (i12 < motionEvent.getPointerCount()) {
            sb2.append("#");
            sb2.append(i12);
            sb2.append("(pid ");
            sb2.append(motionEvent.getPointerId(i12));
            sb2.append(")=");
            sb2.append((int) motionEvent.getX(i12));
            sb2.append(",");
            sb2.append((int) motionEvent.getY(i12));
            i12++;
            if (i12 < motionEvent.getPointerCount()) {
                sb2.append(";");
            }
        }
        sb2.append("]");
    }

    private String getContentText() {
        return this.mCocos2dxRenderer.getContentText();
    }

    public void deleteBackward() {
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.11
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleDeleteBackward();
            }
        });
    }

    protected void initView() {
        setEGLContextClientVersion(2);
        setFocusableInTouchMode(true);
    }

    public void insertText(final String str) {
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.10
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleInsertText(str);
            }
        });
    }

    public boolean isSoftKeyboardShown() {
        return this.mSoftKeyboardShown;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(final int i11, KeyEvent keyEvent) {
        if (i11 != 66 && i11 != 82 && i11 != 85) {
            switch (i11) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    return super.onKeyDown(i11, keyEvent);
            }
        }
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.8
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleKeyDown(i11);
            }
        });
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(final int i11, KeyEvent keyEvent) {
        if (i11 != 66 && i11 != 82 && i11 != 85) {
            switch (i11) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    return super.onKeyUp(i11, keyEvent);
            }
        }
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.9
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleKeyUp(i11);
            }
        });
        return true;
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.1
            @Override // java.lang.Runnable
            public void run() {
                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleOnPause();
            }
        });
        setRenderMode(0);
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        setRenderMode(1);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (!isInEditMode()) {
            this.mCocos2dxRenderer.setScreenWidthAndHeight(i11, i12);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        final int[] iArr = new int[pointerCount];
        final float[] fArr = new float[pointerCount];
        final float[] fArr2 = new float[pointerCount];
        if (this.mSoftKeyboardShown) {
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(((Activity) getContext()).getCurrentFocus().getWindowToken(), 0);
            requestFocus();
            this.mSoftKeyboardShown = false;
        }
        for (int i11 = 0; i11 < pointerCount; i11++) {
            iArr[i11] = motionEvent.getPointerId(i11);
            fArr[i11] = motionEvent.getX(i11);
            fArr2[i11] = motionEvent.getY(i11);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = motionEvent.getAction() >> 8;
                                final int pointerId = motionEvent.getPointerId(action2);
                                final float x11 = motionEvent.getX(action2);
                                final float y11 = motionEvent.getY(action2);
                                queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.5
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionUp(pointerId, x11, y11);
                                    }
                                });
                                Cocos2dxRenderer.dismissEffectActive = 1;
                            }
                        } else {
                            int action3 = motionEvent.getAction() >> 8;
                            final int pointerId2 = motionEvent.getPointerId(action3);
                            final float x12 = motionEvent.getX(action3);
                            final float y12 = motionEvent.getY(action3);
                            queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionDown(pointerId2, x12, y12);
                                }
                            });
                            Cocos2dxRenderer.dismissEffectActive = 1;
                        }
                    } else {
                        queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.7
                            @Override // java.lang.Runnable
                            public void run() {
                                Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionCancel(iArr, fArr, fArr2);
                            }
                        });
                    }
                } else {
                    queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.4
                        @Override // java.lang.Runnable
                        public void run() {
                            Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionMove(iArr, fArr, fArr2);
                        }
                    });
                    Cocos2dxRenderer.dismissEffectActive = 1;
                }
            } else {
                final int pointerId3 = motionEvent.getPointerId(0);
                final float f11 = fArr[0];
                final float f12 = fArr2[0];
                queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.6
                    @Override // java.lang.Runnable
                    public void run() {
                        Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionUp(pointerId3, f11, f12);
                    }
                });
                Cocos2dxRenderer.dismissEffectActive = 1;
            }
        } else {
            final int pointerId4 = motionEvent.getPointerId(0);
            final float f13 = fArr[0];
            final float f14 = fArr2[0];
            queueEvent(new Runnable() { // from class: org.cocos2dx.lib.Cocos2dxGLSurfaceView.3
                @Override // java.lang.Runnable
                public void run() {
                    Cocos2dxGLSurfaceView.this.mCocos2dxRenderer.handleActionDown(pointerId4, f13, f14);
                }
            });
            Cocos2dxRenderer.dismissEffectActive = 1;
        }
        return true;
    }

    public void setCocos2dxRenderer(Cocos2dxRenderer cocos2dxRenderer) {
        this.mCocos2dxRenderer = cocos2dxRenderer;
        setRenderer(cocos2dxRenderer);
    }

    public void setSoftKeyboardShown(boolean z11) {
        this.mSoftKeyboardShown = z11;
    }

    public Cocos2dxGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSoftKeyboardShown = false;
        initView();
    }
}
