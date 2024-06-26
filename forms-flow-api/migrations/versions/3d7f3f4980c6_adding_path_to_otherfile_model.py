"""Adding path to OtherFile model

Revision ID: 3d7f3f4980c6
Revises: 03938eea39ab
Create Date: 2024-01-29 12:44:58.492682

"""
from alembic import op
import sqlalchemy as sa


# revision identifiers, used by Alembic.
revision = '3d7f3f4980c6'
down_revision = '03938eea39ab'
branch_labels = None
depends_on = None


def upgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.add_column('other_file', sa.Column('path', sa.String(), nullable=True))
    # ### end Alembic commands ###


def downgrade():
    # ### commands auto generated by Alembic - please adjust! ###
    op.drop_column('other_file', 'path')
    # ### end Alembic commands ###