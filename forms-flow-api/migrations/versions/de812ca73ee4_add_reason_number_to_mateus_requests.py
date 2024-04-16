"""Add reason number to mateus requests

Revision ID: de812ca73ee4
Revises: 7ae6387645b5
Create Date: 2024-02-13 07:55:22.171711

"""
from alembic import op
import sqlalchemy as sa


# revision identifiers, used by Alembic.
revision = 'de812ca73ee4'
down_revision = '7ae6387645b5'
branch_labels = None
depends_on = None


def upgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.add_column('mateus_payment_request', sa.Column('reason', sa.String(), nullable=True))
    # ### end Alembic commands ###


def downgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.drop_column('mateus_payment_request', 'reason')
    # ### end Alembic commands ###